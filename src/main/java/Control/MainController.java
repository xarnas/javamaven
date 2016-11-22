package Control;

import org.json.JSONArray;

import Model.*;

public class MainController {
	
       private Income income;
       private Outcome outcome;
       private Type type;
       
	public MainController() {
		Income income = new Income();
		Outcome outcome = new Outcome();
		Type type = new Type();
		this.outcome=outcome;
		this.income=income;
		this.type=type;
	}
	
    public JSONArray prepDropDown(String typex, String table){
    	
    	return type.getType(typex, table);
    }
 
    public void insertType(String typex,String table){
    	type.insertType(typex, table);
    	
    }
    public JSONArray getIncome() {
		return income.getIncome();
	}

	public JSONArray getOutcome() {
		return outcome.getOutcome();

	}

	public void set(String itemName, double money, String type) {
		if (type.equals("Income")) {
			this.income.insertIncome(itemName, money);
		} else {
			this.outcome.insertOutcome(itemName, money);
		}
	}

}
