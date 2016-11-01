package Control;
import org.json.JSONArray;
public class MyData {
	
     private String itemName;
     private double money;
     private String type;
     private JSONArray json;
     
     
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public JSONArray getJson() {
		return json;
	}
	public void setJson(JSONArray json) {
		this.json = json;
	}
    
}

