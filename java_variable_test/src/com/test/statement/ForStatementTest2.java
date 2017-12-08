package com.test.statement;

public class ForStatementTest2 {

	public static void main(String[] args) {

		// 1~10사이의 짝수를 더하시오.
		System.out.println("1~10사이의 짝수를 더하시오.");// 문자열 출력
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.println("더해진 정수는 : " + i);
				sum = sum + i;
			}
		}
		System.out.println(sum);

		// 구구단, 2단을 작성하시오.
		System.out.println("구구단, 2단을 작성하시오.");// 콘솔에 구구단, 2단을 작성하시오라는 문자열을 출력해줌
		int dan = 2;// 구구단 중 2중
		for (int gop = 1; gop < 10; gop++) {
			System.out.println("2 * " + gop + " = " + dan * gop);//
		}

		for (int gogodan = 2; gogodan < 10; gogodan++) {
			System.out.println(gogodan + "단 시작");
			for (int gop2 = 1; gop2 < 10; gop2++) {
				System.out.println(gogodan + " * " + gop2 + " = " + gogodan * gop2);
			}
		}
		
		//별찍기 삼각형
		char star = '*';
		for (int row = 1; row < 11; row++) {
			for (int num = 1; num < row+1; num++) {
				System.out.print(star);
			}
			System.out.println();
		}
		System.out.println();
		
		//별찍기 역삼각형
		int rows = 10;
		for (int roww = 1; roww < rows+1; roww++) {
			for (int numm = 1; numm < rows-roww+2; numm++) {
				System.out.print(star);
			}
			System.out.println();
		}
		
		//숫자 삼각형
		int value = 0;
		for (int row = 1; row < 8; row++) {
			for (int num = 1; num < row+1; num++) {
				System.out.print(++value);
			}
			System.out.println();
		}
		
	}

}
