package com.tpi.crud.controller;

import com.tpi.crud.dto.UserRegistrationDto;
import com.tpi.crud.service.api.UserServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
	@Autowired
	private UserServiceAPI userService;

	@ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto() {
        return new UserRegistrationDto();
    }
	
	@GetMapping
	public String showRegistrationForm() {
		return "registration";
	}
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		System.out.println(registrationDto.getFirstName());
		userService.save(registrationDto);

		return "redirect:/registration?success";
	}
}
