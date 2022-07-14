package com.example.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ContactUsDao;
import com.example.entities.ContactUs;


@Service
@Transactional
public class ContactUsService {
	
	@Autowired
	ContactUsDao contactusDao;
	
	public ContactUsService() {
		System.out.println("<<<<<<ContactUs Service is INSTANTIATED>>>>");
	}
	


	public ContactUs saveContactUs(ContactUs contactus) {
		// TODO Auto-generated method stub
		contactusDao.save(contactus);
		return contactus;
	}
}
