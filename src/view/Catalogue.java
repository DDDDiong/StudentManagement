package view;

import java.util.Scanner;
import system.Manager;


public class Catalogue {

	public static void catalogue() {
		
		while(true) {
			System.out.println("<1>학생정보입력 <2>학생정보수정 <3>학생정보삭제 <4>학생조회 <5>학생목록 <0>종료");
		
			Scanner sc = new Scanner(System.in);
		
			int num = sc.nextInt();
		
			switch(num) {
				case 1:
					System.out.println("학생정보입력");
					Manager.studentinput();
					catalogue();
					break;
				case 2:
					Manager.studentedit();
					catalogue();
					break;
				case 3:
					Manager.studentdelete();
					catalogue();
					break;
				case 4:
					Manager.studentsearch();
					catalogue();
					break;
				case 5:
					Manager.studentlist();
					catalogue();
					break;
				case 0:
					System.out.println("로그아웃.");
					LoginMenu.loginMenu();
					break;
				default:
					System.out.println("다시 입력하시오.");
			}
				
		}
	}
}