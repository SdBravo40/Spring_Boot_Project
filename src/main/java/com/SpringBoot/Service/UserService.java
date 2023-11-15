package com.SpringBoot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.Entity.UserEntity;
import com.SpringBoot.Repository.UserRepository;


@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public String savedata(String name, String username, String password, int age) {
		
		System.out.println("-----i'm inside service-----of saveddata-----");
		
		UserEntity userEntity = new UserEntity();
		userEntity.setAge(age);
		userEntity.setUsername(username);
        userEntity.setName(name);
        userEntity.setPassword(password);
        
        
        userRepository.save(userEntity);
        
		return "saved";
	}
	
	
}
