package com.test.statement;

public class ForStatementTest2 {

	public static void main(String[] args) {

		// 1~10������ ¦���� ���Ͻÿ�.
		System.out.println("1~10������ ¦���� ���Ͻÿ�.");// ���ڿ� ���
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.println("������ ������ : " + i);
				sum = sum + i;
			}
		}
		System.out.println(sum);

		// ������, 2���� �ۼ��Ͻÿ�.
		System.out.println("������, 2���� �ۼ��Ͻÿ�.");// �ֿܼ� ������, 2���� �ۼ��Ͻÿ���� ���ڿ��� �������
		int dan = 2;// ������ �� 2��
		for (int gop = 1; gop < 10; gop++) {
			System.out.println("2 * " + gop + " = " + dan * gop);//
		}

		for (int gogodan = 2; gogodan < 10; gogodan++) {
			System.out.println(gogodan + "�� ����");
			for (int gop2 = 1; gop2 < 10; gop2++) {
				System.out.println(gogodan + " * " + gop2 + " = " + gogodan * gop2);
			}
		}
		
		//����� �ﰢ��
		char star = '*';
		for (int row = 1; row < 11; row++) {
			for (int num = 1; num < row+1; num++) {
				System.out.print(star);
			}
			System.out.println();
		}
		System.out.println();
		
		//����� ���ﰢ��
		int rows = 10;
		for (int roww = 1; roww < rows+1; roww++) {
			for (int numm = 1; numm < rows-roww+2; numm++) {
				System.out.print(star);
			}
			System.out.println();
		}
		
		//���� �ﰢ��
		int value = 0;
		for (int row = 1; row < 8; row++) {
			for (int num = 1; num < row+1; num++) {
				System.out.print(++value);
			}
			System.out.println();
		}
		
	}

}
