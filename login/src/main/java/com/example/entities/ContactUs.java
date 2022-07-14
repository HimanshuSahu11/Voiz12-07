package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contact_us")
public class ContactUs {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name;
private String email;
private int phoneno;
private String subject;
private String message;

public ContactUs(String name, String email, int phoneno, String subject, String message) {
	super();
	this.name = name;
	this.email = email;
	this.phoneno = phoneno;
	this.subject = subject;
	this.message = message;
}
public ContactUs() {
	super();
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getPhoneno() {
	return phoneno;
}
public void setPhoneno(int phoneno) {
	this.phoneno = phoneno;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}

}
