package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.ConnectionFactory;
import model.ModelAlterarSenha;

public class AlterarSenhaDAO {
	Connection con = new ConnectionFactory().getConnection();
	PreparedStatement stmt = null;
	ResultSet rs = null;
	
	public boolean updatePass(ModelAlterarSenha model) {
		String sql = "update usuarios set senha = ? where nickname = ?;";
		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, model.getSenha());
			stmt.setString(2, model.getUsuario());
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
