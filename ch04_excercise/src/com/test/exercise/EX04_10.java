package com.test.exercise;

public class EX04_10 {

	public static void main(String[] args) {
		//���ڿ��� ��ȯ���� ���� ���ڷθ� ó���ؾ� �Ѵ�.
		int num = 12345;
		int sum = 0;
		
		while(num>0){
			sum += num%10;
			num = num / 10;
			System.out.println(num);
		}

		System.out.println("sum = " + sum);
	}

}
