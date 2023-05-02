package com.examly.springapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.Entity.UserModel;
import com.examly.springapp.Service.UserModelService;

@CrossOrigin("http://localhost:4200")
@RestController
public class UserModelController {

	@Autowired
	private UserModelService userService;
	
	@GetMapping("/users")
	public List<UserModel> getUserList(){
		
		return userService.getallUser();
	}
	
	@PostMapping("/signup")
	public UserModel addUser(@RequestBody UserModel userModel) {
		return userService.addUser(userModel);
	}
	
	@PostMapping("/login")
	public boolean isUserPresent(@RequestBody UserModel userModel) {
		return userService.checklogin(userModel);
	}
		
}
