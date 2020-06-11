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
		
		/*
		 * POR AGORA SÓ FUNCIONANDO
		 * CASO UM CAMPO SEJA EDITADO POR VEZ
		 * */
		if(!model.getUsername().isEmpty() && (!model.getNome().isEmpty())) {
			sql = "update usuarios set nome_login = '" + model.getNome() +
					"' where nickname = '"+ model.getUsername()+ "';";
		}
		else if(!model.getUsername().isEmpty() && !model.getPergunta().isEmpty()) {
			sql = "update usuarios set pergunta = '" + model.getPergunta() +
					"' where nickname = '"+ model.getUsername()+ "';";
		}
		else if(!model.getUsername().isEmpty() && !model.getResposta().isEmpty()) {
			sql = "update usuarios set resposta = '" + model.getResposta() +
					"' where nickname = '"+ model.getUsername()+ "';";
		}
		else if(!model.getUsername().isEmpty() && !model.getPergunta().isEmpty() &&
				!model.getNome().isEmpty()
				) {
			sql = "update usuarios set nome_login = '" + model.getNome() + "', pergunta = '" 
				+model.getPergunta()+ "' where nickname = '"+ model.getUsername() +"';";
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
	public boolean verificaPermissao(String usuario){
		Connection con = new ConnectionFactory().getConnection();
		ResultSet rs = null;
		PreparedStatement stmt = null;
	    String sql = "select * from usuarios where nickname = '"+ usuario +"';";
	    try{
	        stmt = con.prepareStatement(sql);
	        rs = stmt.executeQuery();
	        
	        while(rs.next()) {
	        	if(rs.getInt("nivelpermissao") == 1){
		        	return true;
		        }
	        }
	    } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
		return false;
	}
}