package system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import user.Student;

public class Manager {
	static Scanner s = new Scanner(System.in);
	public static List<Student> students = new ArrayList<Student>();
	
	public Manager(List<Student> sutdents) {
		this.students = students;
	}
	
	public static void studentinput() {
		
		System.out.print("학과: ");
		String department = s.next();
		System.out.print("학번: ");
		String studentID = s.next();
		System.out.print("학년: ");
		String grade  = s.next();
		System.out.print("이름: ");
		String name = s.next();
		
		Student st = new Student(department, studentID, grade, name);
		
		students.add(st);
	}
	
	public static void studentlist() {
		for(int i = 0; i<students.size(); i++) {
			System.out.println(students.get(i));
		}
	}
	
	public static void studentedit() {
		System.out.println("이름을 입력해주세요.");
		String changename = s.next();
		
		for(int i = 0; i<students.size(); i++) {
			if(students.get(i).getName().equals(changename)) {
				System.out.println(students.get(i).toString());
				
				System.out.print("학과: ");
				String department = s.next();
				System.out.print("학번: ");
				String studentID = s.next();
				System.out.print("학년: ");
				String grade  = s.next();
				System.out.print("이름: ");
				String name = s.next();
				students.get(i).setDepartment(department);
				students.get(i).setStudentID(studentID);
				students.get(i).setGrade(grade);
				students.get(i).setName(name);
				
			}
		}
	}
	
	public static void studentdelete() {
		System.out.println("삭제할 이름을 입력해주세요.");
		String deletename = s.next();
		for(int i = 0; i<students.size(); i++) {
			if(students.get(i).getName().equals(deletename)) {
				System.out.println("삭제되었습니다.");
				students.remove(i);
			}
		}
	}
	
	public static void studentsearch() {
		System.out.println("조회 할 학번을 입력해주세요.");
		String searchname = s.next();
		for(int i = 0; i<students.size(); i++) {
			if(students.get(i).getStudentID().equals(searchname)) {
				System.out.println(students.get(i));
			}
		}
	}
}