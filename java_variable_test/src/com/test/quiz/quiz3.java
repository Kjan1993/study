package com.test.quiz;

import java.util.Scanner;

public class quiz3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String save;
		String YorN;
		boolean decode = true;
		while (decode) {
			System.out.println("정수를 1~100을 입력해주세요.");
			save = scan.nextLine();
			for (int i = 0; i < save.length(); i++) {
				char ch = save.charAt(i);
				if (!(ch >= '0' && ch <= '9')) {
					System.out.println("정수가 아닙니다. 0~100까지의 정수로 입력해주세요.");
				} else if (ch >= '0' && ch <= '9') {
					System.out.print("입력하신 점수는 " + save + "점입니다.");
					save = "";
				}
				System.out.println();
				System.out.println("계속하시겠습니까?(y/n)");
				YorN = scan.nextLine().toUpperCase();
				if (YorN.equals("N")) {
					System.out.println("종료합니다.");
					decode = false;
				}else{
					decode = true;
				}
			}
		}
		
		
	}
}
