package com.test.exercise;

public class EX04_1 {

	public static void main(String[] args) {
		// 4-1 1.
		int x = 11; //int������ x���� 11�� ����
		System.out.println(x > 10 && x < 20);// x���� 10���� ũ�ų� 20���� ������ true �ƴϸ� false

		// 4-1 2.
		char ch = ' ';//char������ ch���� �������� ����
		System.out.println(!(ch == ' ' && ch == '\t'));//ch�� �����̰ų� tap�̸� false

		// 4-1 3.
		System.out.println(ch == 'x' || ch == 'X');//ch

		// 4-1 4.
		System.out.println(ch >= '0' && ch <= '9');

		// 4-1 5.
		System.out.println((ch > 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'X'));

		// 4-1 6.
		int year = 2000;
		System.out.println(((year % 400) == 0) || ((year % 4) == 0 && (year % 100) != 0));

		// 4-1 7.
		boolean powerOn = false;
		System.out.println(!powerOn);

		// 4-1 8.
		String str = "yes";
		System.out.println(str.equals("yes"));

	}

}
