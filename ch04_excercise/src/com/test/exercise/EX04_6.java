package com.test.exercise;

import java.util.Scanner;

public class EX04_6 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int sum = Integer.parseInt(scan.nextLine());
		
		
		//�Ϲ�ȭ �ڵ�� ���뼺�� ������
		for(int num1 = 1; num1<7;num1++){
			for(int num2=1; num2<7;num2++){
				if(num1+num2==sum){
					System.out.println("(" + num1 + "," + num2 + ")" );
				}
			}
		}
		
		//Ưȭ�Ǿ �Ϲ�ȭ �ϱ������ ���뼺�� ������
		for(int num3=1; num3<7;num3++){
			if(sum-num3>0){
				System.out.println("("+num3+","+(sum-num3)+")");
			}
		}
		
		
	}
}
