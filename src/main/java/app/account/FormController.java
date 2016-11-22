package app.account;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Control.MainController;
import Control.MyData;
import Database.ToJSON;

@Controller
@RequestMapping(value = "/form")
public class FormController {
	@RequestMapping(method = RequestMethod.GET)
	public String viewRegistration(ModelMap model) {
		MyData userForm = new MyData();
		
		 List<String> itemList = new ArrayList<>();
	        itemList.add("Alga");
	        itemList.add("Stipendija");
	        itemList.add("so on...");
	    
	        List<String> typeList = new ArrayList<>();
	        typeList.add("Income");
	        typeList.add("Outcome");
	        typeList.add("Other");
	       
	        JSONArray jsonArray = new JSONArray();
	        jsonArray.put(itemList);
	        
			userForm.setJson(jsonArray);
	        model.addAttribute("userForm", userForm);

	        
			model.addAttribute("itemNameA", userForm.getJson());
			
			
		// List<String> InOutList = new ArrayList<>();
		// InOutList.add("Income");
		// InOutList.add("Outcome");
		// model.put("InOutList", InOutList);
	        
	    //    model.addAttribute("itemNameA", "Hello");
	    //    model.addAttribute ("typeA", "World");
//	        model.put("userForm", userForm);
	        
	        
		return "form";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String processRegistration(@ModelAttribute("userForm") MyData user, ModelMap model) {

		MainController mc = new MainController();
		mc.set(user.getItemName(), user.getMoney(), user.getType());
//		if (!user.getType().equals("")){
//			mc.insertType(user.getType(),"itype");
//		}
//		if (!user.getItemName().equals("")){
//			mc.insertType(user.getmType(),"itype");
//		}
		return "form";
	}
}