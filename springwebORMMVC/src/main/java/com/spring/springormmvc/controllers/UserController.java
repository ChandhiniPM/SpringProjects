package com.spring.springormmvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.springormmvc.user.entity.User;
import com.spring.springormmvc.user.services.UserService;

@Controller
public class UserController {
	@Autowired
	UserService service;

	@RequestMapping("SignUp")
	public String Registration() {
		return "UserRegistration";
	}

	@RequestMapping(value = "RegistrationPage", method = RequestMethod.POST)
	public String UserCreation(@ModelAttribute User user, ModelMap model) {
		Integer result = service.create(user);
		model.addAttribute("Result", result);

		return "UserRegistration";

	}

}
