package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.HuluClassUser;
import com.example.demo.dao.UserDao;

@RestController
public class MainController {

	@Autowired
	private UserDao userService;
	
	@GetMapping(path="/printAll")
	public ArrayList<HuluClassUser> getAll(){
		
		return userService.displayUser();
	}
	
	@PostMapping("/addUser")
	@ResponseStatus(code = HttpStatus.OK)
	public void addStudent(@RequestBody HuluClassUser user) {
		userService.addUser(user);
	}
}
