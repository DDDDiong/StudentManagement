package user;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
	
	// 학과, 학번, 학년, 이름
	private String department;
	private String studentID;
	private String grade;
	private String name;
	
	public Student(String department, String studentID, String grade, String name) {
		this.department = department;
		this.studentID = studentID;
		this.grade = grade;
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public String getStudentID() {
		return studentID;
	}



	public void setStudentID(String studentID) {
		this.studentID = studentID;
		
	}



	public String getGrade() {
		return grade;
	}



	public void setGrade(String grade) {
		this.grade = grade;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "학과: " + department + " 학번: " + studentID + " 학년: " + grade + " 이름: " + name;
	}
	
}