package com.example.firstspring.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstspring.model.Forum;
import com.example.firstspring.model.ForumRespository;

@RestController
public class ForumAPI {
        @Autowired
        ForumRespository repo;
        
        @GetMapping("/forums")
        public List<Forum> getForumList() {
        	return repo.findAll();
        }
        
        @GetMapping("/forums/{id}")
        public Forum getForum(@PathVariable("id") Integer id) {
        	return repo.findOne(id);
        }
        
        @PutMapping("/forums") 
        public Forum edit(@RequestBody Forum forum) { // @RequestBody คือ รับข้อมูลมาแบบ JSON
        	System.out.println(forum.getDetail());
        	Forum f2 = repo.findOne(forum.getId());
        	f2.setAuthor(forum.getAuthor());
        	f2.setDetail(forum.getDetail());
        	f2.setLove(forum.getLove());
        	f2.setPostDate(LocalDateTime.now());
        	repo.save(f2);
        	return forum;
        }
        
}
