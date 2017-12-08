package com.test.exercise;

import java.util.Scanner;

public class EX04_6 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int sum = Integer.parseInt(scan.nextLine());
		
		
		//일반화 코드로 범용성이 용이함
		for(int num1 = 1; num1<7;num1++){
			for(int num2=1; num2<7;num2++){
				if(num1+num2==sum){
					System.out.println("(" + num1 + "," + num2 + ")" );
				}
			}
		}
		
		//특화되어서 일반화 하기힘들어 범용성이 떨어짐
		for(int num3=1; num3<7;num3++){
			if(sum-num3>0){
				System.out.println("("+num3+","+(sum-num3)+")");
			}
		}
		
		
	}
}
