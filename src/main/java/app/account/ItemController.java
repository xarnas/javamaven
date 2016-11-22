
	package app.account;

	import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Control.MainController;
import Control.MyData;

	@Controller
	@RequestMapping(value = "/iType")
	public class ItemController {

		@RequestMapping(method = RequestMethod.GET)
		public String viewRegistration(Map<String, Object> model) {
			MyData userForm = new MyData();
			model.put("itemForm", userForm);

			// List<String> InOutList = new ArrayList<>();
			// InOutList.add("Income");
			// InOutList.add("Outcome");
			// model.put("InOutList", InOutList);
			return "iType";
		}

		@RequestMapping(method = RequestMethod.POST)
		public String processRegistration(@ModelAttribute("itemForm") MyData user, ModelMap model) {

			MainController mc = new MainController();
//			mc.set(user.getItemName(), user.getMoney(), user.getType());
//			if (!user.getType().equals("")){
//				mc.insertType(user.getType(),"itype");
//			}
//			if (!user.getItemName().equals("")){
//				mc.insertType(user.getmType(),"itype");
//			}
			return "iType";
		}
}
