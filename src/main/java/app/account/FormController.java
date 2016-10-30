package app.account;

import Control.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
//Spring.io Post, Get 
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/form")
public class FormController {

	@RequestMapping(method = RequestMethod.GET)
	public String viewRegistration(Map<String, Object> model) {
		MyData userForm = new MyData();
		model.put("userForm", userForm);

		// List<String> InOutList = new ArrayList<>();
		// InOutList.add("Income");
		// InOutList.add("Outcome");
		// model.put("InOutList", InOutList);

		return "form";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String processRegistration(@ModelAttribute("userForm") MyData user, Map<String, Object> model) {

		MainController mc = new MainController();
		mc.set(user.getItemName(), user.getMoney(), user.getType());

		System.out.println("InOut: " + user.getItemName());
		System.out.println("Money: " + user.getMoney());
		System.out.println("Type: " + user.getType());

		return "form";
	}
}