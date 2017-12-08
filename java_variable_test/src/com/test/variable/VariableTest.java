package com.test.variable;

import java.util.Scanner;

public class VariableTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);// 시스템에 값을 입력받는 선언

		int kor;// int형으로 국어의 시험성적을 나타낼 kor이라는 변수로 선언
		int eng;// int형으로 영어의 시험성적을 나타낼 eng이라는 변수로 선언
		int math;// int형으로 수학의 시험성적을 나타낼 math이라는 변수로 선언
		// Quiz 3)
		// 입력되는 값은 0~100 정수만 가능;
		// '계속하시겠습니까?(y/n)' 메세지를 출력하고
		// 'n' 일때까지 반복.
		String scoreStr = "";
		boolean isNumber = false;
		int score = 0;

		String msg = "";
		while (!(isNumber)) {
			System.out.print("국어점수 : ");//
			scoreStr = scan.nextLine();
			char checkChar = ' ';
			for (int i = 0; i < scoreStr.length(); i++) {
				checkChar = scoreStr.charAt(i);
				if (checkChar >= '0' && checkChar <= '9') {
					isNumber = true;
				} else {
					isNumber = false;
					msg = "입력값이 올바즈리 않습니다.";
					break;
				}
			}
			if(isNumber){
				score = Integer.parseInt(scan.nextLine());
				msg= "0~100까지의 점수를 이력하세요.";
				
			}
			System.out.print("영어점수 : ");
			eng = Integer.parseInt(scan.nextLine());
			System.out.print("수학점수 : ");
			math = Integer.parseInt(scan.nextLine());
			/*int total = kor + eng + math;// int형으로 합계값을 나타낼 total이라는 변수를 선언하고
											// 국어,영어,수학의 점수를 전부 더한 값을 저장.

			float avg = total / 3;// float형으로 평균값을 나타내는 avg이라는 변수로 선언하고 합계값인
									// total을
									// 과목의 계수인 3으로 나눠 평균값을 구함.

			System.out.println("총점 : " + total);// 합계값을 콜솔에 출력
			System.out.println("평균 : " + avg);// 평균값을 콜솔에 출력
			/*
			 * // 논리연산자 int k = 9;// int형으로 k라는 변수 선언하고 k값은 9라고 정의 int l = 10;//
			 * int형으로 l라는 변수 선언하고 l값은 10라고 정의
			 * 
			 * System.out.println(k >= 9 && (l = 11) > 10);// and 연산자이고 앞에 연산이
			 * // true일때만 // 뒤에를 연산 System.out.println(l);// 반환한 값을 콘솔창에 출력
			 * 
			 * l = 10;// l값을 10이라고 재정의함 System.out.println(k >= 9 || (l = 11) >
			 * 10);// or 연산자이고 앞에 연산이 false // 일때만 // 뒤에를 연산
			 * System.out.println(l);// 반환한 값을 콘솔창에 출력
			 * 
			 * // 대입연산자
			 * 
			 * int m = 0;// int형으로 m을 선언하고 m값을 0으로 정의 m = m + 1;// m값에 1을 더해서 저장
			 * m = m + 1;// m값에 1을 더해서 저장 m = m + 1;// m값에 1을 더해서 저장 m = m +
			 * 1;// m값에 1을 더해서 저장 System.out.println("m = m+1 : " + m);// 모두 더한
			 * 최종값을 출력
			 
			// Quiz 2)
			// 평균이 90점이상 : A
			// 평균이 80이상 : B
			// 평균이 80미만 : F
			// 를 출력하시오.

			char grade = (avg >= 90) ? 'A' : ((avg >= 80) ? 'B' : 'F');
			// System.out.println("학점 : " + grade);// Quiz2 문제 답안 삼항 연산자에 삼항
			// 연산자를
			// 사용하여
			// 평균값이 90이상이면
			// A이라는 문자값을 평균값이80이상이면 B라는 문자값을
			// A도
			// B도 아니면 F라는 문자값을 출력

			String gradeIf = " ";// String으로 문자열 선언 및 공백으로 초기화
			if (avg >= 90) {// if문 평균값이 90이상이면 수행하는 조건
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

			System.out.println("학점 : " + gradeIf);
			System.out.println();
			System.out.print("계속하시겠습니까?(y/n)");
			//answer = scan.nextLine().toLowerCase();
*/
		}
	}

}
