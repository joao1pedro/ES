package control;

import java.sql.SQLException;

import connection.ConnectionFactory;
import model.LoginModel;

public class LoginControl {
	ConnectionFactory con = new ConnectionFactory();
	
	public boolean validLogin(LoginModel modelLogin) {
		con.getConnection();
		if(modelLogin.getLogin()!=null && modelLogin.getLogin()!="") {
			con.executeSql("select * from login where nickname = '" + modelLogin.getLogin() + "'");
			try {
				con.rs.first();
				if((con.rs.getString("nickname")==modelLogin.getLogin()) && 
						(con.rs.getString("senha") == modelLogin.getSenha())) {
					return true;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
			
		}else {
			return false;
		}
	}
}
