package com.examly.springapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.Entity.UserModel;
import com.examly.springapp.Repository.UserModelRepo;

@Service
public class UserModelService {

	@Autowired
	private UserModelRepo userRepo;

	public UserModelService() {
		// TODO Auto-generated constructor stub
	}
	
	
	public UserModelService(UserModelRepo userRepo) {
		super();
		this.userRepo = userRepo;
	}

	public List<UserModel> getallUser() {
		
		return userRepo.findAll();
	}
	public UserModel addUser(UserModel userModel) {
		
		return userRepo.save(userModel);
	}
	public boolean checklogin(UserModel userModel) {
		
		UserModel foundLogin=userRepo.findByEmailAndPassword(userModel.getEmail(),userModel.getPassword());
		if(foundLogin!=null) {
			return true;
		}
		else {
		return false ;
	}
	}
}
