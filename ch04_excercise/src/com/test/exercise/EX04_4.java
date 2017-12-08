package com.test.exercise;

public class EX04_4 {
	public static void main(String[] args){
		int num = 0;
		int sum = 0;
		while(sum<=100){
			num++;
			sum += (num%2==0) ? (num*(-1)) : num;
			System.out.println(sum);
		}
		
		System.out.println("num = " + num);
		System.out.println("sum = " + sum);
		
		
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=i; j++)
			System.out.print("*");
			System.out.println();
			}

		
		
	}
}
