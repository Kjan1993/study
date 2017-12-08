package com.test.statement;

import java.util.Scanner;

public class StatementTest {

	public static void main(String[] args) {
		int kor;
		int eng;
		int math;
		String grade;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("국어 : ");
		kor = Integer.parseInt(scan.nextLine());
		System.out.print("영어 : ");
		eng = Integer.parseInt(scan.nextLine());
		System.out.print("수학 : ");
		math = Integer.parseInt(scan.nextLine());

		float avg = (kor + eng + math) / 3f;

		switch ((int) (avg / 10)) {
		case 10:case 9:
			grade="A";
			break;
		case 8:
			grade="B";
			break;
		case 7:
			grade="C";
			break;
		case 6:
			grade="D";
			break;
		default:
			grade="F";
		}
		
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + grade);

	}

}
