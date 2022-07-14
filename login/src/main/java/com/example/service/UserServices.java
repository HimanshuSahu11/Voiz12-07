package com.example.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserDao;

import com.example.entities.User;

@Service
@Transactional
public class UserServices {
	
	@Autowired
	UserDao userDao;
	
	
	
	public UserServices() {
		System.out.println("<<<<<<User Service is INSTANTIATED>>>>");
	}
	
	public User saveNewUser(User newuser) {
		userDao.save(newuser);
	return newuser;
}

	
	public Optional<User> findByEmailAndPassword(String email,String password) {
		return userDao.findByEmailAndPassword(email, password);
	}

	public void updateUser(User userupdate) {
		// TODO Auto-generated method stub
		userDao.save(userupdate);
	}

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	public Optional<User> findByEmail(String email) {
		// TODO Auto-generated method stub
		return userDao.findByEmail(email);
	}





}