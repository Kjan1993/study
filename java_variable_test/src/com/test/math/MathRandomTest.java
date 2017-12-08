package com.test.math;

public class MathRandomTest {

	public static void main(String[] args) {
		// 0<=math.random()<1 인 임의의 실수
		System.out.println(Math.random());//random함수는 기본 double형
		
		int randomInt = (int) (Math.random()*10+1);
		System.out.println(randomInt);

	}

}
