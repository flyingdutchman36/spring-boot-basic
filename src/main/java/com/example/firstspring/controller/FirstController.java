package com.example.firstspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstspring.model.Joker;
import com.example.firstspring.model.JokerRepository;

/**
 * Created by "SumarK" On 20/9/2565 | 15:59
 * Copy&Paste Engineering. Good luck have fun.
 */

@RestController
public class FirstController {

	@Autowired
	JokerRepository repo;
	
    @GetMapping("/hello") // fix path come to this method
    public String sayHello() {
        List<Joker> jokerList = repo.findAll();
        for (Joker j : jokerList) {
			System.out.println(j);
		}
        return "hi";
    }

}
