package com.test.variable;

import java.util.Scanner;

public class VariableTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);// �ý��ۿ� ���� �Է¹޴� ����

		int kor;// int������ ������ ���輺���� ��Ÿ�� kor�̶�� ������ ����
		int eng;// int������ ������ ���輺���� ��Ÿ�� eng�̶�� ������ ����
		int math;// int������ ������ ���輺���� ��Ÿ�� math�̶�� ������ ����
		// Quiz 3)
		// �ԷµǴ� ���� 0~100 ������ ����;
		// '����Ͻðڽ��ϱ�?(y/n)' �޼����� ����ϰ�
		// 'n' �϶����� �ݺ�.
		String scoreStr = "";
		boolean isNumber = false;
		int score = 0;

		String msg = "";
		while (!(isNumber)) {
			System.out.print("�������� : ");//
			scoreStr = scan.nextLine();
			char checkChar = ' ';
			for (int i = 0; i < scoreStr.length(); i++) {
				checkChar = scoreStr.charAt(i);
				if (checkChar >= '0' && checkChar <= '9') {
					isNumber = true;
				} else {
					isNumber = false;
					msg = "�Է°��� �ù�� �ʽ��ϴ�.";
					break;
				}
			}
			if(isNumber){
				score = Integer.parseInt(scan.nextLine());
				msg= "0~100������ ������ �̷��ϼ���.";
				
			}
			System.out.print("�������� : ");
			eng = Integer.parseInt(scan.nextLine());
			System.out.print("�������� : ");
			math = Integer.parseInt(scan.nextLine());
			/*int total = kor + eng + math;// int������ �հ谪�� ��Ÿ�� total�̶�� ������ �����ϰ�
											// ����,����,������ ������ ���� ���� ���� ����.

			float avg = total / 3;// float������ ��հ��� ��Ÿ���� avg�̶�� ������ �����ϰ� �հ谪��
									// total��
									// ������ ����� 3���� ���� ��հ��� ����.

			System.out.println("���� : " + total);// �հ谪�� �ݼֿ� ���
			System.out.println("��� : " + avg);// ��հ��� �ݼֿ� ���
			/*
			 * // �������� int k = 9;// int������ k��� ���� �����ϰ� k���� 9��� ���� int l = 10;//
			 * int������ l��� ���� �����ϰ� l���� 10��� ����
			 * 
			 * System.out.println(k >= 9 && (l = 11) > 10);// and �������̰� �տ� ������
			 * // true�϶��� // �ڿ��� ���� System.out.println(l);// ��ȯ�� ���� �ܼ�â�� ���
			 * 
			 * l = 10;// l���� 10�̶�� �������� System.out.println(k >= 9 || (l = 11) >
			 * 10);// or �������̰� �տ� ������ false // �϶��� // �ڿ��� ����
			 * System.out.println(l);// ��ȯ�� ���� �ܼ�â�� ���
			 * 
			 * // ���Կ�����
			 * 
			 * int m = 0;// int������ m�� �����ϰ� m���� 0���� ���� m = m + 1;// m���� 1�� ���ؼ� ����
			 * m = m + 1;// m���� 1�� ���ؼ� ���� m = m + 1;// m���� 1�� ���ؼ� ���� m = m +
			 * 1;// m���� 1�� ���ؼ� ���� System.out.println("m = m+1 : " + m);// ��� ����
			 * �������� ���
			 
			// Quiz 2)
			// ����� 90���̻� : A
			// ����� 80�̻� : B
			// ����� 80�̸� : F
			// �� ����Ͻÿ�.

			char grade = (avg >= 90) ? 'A' : ((avg >= 80) ? 'B' : 'F');
			// System.out.println("���� : " + grade);// Quiz2 ���� ��� ���� �����ڿ� ����
			// �����ڸ�
			// ����Ͽ�
			// ��հ��� 90�̻��̸�
			// A�̶�� ���ڰ��� ��հ���80�̻��̸� B��� ���ڰ���
			// A��
			// B�� �ƴϸ� F��� ���ڰ��� ���

			String gradeIf = " ";// String���� ���ڿ� ���� �� �������� �ʱ�ȭ
			if (avg >= 90) {// if�� ��հ��� 90�̻��̸� �����ϴ� ����
				gradeIf = "A";//
				if (avg >= 95) {
					gradeIf = gradeIf + "+";
				}
			} else if (avg >= 80) {
				gradeIf = "B";
				if (avg >= 85) {
					gradeIf = gradeIf + "+";
				}
			} else {
				gradeIf = "F";
			}

			System.out.println("���� : " + gradeIf);
			System.out.println();
			System.out.print("����Ͻðڽ��ϱ�?(y/n)");
			//answer = scan.nextLine().toLowerCase();
*/
		}
	}

}
