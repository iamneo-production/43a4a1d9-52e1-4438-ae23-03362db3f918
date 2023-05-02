package com.examly.springapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.Entity.UserModel;

@Repository
public interface UserModelRepo extends JpaRepository<UserModel, Integer>{

	public UserModel findByEmailAndPassword(String email,String password);
}
