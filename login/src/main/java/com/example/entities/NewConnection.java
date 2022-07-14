package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "new_connection")
public class NewConnection {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
private String name;
private String email;
@Column(nullable = false,length=10)
private int alternatephoneno;
private String product;
@Column(nullable = false,length=12)
private long aadharno;
private String address;
private String pincode;
public NewConnection(String name, String email, int alternatephoneno, String product,long aadharno, String address,
		String pincode) {
	super();
	this.name = name;
	this.email = email;
	this.alternatephoneno = alternatephoneno;
	this.product = product;
	this.aadharno = aadharno;
	this.address = address;
	this.pincode = pincode;
}
public NewConnection() {
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
public int getAlternatephoneno() {
	return alternatephoneno;
}
public void setAlternatephoneno(int alternatephoneno) {
	this.alternatephoneno = alternatephoneno;
}
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public long getAadharno() {
	return aadharno;
}
public void setAadharno(long aadharno) {
	this.aadharno = aadharno;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}


}
