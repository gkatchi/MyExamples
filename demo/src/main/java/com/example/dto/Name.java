package com.example.dto;

public class Name {
private String fname;
private String lname;
public String getFname() {
	return fname;
}
public Name(String fname, String lname) {
	super();
	this.fname = fname;
	this.lname = lname;
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
}
