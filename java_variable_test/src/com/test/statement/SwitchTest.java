package com.test.statement;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		// �����
		// ���̵� �迭
		String[] idArray = new String[100];
		idArray[0] = "mimi";
		idArray[1] = "mama";
		idArray[2] = "mumu";

		// �н����� �迭
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

		// �޴��κ�
		while (decode) {
			System.out.println("*** ���� ���� ���α׷� ***");
			System.out.println("[1]�α���");
			System.out.println("[2]ȸ������");
			System.out.println("[3]���̵�/�н�����ã��");
			System.out.println("[4]����");
			System.out.println("�޴��� �������ּ���.");

			menu = scan.nextLine();
			String msg = "";
			switch (menu) {
			case "1":
				msg = "�α����� �����ϼ̽��ϴ�.";
				System.out.print("���̵� �Է����ּ��� :");
				idStr = scan.nextLine();

				System.out.print("�н����带 �Է����ּ��� : ");
				pwdStr = scan.nextLine();

				for (int login = 0; login <= info; login++) {
					if (idStr.equals(idArray[login])) {
						if (pwdStr.equals(pwdArray[login])) {
							System.out.println("�α��ο� �����Ͽ����ϴ�.");
							break;
						} else {
							System.out.println("�н����尡 Ʋ�Ƚ��ϴ�. ���Է��ϼ���.");
							break;
						}
					} else if (login == info) {
						System.out.println("���̵� �Ǵ� �н����尡 Ʋ�Ƚ��ϴ�. ���Է��ϼ���.");
					}
				}

				break;
			case "2":
				msg = "ȸ�������� �����ϼ̽��ϴ�.";
				System.out.println("ȸ�����Կ� �ʿ��� ���̵�� ��й�ȣ�� �Է����ּ���.");
				System.out.print("���̵� : ");
				idArray[info] = scan.nextLine();
				System.out.print("�е���� : ");
				pwdArray[info] = scan.nextLine();

				info++;

				break;
			case "3":
				msg = "���̵�/�н����� ã�⸦ �����ϼ̽��ϴ�.";
				break;
			case "4":
				msg = "���α׷��� �����մϴ�.";
				System.out.println(msg);
				return;

			default:
				msg = "�޴� ������ �ùٸ��� �ʽ��ϴ�.";
			}

		}
	}

}
