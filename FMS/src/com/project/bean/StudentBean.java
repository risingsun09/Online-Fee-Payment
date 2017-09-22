package com.project.bean;

public class StudentBean {
private int rollno;
private String name,password,email,hostel,course,paid,sem;
private int amt;
private String address,contact;

public StudentBean() {}

public StudentBean(String name,String password, String email, String hostel, String course, String sem, String paid, int amt, String address,
		String contact) {
	super();
	this.name = name;
	this.password=password;
	this.email = email;
	this.hostel = hostel;
	this.course = course;
	this.sem = sem;
	this.paid = paid;
	this.amt = amt;
	this.address = address;
	this.contact = contact;
}

public StudentBean(int rollno, String name,String password, String email, String hostel, String course, String sem, String paid, int amt,
		String address, String contact) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.password=password;
	this.email = email;
	this.hostel = hostel;
	this.course = course;
	this.sem = sem;
	this.paid = paid;
	this.amt = amt;
	this.address = address;
	this.contact = contact;
}

public StudentBean(int rollno, String paid, int amt) {
	super();
	this.rollno = rollno;
	this.paid = paid;
	this.amt = amt;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getHostel() {
	return hostel;
}
public void setHostel(String hostel) {
	this.hostel =hostel ;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getSem() {
	return sem;
}
public void setSem(String sem) {
	this.sem = sem;
}
public String getPaid() {
	return paid;
}
public void setPaid(String paid) {
	this.paid = paid;
}
public int getAmt() {
	return amt;
}
public void setAmt(int amt) {
	this.amt = amt;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}

}
