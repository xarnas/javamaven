package Database;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.json.JSONArray;
      
public class initSelect {
	private JSONArray generatedJSON=null;
	public JSONArray returnQuery(String table, String selectar) {
		// STEP 4: Execute a query
	 	initConnection newCon = new initConnection();
		try {
			newCon.stmt = newCon.conn.createStatement();
			String sql;
			sql = "SELECT " + selectar + " FROM " + table;
			ResultSet rs = newCon.stmt.executeQuery(sql);
			ToJSON json = new ToJSON();
			this.generatedJSON = json.convertResultSetIntoJSON(rs);
//			while (rs.next()) {
//
//				System.out.print("| " + rs.getInt("id") + "| ");
//				System.out.print(rs.getString("name") + "     | ");
//				System.out.println(rs.getDouble("money") + " |");
//			}

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
		return generatedJSON;
	}
}
