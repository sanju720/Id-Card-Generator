package com.generator.first;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class Test {

		@GetMapping("/")
		public String showform(Model model)
		{
			model.addAttribute("obj", new Signin());
        	return "showform";
		}
		
		@PostMapping("/register")
		public String submit(@ModelAttribute Signin obj, Model model){
			
			model.addAttribute("model", obj);
			return "idinfo";
			
		}
		
		@PostMapping("/idinfo")
		public String submit(@ModelAttribute  Idinformation obj1, Model model){
			
			model.addAttribute("model", obj1);
			return "info1";
			
		}
			
		

	

}
