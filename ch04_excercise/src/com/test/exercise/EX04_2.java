package com.test.exercise;

public class EX04_2 {
	public static void main(String[] arg){
		//4-2
				//1부터 20까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합을 구하시오...
				int sum = 0;
				for(int i = 1;i<21;i++){
					if(!(i%2==0 || i%3 ==0)){
						sum += i;//<- sum + num 과 같다
						System.out.println(sum);
					}
				}
				System.out.println(sum);
	}
}
