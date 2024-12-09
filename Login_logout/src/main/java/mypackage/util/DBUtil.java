 package mypackage.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import jakarta.servlet.jsp.tagext.TryCatchFinally;

public class DBUtil {

	private static final String URl="jdbc:mysql://localhost:3306/welcome";
	private static final String USERName="root";
private static final String PASSWORD="Aagam9686jain";


	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
public static Connection getConnection() throws SQLException{
	
	System.out.println("connection is processning");
	return DriverManager.getConnection(URl,USERName,PASSWORD);
}

}
