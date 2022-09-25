package com.example.firstspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstspring.model.Forum;
import com.example.firstspring.model.ForumRespository;

@Controller
public class ForumController {
              @Autowired 
              private ForumRespository repo;
              
              @GetMapping("/forum")
              public String test(Model model) {
            	  List<Forum> list = repo.findAll();
            	  model.addAttribute("list", list);
//            	  for (Forum forum : list) {
//            		  System.out.println(forum.getDetail());
//            	  }
            	  return "forum";
              }
}
