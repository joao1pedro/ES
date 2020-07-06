package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import connection.ConnectionFactory;
import model.ModelRecuperaSenha;

public class ControlRecuperaSenha {
	Connection con = new ConnectionFactory().getConnection();
	PreparedStatement stmt = null;
	ResultSet rs = null;
	ModelRecuperaSenha recuperar = new ModelRecuperaSenha();
	
	
	public String returnPergunta(ModelRecuperaSenha mod) {
		String pergunta;
		String sql = "select * from usuarios where nickname = '" + mod.getUsuario() + "';";
		
		try {
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
			
				pergunta = rs.getString("pergunta");
				return pergunta;
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return null;
	}


	public boolean validResposta(ModelRecuperaSenha mod) {
		String senha;
		String sql = "select * from usuarios where nickname = '" + mod.getUsuario() + "';";
		
		try {
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				if(rs.getString("resposta").equals(mod.getResposta())) {
					senha = rs.getString("senha");
				    
				    JOptionPane.showMessageDialog(null, "Sua senha é: " + senha);
					return true;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
		return false;
	}
	public boolean updatePass(ModelRecuperaSenha mod) {
		String sql = "update usuarios set senha = '" + mod.getSenha() + "' where nickname = '" + mod.getUsuario() + "';";
		try {
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
		return false;
	}
}
