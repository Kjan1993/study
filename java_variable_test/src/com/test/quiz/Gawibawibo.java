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

		System.out.println("����,����,���� �����մϴ�.");

		while (regame) {
			while (decode) {
				System.out.println("����(1),����(2),��(3) �� �ϳ��� �Է��Ͻʽÿ�.");
				player = scan.nextLine();
				for (int i = 0; i < player.length(); i++) {
					char ch = player.charAt(i);
					if (!(ch > 48 && ch < 57)) {
						System.out.println("���ڰ� �ƴմϴ�. �ٽ��Է����ּ���.");
						player = scan.nextLine();

					} else if ((Integer.parseInt(player) < 1 || Integer.parseInt(player) > 3)) {
						System.out.println("1~3���ڷ� �ٽ��Է����ּ���.");
						player = scan.nextLine();

					}

				}
				if (Integer.parseInt(player) > 0 && Integer.parseInt(player) <= 3) {
					System.out.println("��ǻ�ʹ� " + ((com == 1) ? "����" : (com == 2) ? "����" : "��") + " �Դϴ�.");
					System.out.println("�÷��̾�� "
							+ ((Integer.parseInt(player) == 1) ? "����" : (Integer.parseInt(player) == 2) ? "����" : "��")
							+ " �Դϴ�.");

					switch (Integer.parseInt(player) - com) {
					case 2:
					case -1:
						System.out.println("�����ϴ�.");
						break;
					case 1:
					case -2:
						System.out.println("�̰���ϴ�.");
						break;
					case 0:
						System.out.println("�����ϴ�.");
						break;
					}
				}
				System.out.println("�ٽ��Ͻðڽ��ϱ�? (y/n)");
				while (yorn) {
					rsChack = scan.nextLine().toUpperCase();
					if (rsChack.equals("N")) {
						System.out.println("����");
						return;
					} else if (rsChack.equals("Y")) {
						decode = true;
						break;
					} else {
						System.out.println("y�Ǵ� n�� �Է����ּ���.");
						yorn = true;
					}
				}
			}
		}

	}

}
