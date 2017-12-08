package com.test.statement;

import java.util.Scanner;

public class ForStatementTest {

	public static void main(String[] args) {
		int sum = 0;
		int sumPlus = 0;
		for(int i=1;i<11;i++){
			sum+=i;
			sumPlus += sum;
		}
		System.out.println(sumPlus);
		
		Scanner scan = new Scanner(System.in);
		
		while(!scan.nextLine().equals("y")){
			System.out.println("y를 누르기 전까지 반복합니다.");
		}
	}

}
