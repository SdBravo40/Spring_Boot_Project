package com.SpringBoot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.SpringBoot.Entity.UserEntity;
import com.SpringBoot.Repository.UserRepository;
import com.SpringBoot.Service.UserService;

@Controller
public class AppController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserService userService;
    
	@GetMapping("/")
	public String Homepage() {
		
		return "home";
	}
	
	
	@GetMapping("/signup")
	public String registerPage() {
		System.out.println("inside signup Controller-------------------------");
		
		return "register";
	}
	
	@RequestMapping("/registerUrl")
	public ResponseEntity<Object> registeration(@RequestParam String name, @RequestParam String username, 
			@RequestParam int age, @RequestParam String password) {
		
		try {
			System.out.println("---------name---------: "+name);
			System.out.println("---------username-----: "+username);
			System.out.println("---------age----------: "+age);
			System.out.println("---------password-----: "+password);
			
			userService.savedata(name, username, password, age);
		}
		catch(Exception ex) {
			ex.printStackTrace();
			 return new ResponseEntity<Object>(new Error("Cannot be saved!! for : " + username + "!"),HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<Object>(null, HttpStatus.OK);
	}
	
	
	@RequestMapping("/getTable")
	public String showdata(ModelMap model) {
		
		List<UserEntity> users = userRepository.findAll();
		
		for(UserEntity user : users) {
			
		    System.out.println("-----name---:"+ user.getName());
		    System.out.println("-----Username: "+ user.getUsername());
		    System.out.println("-----age-----:" + user.getAge());
		}
		
		model.put("userlist", users);
		
		return "home";
	}
	
}
