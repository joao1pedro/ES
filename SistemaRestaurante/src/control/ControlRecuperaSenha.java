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
	
	
	public String returnPergunta(ModelRecuperaSenha modUser) {
		String pergunta;
		String sql = "select * from usuarios where nickname = '" + modUser.getUsuario() + "';";
		
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
			JOptionPane.showMessageDialog(null, "Usuário não encontrado!" + e);
			
		}
		return null;
	}


	public boolean validResposta(ModelRecuperaSenha modSenha) {
		String senha;
		String sql = "select * from usuarios where nickname = '" + modSenha.getUsuario() + "';";
		
		try {
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				if(rs.getString("resposta").equals(modSenha.getResposta())) {
					senha = rs.getString("senha");
					
					/*
					 * fecha conexão com o banco
					 * 
					*/
					rs.close();
				    stmt.close();
				    con.close();
				    
				    JOptionPane.showMessageDialog(null, "Sua senha é: " + senha);
					return true;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro " + e);
		}
		return false;
	}
}
