package com.example.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.NewConnectionDao;

import com.example.entities.NewConnection;

@Service
@Transactional
public class NewConnectionService {

	@Autowired
	NewConnectionDao newconnectionDao;
	
	public NewConnectionService() {
		System.out.println("<<<<<<NewConnection Service is INSTANTIATED>>>>");
	}
	


	public NewConnection saveNewConnection(NewConnection newconnection) {
		// TODO Auto-generated method stub
		newconnectionDao.save(newconnection);
		return newconnection;
	}

	
}
