package com.example.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
	@Column(nullable = false,length=45)
private String firstname;
	@Column(nullable = false,length=45)
private String lastname;
private Date dob;
@Column(nullable = false,unique=true,length=45)
private String email;
@Column(length=6)
private String gender;
@Column(nullable = false,length=10)
private long phoneno;
@Column(nullable = false,length=15)
private String password;
public User(int id, String firstname, String lastname,String email, Date dob, String gender, long phoneno, String password) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
	this.dob = dob;
	this.gender=gender;
	this.phoneno = phoneno;
	this.password = password;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}

public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public long getPhoneno() {
	return phoneno;
}
public void setPhoneno(long phoneno) {
	this.phoneno = phoneno;
}

}
