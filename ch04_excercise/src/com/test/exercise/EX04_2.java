package com.test.exercise;

public class EX04_2 {
	public static void main(String[] arg){
		//4-2
				//1���� 20������ ���� �߿��� 2�Ǵ� 3�� ����� �ƴ� ���� ������ ���Ͻÿ�...
				int sum = 0;
				for(int i = 1;i<21;i++){
					if(!(i%2==0 || i%3 ==0)){
						sum += i;//<- sum + num �� ����
						System.out.println(sum);
					}
				}
				System.out.println(sum);
	}
}
