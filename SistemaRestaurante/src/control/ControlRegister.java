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
		if(modelRegister.getNome().isEmpty() || modelRegister.getUsername().isEmpty() ||
				modelRegister.getPassword().isEmpty() || modelRegister.getPergunta().isEmpty() ||
				modelRegister.getResposta().isEmpty()){
			return false;
			
		}else {
			String sql = "insert into usuarios (nome_login, nickname, senha, pergunta, resposta, nivelpermissao) values ('"+
					modelRegister.getNome() + "','" + modelRegister.getUsername() + "','" + modelRegister.getPassword() + 
					"','" + modelRegister.getPergunta() +"','" + modelRegister.getResposta()+"','0');";
			try {
				stmt = con.prepareStatement(sql);
				rs = stmt.executeQuery();
			    
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally{
				ConnectionFactory.closeConnection(con, stmt, rs);
			}
			return true;
		}
	}
}
