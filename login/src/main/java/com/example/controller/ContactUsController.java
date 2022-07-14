package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.entities.ContactUs;
import com.example.entities.ErrorClazz;
import com.example.service.ContactUsService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ContactUsController {

	@Autowired
	ContactUsService contactusService;
	
	public ContactUsController() {
		System.out.println("<<<<<<< AboutUs CONTROLLER INSTANTIATED>>>>>>>>");
	}
	
	@PostMapping("/newconnection")
	public ResponseEntity<?> saveContactUs(@RequestBody ContactUs contactus) {
		try {
			System.out.println(contactus.getMessage());
			contactus= contactusService.saveContactUs(contactus);
			return new ResponseEntity<ContactUs>(contactus,HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			ErrorClazz errorClazz=new ErrorClazz(500,e.getMessage());
			return new ResponseEntity<ErrorClazz>(errorClazz,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
