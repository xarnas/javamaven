package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class initConnection {
		// JDBC driver name and database URL
		static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		static final String DB_URL = "jdbc:mysql://localhost/accountant";

		// Database credentials
		static final String USER = "root";
		static final String PASS = "d4rbas";
		public Connection conn = null;
		public Statement stmt = null;

	public initConnection(){
			
			try {

				// Register JDBC driver
				Class.forName("com.mysql.jdbc.Driver");

				// Open a connection
				this.conn = DriverManager.getConnection(DB_URL, USER, PASS);

			} catch (SQLException se) {
				// Handle errors for JDBC
				se.printStackTrace();
			} catch (Exception e) {
				// Handle errors for Class.forName
				e.printStackTrace();
			}
		
		}
	}
