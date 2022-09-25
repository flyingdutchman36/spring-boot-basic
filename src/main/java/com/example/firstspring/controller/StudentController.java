package com.example.firstspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.firstspring.model.Joker;
import com.example.firstspring.model.Triangle;

@Controller
@RequestMapping("/v1")
public class StudentController {
	
	@GetMapping("/student")
	public String listStudent(Model model) {
		Joker joker = new Joker();
		joker.setName("asdasdas");
		joker.setWeight(80.0f);
		joker.setFootSize(40.0);
		model.addAttribute("joker", joker);
		return "list";
	}
	
	@GetMapping("/sum")
	public String sumNumber(@ModelAttribute Triangle t, Model model) {
		int result = t.getA() + t.getB();
		model.addAttribute("resultAB", result);
		System.out.println(result);
		return "resultAB";
	}
	
	@PostMapping("/student")
	public String add(@RequestParam("name") String name) {
		System.out.println(name);
		return "success";
	}
	
	
}
