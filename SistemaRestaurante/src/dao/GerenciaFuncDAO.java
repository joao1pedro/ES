package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import connection.ConnectionFactory;
import model.ModelGerenciaFunc;

public class GerenciaFuncDAO {
	public boolean validaRegistro(ModelGerenciaFunc model){
		Connection con = new ConnectionFactory().getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		if(model.getNome().isEmpty() || model.getUsername().isEmpty() ||
				model.getPassword().isEmpty() || model.getPergunta().isEmpty() ||
				model.getResposta().isEmpty()){
			return false;
			
		}else {
			String sql = "insert into usuarios (nome_login, nickname, senha, pergunta, resposta, nivelpermissao, endereco, nascimento, pais, bairro, numero, cidade) values ('"+model.getNome()+
					"','"+model.getUsername()+"','"+model.getPassword()+"','"+model.getPergunta()+"','"+model.getResposta()+"','0','"+model.getEndereco()+
					"',STR_TO_DATE('"+model.getNascimento()+"',\"%d/%m/%Y\"),'"+model.getPais()+"','"+model.getBairro()+"','"+model.getNumero()+"','"+model.getCidade()+"');";
			JOptionPane.showMessageDialog(null, sql);
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
	    String sql = "select * from usuarios where nickname = ?;";
	    try{
	        stmt = con.prepareStatement(sql);
	        stmt.setString(1, model.getUsername());
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
			String sql = "delete from usuarios where nickname = ?;";
			try {
				stmt = con.prepareStatement(sql);
				stmt.setString(1, model.getUsername());
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
		
		Integer value = Integer.valueOf(model.getPermissao());
		Integer number = Integer.valueOf(model.getNumero());
		
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
		else if(!model.getUsername().isEmpty() && !model.getNascimento().isEmpty()) {
			sql = "update usuarios set nascimento = '" + model.getNascimento() +
					"' where nickname = '"+ model.getUsername()+ "';";
		}
		else if(!model.getUsername().isEmpty() && !model.getPais().isEmpty()) {
			sql = "update usuarios set pais = '" + model.getPais() +
					"' where nickname = '"+ model.getUsername()+ "';";
		}
		else if(!model.getUsername().isEmpty() && !model.getCidade().isEmpty()) {
			sql = "update usuarios set cidade = '" + model.getCidade() +
					"' where nickname = '"+ model.getUsername()+ "';";
		}
		else if(!model.getUsername().isEmpty() && !model.getBairro().isEmpty()) {
			sql = "update usuarios set bairro = '" + model.getBairro() +
					"' where nickname = '"+ model.getUsername()+ "';";
		}
		else if(!model.getUsername().isEmpty() && !model.getEndereco().isEmpty()) {
			sql = "update usuarios set endereco = '" + model.getEndereco() +
					"' where nickname = '"+ model.getUsername()+ "';";
		}
		else if(!model.getUsername().isEmpty() && number!=null) {
			sql = "update usuarios set numero = '" + model.getNumero() +
					"' where nickname = '"+ model.getUsername()+ "';";
		}
		else if(!model.getUsername().isEmpty() && value!=null) {
			sql = "update usuarios set nivelpermissao = '" + model.getPermissao() +
					"' where nickname = '"+ model.getUsername()+ "';";
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
	public boolean verificaPermissao(ModelGerenciaFunc model){
		Connection con = new ConnectionFactory().getConnection();
		ResultSet rs = null;
		PreparedStatement stmt = null;
	    String sql = "select * from usuarios where nickname = ?;";
	    try{
	        stmt = con.prepareStatement(sql);
	        stmt.setString(1, model.getUsername());
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
