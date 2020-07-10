package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.ConnectionFactory;
import model.ModelRecuperaSenha;

public class RecuperaSenhaDAO {
	Connection con = new ConnectionFactory().getConnection();
	PreparedStatement stmt = null;
	ResultSet rs = null;
	
	public String returnPergunta(ModelRecuperaSenha model) {
		String pergunta;
		String sql = "select * from usuarios where nickname = ?;";
		
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, model.getUsuario());
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

	public String validResposta(ModelRecuperaSenha model) {
		String sql = "select * from usuarios where nickname = ?;";
		
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, model.getUsuario());
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				if(rs.getString("resposta").equals(model.getResposta())) {
					
					String senha = rs.getString("senha");
					return senha;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
		return null;
	}
}
