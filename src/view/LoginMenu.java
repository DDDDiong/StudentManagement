package view;

import java.util.Scanner;

import system.Manager;

public class LoginMenu {
	
	public static void loginMenu() {
		while(true) {
			System.out.println("<1>학생 로그인 <2>관리자 로그인 <0>프로그램 종료");
			
			Scanner sc = new Scanner(System.in);
			
			int num = sc.nextInt();
		
			switch(num) {
				case 1:
					System.out.println("학생 로그인");
					break;
				case 2:
					Catalogue.catalogue();
					break;
				case 0:
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					break;
				default:
					System.out.println("다시 입력하시오.");
					
			}
		}
	}
}
