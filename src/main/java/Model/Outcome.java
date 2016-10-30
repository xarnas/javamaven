package Model;

import org.json.JSONArray;

import Database.initInsert;
import Database.initSelect;

public class Outcome {
	public JSONArray getOutcome() {

		initSelect newSelect = new initSelect();
		return newSelect.returnQuery("outcome", "id,name,money");
		 
	}

	public void insertOutcome(String itemName, double money) {

		initInsert newInsert = new initInsert();
		newInsert.setQuery(itemName, money, "outcome");

	}
}
