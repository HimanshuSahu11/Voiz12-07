package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.entities.ErrorClazz;
import com.example.entities.NewConnection;
import com.example.service.NewConnectionService;

@RestController
@RequestMapping("/new")
@CrossOrigin(origins = "http://localhost:4200")
public class NewConnectionController {

	@Autowired
	NewConnectionService newconnectionService;
	
	public NewConnectionController() {
		System.out.println("<<<<<<< New Connection CONTROLLER INSTANTIATED>>>>>>>>");
	}
	
	@PostMapping("/connection")
	public ResponseEntity<?> saveNewConnection(@RequestBody NewConnection newconnection) {
		try {
			newconnection= newconnectionService.saveNewConnection(newconnection);
			return new ResponseEntity<NewConnection>(newconnection,HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			ErrorClazz errorClazz=new ErrorClazz(500,e.getMessage());
			return new ResponseEntity<ErrorClazz>(errorClazz,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
