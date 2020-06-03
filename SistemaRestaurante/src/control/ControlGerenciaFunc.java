package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import connection.ConnectionFactory;
import model.ModelGerenciaFunc;

public class ControlGerenciaFunc {
	public boolean validaRegistro(ModelGerenciaFunc model){
		Connection con = new ConnectionFactory().getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		if(model.getNome().isEmpty() || model.getUsername().isEmpty() ||
				model.getPassword().isEmpty() || model.getPergunta().isEmpty() ||
				model.getResposta().isEmpty()){
			return false;
			
		}else {
			String sql = "insert into usuarios (nome_login, nickname, senha, pergunta, resposta, nivelpermissao) values ('"+
					model.getNome() + "','" + model.getUsername() + "','" + model.getPassword() + 
					"','" + model.getPergunta() +"','" + model.getResposta()+"','0');";
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
	public boolean verificaUsuario(ModelGerenciaFunc model){
		Connection con = new ConnectionFactory().getConnection();
		ResultSet rs = null;
		PreparedStatement stmt = null;
	    String sql = "select * from usuarios where nickname = '"+ model.getUsername() +"';";
	    try{
	        stmt = con.prepareStatement(sql);
	        rs = stmt.executeQuery();
	        if(rs.next()){
	        	return true;
	        } else{
	        	JOptionPane.showMessageDialog(null, "Usuário não encontrado.");
	        }
	    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
		return false;
	}
	public boolean removeFunc(ModelGerenciaFunc model){
		Connection con = new ConnectionFactory().getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		if(model.getUsername()!=null && model.getUsername()!="") {
			String sql = "delete from usuarios where nickname = '" + model.getUsername() + "';";
			try {
				stmt = con.prepareStatement(sql);
				rs = stmt.executeQuery();
				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				ConnectionFactory.closeConnection(con, stmt, rs);
			}
		}
		return false;
	}
	public boolean editarFunc(ModelGerenciaFunc model) {
		Connection con = new ConnectionFactory().getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = null;
		if(model.getUsername()!=null && model.getUsername()!="" &&
				model.getNome()!=null && model.getNome()!="") {
			sql = "update usuarios set nome_login = '" + model.getNome() +"' where nickname = '"+ model.getUsername()+ "';";
		}
		else if (model.getUsername()!=null && model.getUsername()!="" &&
				model.getPergunta()!=null && model.getPergunta()!="") {
			sql = "update usuarios set pergunta = '" + model.getPergunta() +"' where nickname = '"+ model.getUsername()+ "';";
		}else if (model.getUsername()!=null && model.getUsername()!="" &&
				model.getResposta()!=null && model.getResposta()!="") {
			sql = "update usuarios set resposta = '" + model.getResposta() +"' where nickname = '"+ model.getUsername()+ "';";
		}
		else if(model.getUsername()!=null && model.getUsername()!="" &&
				model.getPassword()!=null && model.getPassword()!="") {
			sql = "update usuarios set senha = '" + model.getPassword() +"' where nickname = '"+ model.getUsername()+ "';";
		}else if(model.getUsername()!=null && model.getUsername()!="" &&
				model.getPassword()!=null && model.getPassword()!="" &&
				model.getNome()!=null && model.getNome()!="" &&
				model.getPergunta()!=null && model.getPergunta()!="" &&
				model.getResposta()!=null && model.getResposta()!="") {
			sql = "update usuarios set nome_login = '" + model.getNome() + ", senha = '"+
				model.getPassword()+"'" + ", pergunta = '" + model.getPergunta()+ "'" +
				", resposta = '" + model.getResposta() +"'"
					+"' where nickname = '"+ model.getUsername()+ "';";
		}else if(model.getUsername()!=null && model.getUsername()!="" &&
				model.getPassword()!=null && model.getPassword()!="" &&
				model.getNome()!=null && model.getNome()!="" &&
				model.getPergunta()!=null && model.getPergunta()!="") {
			sql = "update usuarios set nome_login = '" + model.getNome() + ", senha = '"+
					model.getPassword()+"'" + ", pergunta = '" + model.getPergunta()+ "'" 
					+"' where nickname = '"+ model.getUsername()+ "';";
		}else if(model.getUsername()!=null && model.getUsername()!="" &&
				model.getPassword()!=null && model.getPassword()!="" &&
				model.getNome()!=null && model.getNome()!="") {
			sql = "update usuarios set nome_login = '" + model.getNome() + ", senha = '"+
					model.getPassword()+"'" + ", pergunta = '"  
					+"' where nickname = '"+ model.getUsername()+ "';";
		}
		try {
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
		return false;
	}
}