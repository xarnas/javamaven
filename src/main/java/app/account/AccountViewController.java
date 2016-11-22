package app.account;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Control.MainController;
import Control.MyData;


@Controller
@RequestMapping(value = "/accountview")
public class AccountViewController { 
		@RequestMapping(method = RequestMethod.GET)
		public String viewRegistration(ModelMap model) {
			MyData userView = new MyData();
			MainController json = new MainController();
			userView.setJson(json.getIncome());
			model.addAttribute("income", userView.getJson());
			return "accountview";
		}
}
		
			