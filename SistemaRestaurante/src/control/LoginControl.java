package control;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.ConnectionFactory;
import model.LoginModel;

public class LoginControl {
	//conectando
	Connection con = new ConnectionFactory().getConnection();
	PreparedStatement stmt = null;
	ResultSet rs = null;
	
	public boolean validLogin(LoginModel modelLogin) {
		if(modelLogin.getLogin()!=null && modelLogin.getLogin()!="") {
			String sql = "select * from usuarios where nickname = '" + modelLogin.getLogin() + "' and senha = '" + modelLogin.getSenha() + "';";	
			try {
				stmt = con.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery();
				
				while (rs.next()) {
					if((rs.getString("nickname")==modelLogin.getLogin()) && 
							(rs.getString("senha") == modelLogin.getSenha())) {
							rs.close();
					    	stmt.close();
					    	con.close();
						return true;
					}
					else {
						return false;
					}
			    }
			} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return true;
	}
}