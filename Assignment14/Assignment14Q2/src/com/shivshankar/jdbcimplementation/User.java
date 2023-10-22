package com.shivshankar.jdbcimplementation;

import java.util.Date;
import java.util.Scanner;

public class User {
	int id;
	String firstName;
	String lastName;
	String email;
	String password;
	String dob;
	boolean status;
	String role;
	
	public User() {
	
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
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




	public String getDob() {
		return dob;
	}




	public void setDob(String dob) {
		this.dob = dob;
	}




	public boolean isStatus() {
		return status;
	}




	public void setStatus(boolean status) {
		this.status = status;
	}




	public String getRole() {
		return role;
	}




	public void setRole(String role) {
		this.role = role;
	}




	public User(int id, String firstName, String lastName, String email, String password, String dob, boolean status,
			String role) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.status = status;
		this.role = role;
	}




	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", dob=" + dob + ", status=" + status + ", role=" + role + "]";
	}

	public void accept() {
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter First Name:");
		this.firstName=sc.next();
		System.out.println("Enter Last Name:");
		this.lastName=sc.next();
		System.out.println("Enter Email :");
		this.email=sc.next();
		System.out.println("Enter Password:");
		this.password=sc.next();
		System.out.println("Enter Dob:");
		this.dob=sc.next();
		System.out.println("Enter Role");
		this.role=sc.next();
	}
	
	
}
