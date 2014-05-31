package net.com.dev_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IntegrationController {

	@RequestMapping(value = "/test")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView("index");
		System.out.println("entrouasidjaisdjisd");
		return view;
	}

}
