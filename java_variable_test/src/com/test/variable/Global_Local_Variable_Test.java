package com.test.variable;

public class Global_Local_Variable_Test {
	
	static int x = 10;//전역변수
	
	public static void main(String[] args) {
		//int x = 10000; 지역변수
		System.out.println(x);//값을 끌어올때 우선 적으로 가까운 지역변수에서 값을 끌어지만
							  //지역변수에 선언된게 없다면 전역변수에서 값을 끌어옴 만약에 전역변수도 없다면 잘못된사용으로 오류발생 

	}

}
