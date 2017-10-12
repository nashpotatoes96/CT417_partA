package com.sys.reg;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;

public class StudentRegSysTest {

	@Test
	public void testUsername() throws ParseException {
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");

		String name = "name";
		int age = 21;
		Date dob = dateformat.parse("01/01/1996");
		int id = 1234;
		
		Student testStudent = new Student(name, dob, id);
		
		String expected = name + age;
		String actual = testStudent.getUsername();
		
		System.out.println("actual:\n\t" + actual + "\nexpected:\n\t" + expected);
		assertEquals(expected, actual);
	}

}
