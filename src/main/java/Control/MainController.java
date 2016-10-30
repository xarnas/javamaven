package Control;

import org.json.JSONArray;

import Model.*;

public class MainController {
	
       private Income income;
       private Outcome outcome;
       
	public MainController() {
		Income income = new Income();
		Outcome outcome = new Outcome();
		this.outcome=outcome;
		this.income=income;
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
