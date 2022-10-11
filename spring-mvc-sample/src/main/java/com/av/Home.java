package com.av;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {
@RequestMapping("/getdata")
	public ModelAndView getData(){
		ModelAndView modelAndView=new ModelAndView("MySweet.jsp");
		modelAndView.addObject("name", "!!!!!!!!!!!!!!!!!!!!!BTS ARMY!!!!!!!!!!!!!!!!!!!!!!!!");
		return modelAndView;
	}
	
}
