package com.test.math;

public class MathRandomTest {

	public static void main(String[] args) {
		// 0<=math.random()<1 �� ������ �Ǽ�
		System.out.println(Math.random());//random�Լ��� �⺻ double��
		
		int randomInt = (int) (Math.random()*10+1);
		System.out.println(randomInt);

	}

}