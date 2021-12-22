package com.practice.controller;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	// handler
	@SuppressWarnings("deprecation")
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about(Model model) {
		System.out.println("inside about handler...");

		// puting data in model
		model.addAttribute("name", "Ashish");
		model.addAttribute("currentDate", new Date().toLocaleString());

		return "about";

	}

	// handling iteration
	@GetMapping("/example-loop")
	public String iterateHandler(Model model) {

		// send

		// create a list, set collection

		List<String> names = List.of("Ashish", "Shubham", "Vinit", "Deepa");

		model.addAttribute("names", names);

		return "iterate";

	}

	// handler for conditional statements 
	@GetMapping("/condition")
	public String conditionalHandler(Model model) {

		System.out.println("conditional handler executed...");
		
		//for ELvis Operator:- condition ? "true" : "false"
		model.addAttribute("isActive", true);
		
		//for if - unless
		model.addAttribute("gender", "F");
		
		//for Switch case
		List<Integer> mylist = List.of(14,42,437,45,205,76,1007);
		model.addAttribute("mylist", mylist);
		

		return "condition";

	}
	
	//handler for include fragments
	@GetMapping("/service")
	public String serviceHandler(Model m) {
		
		m.addAttribute("title","Java Code");
		m.addAttribute("subtitle",LocalDateTime.now().toString());
		
		return "service";
		
	}
	
	//for new about
	@GetMapping("/newabout")
	public String newAbout() {
		
		return "aboutnew";
		
	}
	
	//for new contect
		@GetMapping("/contect")
		public String contect() {
			
			return "contect";
			
		}

}
