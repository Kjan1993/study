package com.test.exercise;

public class EX04_1 {

	public static void main(String[] args) {
		// 4-1 1.
		int x = 11; //int형으로 x값을 11로 설정
		System.out.println(x > 10 && x < 20);// x값이 10보다 크거나 20보다 작으면 true 아니면 false

		// 4-1 2.
		char ch = ' ';//char형으로 ch값을 공백으로 설정
		System.out.println(!(ch == ' ' && ch == '\t'));//ch이 공백이거나 tap이면 false

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
