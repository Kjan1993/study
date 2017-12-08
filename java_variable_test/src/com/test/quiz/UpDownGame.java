package com.test.quiz;

import java.util.Scanner;

public class UpDownGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 변수설정 라인
		String usernum = "";
		String yorn = "";
		
		int GameNum = 0;
		int min = 1;
		int max = 100;
		int RandomNum;
		
		boolean numberchk = true;
		boolean updownchk = true;
		boolean game = true;
		

		while (game) {
			RandomNum = (int) (Math.random() * 100 + 1);

			while (updownchk) {
				System.out.println(min + " ~ " + max + "사이의 숫자를 입력해주세요.");
				usernum = scan.nextLine();
				System.out.println("입력한 숫자 : " + usernum);
				while (numberchk) {
					// 유효성 검사 - 숫자외 문자 검사
					for (int i = 0; i < usernum.length(); i++) {
						char ch = usernum.charAt(i);
						if (!(ch >='0' && ch <= '9')) {
							System.out.println("숫자가 아닙니다. 숫자로 다시입력해주세요.");
							usernum = scan.nextLine();
							i = 0;
						}
					}
					GameNum = Integer.parseInt(usernum);
					// 유효성 검사 - 숫자 범위 오버 검사
					if (!(GameNum >= min && GameNum <= max)) {
						System.out.println(min + " ~ " + max + "사이의 숫자를 다시입력해주세요.");
						usernum = scan.nextLine();
						numberchk = true;
					} else {
						numberchk = false;
					}
				}
				// 게임 체크부분
				GameNum = Integer.parseInt(usernum);
				if (RandomNum == GameNum) {
					System.out.println("숫자를 맞췄습니다.");
				} else if (RandomNum > GameNum) {
					System.out.println("UP입니다.");
					min = GameNum;
					
					numberchk = true;
				} else {
					System.out.println("Down입니다.");
					max = GameNum;
					numberchk = true;
				}
			}

			System.out.println("다시하시겠습니까? (y/n)");
			yorn = scan.nextLine().toUpperCase();
			if (yorn.equals("N")) {
				System.out.println("종료합니다.");
				game = false;
			} else {
				game = true;
				updownchk = true;
				min = 0;
				max = 100;
			}

		}

	}
}
