package jsp_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	final static String forNameURL="com.mysql.cj.jdbc.Driver";
	final static String dBURL="jdbc:mysql://localhost:3306/epsql";
	final static String username="root";
	final static String password="Mj2410/01";
	public static Connection DBConnection() throws ClassNotFoundException, SQLException {
		Class.forName(forNameURL);
		Connection con=DriverManager.getConnection(dBURL,username,password);
		return con;
	}

}
