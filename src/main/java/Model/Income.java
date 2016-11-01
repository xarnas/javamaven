package Model;
import org.json.JSONArray;

import Database.*;

public class Income {
	public JSONArray getIncome() {

		initSelect newSelect = new initSelect();
		 return newSelect.returnQuery("income", "id,name,money");
		 
	}

	public void insertIncome(String itemName, double money) {

		initInsert newInsert = new initInsert();
		newInsert.setQuery(itemName, money, "income");

	}

}
