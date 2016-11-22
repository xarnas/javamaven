package Model;
import org.json.JSONArray;
import Database.initInsert;
import Database.initSelect;

public class Type {
		public JSONArray getType(String type, String table) {

			initSelect newSelect = new initSelect();
			 return newSelect.returnQuery(table, "id,"+type);
			 
		}

		public void insertType(String type, String table) {

			initInsert newInsert = new initInsert();
			newInsert.setQuery(type, table);

		}
}
