package Control;
import java.util.List;

import org.json.JSONArray;
public class MyData {
	
     private String itemName;
     private double money;
     private String type;
     private JSONArray json;
     private String mType;
     private String iType;
     public List<String> itemNameA;
     public List<String> typeA; 
     
     
     
    public List<String> getitemNameA() {
         return itemNameA;
     }
    public void setitemNameA(List<String> itemNameA) {
         this.itemNameA = itemNameA;
     }
    public List<String> gettypeA() {
        return typeA;
    }
   public void settypeA(List<String> typeA) {
        this.typeA = typeA;
    }
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
	public String getmType() {
		return mType;
	}
	public void setmType(String mType) {
		this.mType = mType;
	}
	public String getiType() {
		return iType;
	}
	public void setiType(String iType) {
		this.iType = iType;
	}
    
}

