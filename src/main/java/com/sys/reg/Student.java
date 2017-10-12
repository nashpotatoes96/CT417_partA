package com.sys.reg;

import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.Years;

public class Student {
	private String Name;
	private int Age;
	private Date DOB;
	private DateTime DOBDT;
	private int ID;
	
	public Student(String name, Date dob, int id) {
		this.Name = name;
		this.DOB = dob;
		this.DOBDT = new DateTime(dob);
		this.ID = id;
		
		Date now = new Date();
		DateTime nowDT = new DateTime(now);
		Years age = Years.yearsBetween(nowDT, this.DOBDT);
		String ageS = new String("" + age.getYears());
		this.Age = Integer.parseInt(ageS.replace("-", ""));
	}
	
	//Accessor Methods
	public String getUsername() {
		return this.Name + this.Age;
	}
	
	public int getAge() {
		return this.Age;
	}
	
	public Date getDOB() {
		return this.DOB;
	}
	
	public int getID() {
		return this.ID;
	}
	
	//Mutator Methods
	public String setName(String name) {
		this.Name = name;
		return this.Name;
	}
	
	public Date setDOB(Date dob) {
		this.DOB = dob;
		this.DOBDT = new DateTime(dob);
		return this.DOB;
	}
	
	public int setID(int id) {
		this.ID = id;
		return this.ID;
	}
}