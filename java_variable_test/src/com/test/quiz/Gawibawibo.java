package com.test.quiz;

import java.util.Scanner;

public class Gawibawibo {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int com = (int) (Math.random() * 3 + 1);
		String player = "";
		String rsChack = "";
		boolean regame = true;
		boolean decode = true;
		boolean yorn = true;

		System.out.println("가위,바위,보를 시작합니다.");

		while (regame) {
			while (decode) {
				System.out.println("가위(1),바위(2),보(3) 중 하나를 입력하십시오.");
				player = scan.nextLine();
				for (int i = 0; i < player.length(); i++) {
					char ch = player.charAt(i);
					if (!(ch > 48 && ch < 57)) {
						System.out.println("숫자가 아닙니다. 다시입력해주세요.");
						player = scan.nextLine();

					} else if ((Integer.parseInt(player) < 1 || Integer.parseInt(player) > 3)) {
						System.out.println("1~3숫자로 다시입력해주세요.");
						player = scan.nextLine();

					}

				}
				if (Integer.parseInt(player) > 0 && Integer.parseInt(player) <= 3) {
					System.out.println("컴퓨터는 " + ((com == 1) ? "가위" : (com == 2) ? "바위" : "보") + " 입니다.");
					System.out.println("플레이어는 "
							+ ((Integer.parseInt(player) == 1) ? "가위" : (Integer.parseInt(player) == 2) ? "바위" : "보")
							+ " 입니다.");

					switch (Integer.parseInt(player) - com) {
					case 2:
					case -1:
						System.out.println("졌습니다.");
						break;
					case 1:
					case -2:
						System.out.println("이겼습니다.");
						break;
					case 0:
						System.out.println("비겼습니다.");
						break;
					}
				}
				System.out.println("다시하시겠습니까? (y/n)");
				while (yorn) {
					rsChack = scan.nextLine().toUpperCase();
					if (rsChack.equals("N")) {
						System.out.println("종료");
						return;
					} else if (rsChack.equals("Y")) {
						decode = true;
						break;
					} else {
						System.out.println("y또는 n을 입력해주세요.");
						yorn = true;
					}
				}
			}
		}

	}

}
