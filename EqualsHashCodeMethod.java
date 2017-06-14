package com.corejava.test;

import java.util.HashMap;
import java.util.Map;

public class EqualsHashCodeMethod {

	public static void main(String[] args) {
		
		Student student = new Student("AP34");
		Student student1 = new Student("AP34");
		
		
		System.out.println(student.equals(student1)); 
		
		Map<Student, ReportCard> report = new HashMap<Student, ReportCard>();
		
		report.put(student, new ReportCard());
		report.put(student1, new ReportCard());
		
		System.out.println(report.size());
		

	}
}
