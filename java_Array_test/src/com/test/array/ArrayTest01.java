package com.test.array;

import java.util.Scanner;

public class ArrayTest01 {
	int x = 30; //�ڹ��� ������� �޸� �Ҵ�����
				//���������� int�� x= 30�� ����
	
	{//�޼ҵ� ����� 1�� ��
		int x = 10000000;//���������� int�� x���� õ���� ���� 
						 //1�� ���ȿ����� ���� ������ ��밡��
		//int x;
		System.out.println(x);//����� ���� �ʿ��� ���� ���ٸ� �ܺο��� ã��
		{//2-1������ 1�� ���ȿ� �������� ��
			int y;//2-1�� ������ ����
			//int x; <-  �������� �� ������ 1�� ���� ������ �ޱ⶧����
			//���� �������� �����ϸ� ������ �ߺ����� �ν��Ͽ� ������ �߻�
			{
				//int x;<- ���� 1,2-1������ ������ �ޱ⶧����
				//���� ���� ���� �����ϸ� �ߺ����� �ν��Ͽ� ������ �߻�
			}
		}
		
		{
			int y;//2-2�� �� �� ���� ������ 1������ �������� ����
				  //������ ����Ǹ� ������ �߻�������
				  //2-1������ ������ �����̱� ������ 2-2������ �������� �ߺ��ǵ�
			      //������ �߻����� �ʴ´�.
		}
	}
	
	public static void main(String[] args) {
		
		
		// 1���� �迭(��)
		int[] intArray = new int[5];// int�� �迭�� ����� ������ �����Ѵ�.
									// �迭�� ũ�⸦ 5�� int������ ����
		intArray[0] = 1;// intArray�迭�� 0��°�� 1�̶�� ���� �ִ´�
		intArray[1] = 2;// intArray�迭�� 1��°�� 2�̶�� ���� �ִ´�
		intArray[2] = 3;// intArray�迭�� 2��°�� 3�̶�� ���� �ִ´�
		intArray[3] = 4;// intArray�迭�� 3��°�� 4�̶�� ���� �ִ´�
		intArray[4] = 5;// intArray�迭�� 4��°�� 5�̶�� ���� �ִ´�

		int[] intArray2 = { 1, 2, 3, 4, 5 };//int������ �迭�� �����ϰ�
		//����� ���ÿ� ���� �Ҵ�

		int[] intArray3 = new int[] { 1, 2, 3, 4, 5 };// �迭�� �������Ҷ� ���

		int[] intArray4 = new int[100];//int������ �迭ũ�⸦ 100���� ����� ������
									   //���ÿ� �ߴ�
		for (int index = 0; index < intArray4.length; index++) {//for������ intArray4�� ũ�⸸ŭ 1�������ϴ°��� �ݺ�
			intArray4[index] = index + 1;//intArray4�� �ε����� ������
			//0���� 1�� �����ϸ鼭 �ε��� ���� +1�� ���ڸ� ����
											
			System.out.print(intArray4[index] + (!(intArray4[index] % 10 == 0) ? "," : "\n"));
			//for���ȿ��� index�� ������� ������ִ� ���� ����ְ�
			//index���� ����� ���� 10���� ���� ��������
			//0�� �ƴϸ� ,�� ���ڿ� ����ְ� 0�̸� �ٹٲ��� ���ش�
		}

		// 2���� �迭(��x��) =>�迭 �ȿ� �迭
		int[][] intArrays = new int[3][3];//2���� �迭�� int������ 3�࿡ 3���� ����� ����

		int[][] intArrays2 = { //int������ 2���� �迭�� 3�� 3���� �����ϸ鼭 �迭�ȿ� ���� �Ҵ�
								{ 1, 2, 3 },
								{ 4, 5, 6 }, 
								{ 7, 8, 9 } 
							 };
		
		
		//215p ���� ���
		int[][] scoreTable = {//int������ 2���� �迭�� 5�� 3���� ����� ���ÿ� ���� �Ҵ�
				  {100, 100, 100},
				  {20, 20, 20},
				  {30, 30, 30},
				  {40, 40, 40},
				  {50, 50, 50}
				};
		int total = 0;//int������ ����� ���հ��� �������� ���� ����� �ʱ�ȭ ����
		System.out.println(scoreTable.length);
		System.out.println(scoreTable[0].length);
		for(int row=0; row<scoreTable.length; row++){//for������ row���� int������ 0���� ���� �迭�� ���� ũ�⸸ŭ �ݺ��ϰ� row���� 1�� ����
			total = 0;//���� ������ ���ߴ� ������ �����࿡�� �ٽ� ���� ������ ���ϱ����� �ʱ�ȭ 
			for(int col=0; col<scoreTable[row].length; col++){//for������ col���� int�� 0���� ���� col���� row���� ũ�⺸�� ���� ���������� �ݺ��ϰ� col���� 1������
				total += scoreTable[row][col];// total�� scoreTable�迭�� (0,0)���� col���� �����ϸ鼭 0���� ������ ���Ѵ�. for���� ���ؼ� ����� �ݺ� 
			}
			System.out.println(row);
			System.out.println((row+1)+"�� �л� ��� :" + (total*1f/scoreTable[row].length));//���ึ���� ������ float������ ���� ũ��� ������ ���� ��հ��� �������
		}
		//���� ���
		int kortotal = 0;//int������ scoreTable 0���� ��� �ప�� ���� ���� ������ ����
		int engtotal = 0;//int������ scoreTable 1���� ��� �ప�� ���� ���� ������ ����
		int mathtotal = 0;//int������ scoreTable 2���� ��� �ప�� ���� ���� ������ ����
		
			for(int x=0;x<scoreTable.length;x++){//for������ int�� x���� 0���� scoreTable�� ũ�⺸�� ���������� �ݺ��ϸ� x���� 1�������Ѵ�. 
				kortotal += scoreTable[x][0];//������ 0���� �ִ� ������ ��� ���ؼ� kortotal�� ����
				engtotal += scoreTable[x][1];//������ 1���� �ִ� ������ ��� ���ؼ� engtotal�� ����
				mathtotal += scoreTable[x][2];//������ 2���� �ִ� ������ ��� ���ؼ� mathtotal�� ����
			}
		
			System.out.println("1."+kortotal/3f);//kortotal���� float�� 3���� ������ ���°��� ���
			System.out.println("2."+engtotal/3f);//engtotal���� float�� 3���� ������ ���°��� ���
			System.out.println("3."+mathtotal/3f);//mathtotal���� float�� 3���� ������ ���°��� ���
			
		
	}

}
