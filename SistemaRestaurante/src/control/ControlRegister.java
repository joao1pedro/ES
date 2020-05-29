package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.ConnectionFactory;
import model.ModelRegister;

public class ControlRegister {
	Connection con = new ConnectionFactory().getConnection();
	PreparedStatement stmt = null;
	ResultSet rs = null;
	
	public boolean validaRegistro(ModelRegister modelRegister){
		if(modelRegister.getNome()!=null && 
				modelRegister.getUsername() !=null && modelRegister.getPassword()!=null &&
					modelRegister.getPergunta()!=null &&
				modelRegister.getResposta()!= null){
			String sql = "insert into usuarios (nome_login, nickname, senha, pergunta, resposta, nivelpermissao) values ('"+
				modelRegister.getNome() + "','" + modelRegister.getUsername() + "','" + modelRegister.getPassword() + 
				"','" + modelRegister.getPergunta() +"','" + modelRegister.getResposta()+"','0');";
			
			try {
				stmt = con.prepareStatement(sql);
				rs = stmt.executeQuery();
				
				rs.close();
			    stmt.close();
			    con.close();
			    
			    return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}
}
