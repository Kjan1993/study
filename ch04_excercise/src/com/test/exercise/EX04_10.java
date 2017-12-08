package com.test.exercise;

public class EX04_10 {

	public static void main(String[] args) {
		//문자열로 변환하지 말고 숫자로만 처리해야 한다.
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
