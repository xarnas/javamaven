package app.account;

import Control.*;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
//Spring.io Post, Get 
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

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
		
			