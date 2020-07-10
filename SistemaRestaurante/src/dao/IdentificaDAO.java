package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.ConnectionFactory;
import model.ModelIdentifica;

public class IdentificaDAO {
	Connection con = new ConnectionFactory().getConnection();
	PreparedStatement stmt = null;
	ResultSet rs = null;
	
	public boolean confirma(ModelIdentifica model) {
		if(model.getUsuario()!=null &&  model.getUsuario().length()>0 && model.getSenha()!=null && model.getSenha().length()>0) {
			String sql = "select * from usuarios where nickname = ? and senha = ?;"; 
			try {
				stmt = con.prepareStatement(sql);
				stmt.setString(1, model.getUsuario());
				stmt.setString(2, model.getSenha());
				rs = stmt.executeQuery();
				
				while (rs.next()) {
					return true;
			    }
				return false;
			} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					ConnectionFactory.closeConnection(con, stmt, rs);
				}
		}
		return false;
	}
}
