package com.test.statement;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		// 선언부
		// 아이디 배열
		String[] idArray = new String[100];
		idArray[0] = "mimi";
		idArray[1] = "mama";
		idArray[2] = "mumu";

		// 패스워드 배열
		String[] pwdArray = new String[100];
		pwdArray[0] = "mimi";
		pwdArray[1] = "mama";
		pwdArray[2] = "mumu";
		String menu;
		Scanner scan = new Scanner(System.in);

		int info = 3;
		String idStr = "";
		String pwdStr = "";

		boolean decode = true;

		// 메뉴부분
		while (decode) {
			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println("[1]로그인");
			System.out.println("[2]회원가입");
			System.out.println("[3]아이디/패스워드찾기");
			System.out.println("[4]종료");
			System.out.println("메뉴를 선택해주세요.");

			menu = scan.nextLine();
			String msg = "";
			switch (menu) {
			case "1":
				msg = "로그인을 선택하셨습니다.";
				System.out.print("아이디를 입력해주세요 :");
				idStr = scan.nextLine();

				System.out.print("패스워드를 입력해주세요 : ");
				pwdStr = scan.nextLine();

				for (int login = 0; login <= info; login++) {
					if (idStr.equals(idArray[login])) {
						if (pwdStr.equals(pwdArray[login])) {
							System.out.println("로그인에 성공하였습니다.");
							break;
						} else {
							System.out.println("패스워드가 틀렸습니다. 재입력하세요.");
							break;
						}
					} else if (login == info) {
						System.out.println("아이디 또는 패스워드가 틀렸습니다. 재입력하세요.");
					}
				}

				break;
			case "2":
				msg = "회원가입을 선택하셨습니다.";
				System.out.println("회원가입에 필요한 아이디와 비밀번호를 입력해주세요.");
				System.out.print("아이디 : ");
				idArray[info] = scan.nextLine();
				System.out.print("패드워드 : ");
				pwdArray[info] = scan.nextLine();

				info++;

				break;
			case "3":
				msg = "아이디/패스워드 찾기를 선택하셨습니다.";
				break;
			case "4":
				msg = "프로그램을 종료합니다.";
				System.out.println(msg);
				return;

			default:
				msg = "메뉴 선택이 올바르지 않습니다.";
			}

		}
	}

}
