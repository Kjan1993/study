package com.test.quiz;

import java.util.Scanner;

public class UpDownGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// �������� ����
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
				System.out.println(min + " ~ " + max + "������ ���ڸ� �Է����ּ���.");
				usernum = scan.nextLine();
				System.out.println("�Է��� ���� : " + usernum);
				while (numberchk) {
					// ��ȿ�� �˻� - ���ڿ� ���� �˻�
					for (int i = 0; i < usernum.length(); i++) {
						char ch = usernum.charAt(i);
						if (!(ch >='0' && ch <= '9')) {
							System.out.println("���ڰ� �ƴմϴ�. ���ڷ� �ٽ��Է����ּ���.");
							usernum = scan.nextLine();
							i = 0;
						}
					}
					GameNum = Integer.parseInt(usernum);
					// ��ȿ�� �˻� - ���� ���� ���� �˻�
					if (!(GameNum >= min && GameNum <= max)) {
						System.out.println(min + " ~ " + max + "������ ���ڸ� �ٽ��Է����ּ���.");
						usernum = scan.nextLine();
						numberchk = true;
					} else {
						numberchk = false;
					}
				}
				// ���� üũ�κ�
				GameNum = Integer.parseInt(usernum);
				if (RandomNum == GameNum) {
					System.out.println("���ڸ� ������ϴ�.");
				} else if (RandomNum > GameNum) {
					System.out.println("UP�Դϴ�.");
					min = GameNum;
					
					numberchk = true;
				} else {
					System.out.println("Down�Դϴ�.");
					max = GameNum;
					numberchk = true;
				}
			}

			System.out.println("�ٽ��Ͻðڽ��ϱ�? (y/n)");
			yorn = scan.nextLine().toUpperCase();
			if (yorn.equals("N")) {
				System.out.println("�����մϴ�.");
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
