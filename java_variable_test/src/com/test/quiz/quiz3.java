package com.test.quiz;

import java.util.Scanner;

public class quiz3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String save;
		String YorN;
		boolean decode = true;
		while (decode) {
			System.out.println("������ 1~100�� �Է����ּ���.");
			save = scan.nextLine();
			for (int i = 0; i < save.length(); i++) {
				char ch = save.charAt(i);
				if (!(ch >= '0' && ch <= '9')) {
					System.out.println("������ �ƴմϴ�. 0~100������ ������ �Է����ּ���.");
				} else if (ch >= '0' && ch <= '9') {
					System.out.print("�Է��Ͻ� ������ " + save + "���Դϴ�.");
					save = "";
				}
				System.out.println();
				System.out.println("����Ͻðڽ��ϱ�?(y/n)");
				YorN = scan.nextLine().toUpperCase();
				if (YorN.equals("N")) {
					System.out.println("�����մϴ�.");
					decode = false;
				}else{
					decode = true;
				}
			}
		}
		
		
	}
}
