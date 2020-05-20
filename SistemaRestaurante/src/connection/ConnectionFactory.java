package connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


public class ConnectionFactory {

	private String DRIVER = "org.mariadb.jdbc.Driver";
	private String URL = "jdbc:mariadb://localhost:3306/login";
	private String USER = "admin";
	private String PASSWORD = "";
	
	public Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
	
	public void closeConnection(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}