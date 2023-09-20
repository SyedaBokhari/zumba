package com.simplilearn.zumba;

import java.util.Date;

public class Participant {

	int id;
	String firstName;
	String lastname;
	Date birth;
	String gender;
	String Batch;
	
	
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
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getgender() {
		return gender;
	}
	public void setgender(String gender) {
		this.gender = gender;
	}	
	public String getBatch() {
			return Batch;
		}
		public void setBatch(String Batch) {
			this.Batch = Batch;
	}
	@Override
	public String toString() {
		return "Participant [id = " + id + ", firstName = " + firstName + ", lastname = " + lastname + ", birth = " + birth
				+ ", Gender = " + gender + " , Batch = " + Batch ;
	}
	
	
	
	
	
	
	
	
}
