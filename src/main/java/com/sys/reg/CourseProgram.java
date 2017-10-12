package com.sys.reg;

import org.joda.time.DateTime;

public class CourseProgram {
	private String Name;
	private Module[] Modules;
	private DateTime StartDate;
	private DateTime EndDate;
	
	public CourseProgram(String name, Module[] modules, DateTime start, DateTime end) {
		this.Name = name;
		this.Modules = modules;
		this.StartDate = start;
		this.EndDate = end;
	}
	
	//Accessor Methods
	public String getName() {
		return this.Name;
	}
	
	public Module[] getModules() {
		return this.Modules;
	}
	
	public DateTime getStartDate() {
		return this.StartDate;
	}
	
	public DateTime getEndDate() {
		return this.EndDate;
	}
	
	//Mutator Methods
	public String setName(String name) {
		this.Name = name;
		return this.Name;
	}
	
	public Module[] setModules(Module[] modules) {
		this.Modules = modules;
		return this.Modules;
	}
	
	public DateTime setStartDate(DateTime start) {
		this.StartDate = start;
		return this.StartDate;
	}
	
	public DateTime setEndDate(DateTime end) {
		this.EndDate = end;
		return this.EndDate;
	}
}
