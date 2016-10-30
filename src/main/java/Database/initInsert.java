package Database;

import java.sql.SQLException;

public class initInsert {
	
	public void setQuery(String name, double money, String table) {
		//Execute a query
		initConnection newCon = new initConnection();
		try {
			newCon.stmt = newCon.conn.createStatement();
			String sql;
			sql = "INSERT INTO " + table + " (name,money) VALUES ('" + name
					+ "'," + money + ")";
			int rs = newCon.stmt.executeUpdate(sql);
			System.out.println(rs);

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (newCon.stmt != null)
					newCon.stmt.close();
			} catch (SQLException se2) {
			}
			try {
				if (newCon.conn != null)
					newCon.conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
}

