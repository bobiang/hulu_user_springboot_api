package com.example.demo.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.bean.HuluClassUser;

@Component
public class UserDao {
	public static ArrayList<HuluClassUser> repo= new ArrayList<>();
	
	public UserDao() {
		repo.add(new HuluClassUser("aaa", "aaapassword"));
	}
	
	public void addUser(HuluClassUser user) {
		repo.add(user);
	};
	
	
	public ArrayList<HuluClassUser> displayUser(){
		return repo;
	}
}
