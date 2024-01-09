package com.example.demo3.spngs;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Setgetins {
String fname;
String lname;
String email;
String username;
String pwd;
String Dob;

String mobile;


public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
int pincode;
public String getDob() {
	return Dob;
}
public void setDob(String dob) {
	Dob = dob;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}

public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}



}
