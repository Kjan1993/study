package com.test.array;

import java.util.Scanner;

public class ArrayTest01 {
	int x = 30; //자바의 힙에어리어 메모리 할당지역
				//전역변수로 int형 x= 30을 정의
	
	{//메소드 에어리어 1번 블럭
		int x = 10000000;//지역변수로 int형 x값을 천만을 정의 
						 //1번 블럭안에서는 안의 블럭에서 사용가능
		//int x;
		System.out.println(x);//가까운 에어리어에 필요한 값이 없다면 외부에서 찾음
		{//2-1번으로 1번 블럭안에 독립적인 블럭
			int y;//2-1번 블럭내의 변수
			//int x; <-  지역변수 중 상위인 1번 블럭의 영향을 받기때문에
			//같은 변수명이 존재하면 변수가 중복으로 인식하여 오류가 발생
			{
				//int x;<- 상위 1,2-1번블럭의 영향을 받기때문에
				//같은 변수 명을 선언하면 중복으로 인식하여 오류가 발생
			}
		}
		
		{
			int y;//2-2번 블럭 이 블럭을 포함한 1번블럭과 변수명이 같은
				  //변수가 선언되면 오류가 발생하지만
				  //2-1번과는 독립된 지역이기 때문에 2-2번과는 변수명이 중복되도
			      //오류가 발생하지 않는다.
		}
	}
	
	public static void main(String[] args) {
		
		
		// 1차원 배열(행)
		int[] intArray = new int[5];// int형 배열의 선언과 생성을 동시한다.
									// 배열의 크기를 5인 int형으로 선언
		intArray[0] = 1;// intArray배열에 0번째에 1이라는 값을 넣는다
		intArray[1] = 2;// intArray배열에 1번째에 2이라는 값을 넣는다
		intArray[2] = 3;// intArray배열에 2번째에 3이라는 값을 넣는다
		intArray[3] = 4;// intArray배열에 3번째에 4이라는 값을 넣는다
		intArray[4] = 5;// intArray배열에 4번째에 5이라는 값을 넣는다

		int[] intArray2 = { 1, 2, 3, 4, 5 };//int형으로 배열을 선언하고
		//선언과 동시에 값을 할당

		int[] intArray3 = new int[] { 1, 2, 3, 4, 5 };// 배열을 재정의할때 사용

		int[] intArray4 = new int[100];//int형으로 배열크기를 100으로 선언과 생성을
									   //동시에 했다
		for (int index = 0; index < intArray4.length; index++) {//for문으로 intArray4의 크기만큼 1씩증가하는것을 반복
			intArray4[index] = index + 1;//intArray4의 인덱스의 순서가
			//0부터 1씩 증가하면서 인덱스 값의 +1한 숫자를 저장
											
			System.out.print(intArray4[index] + (!(intArray4[index] % 10 == 0) ? "," : "\n"));
			//for문안에서 index의 순서대로 저장되있는 값을 찍어주고
			//index안의 저장된 값을 10으로 나는 나머지가
			//0이 아니면 ,를 값뒤에 찍어주고 0이면 줄바꿈을 해준다
		}

		// 2차원 배열(행x열) =>배열 안에 배열
		int[][] intArrays = new int[3][3];//2차원 배열을 int형으로 3행에 3열로 선언및 생성

		int[][] intArrays2 = { //int형으로 2차원 배열로 3행 3열로 선언하면서 배열안에 값을 할당
								{ 1, 2, 3 },
								{ 4, 5, 6 }, 
								{ 7, 8, 9 } 
							 };
		
		
		//215p 행의 평균
		int[][] scoreTable = {//int형으로 2차원 배열로 5행 3열로 선언과 동시에 값을 할당
				  {100, 100, 100},
				  {20, 20, 20},
				  {30, 30, 30},
				  {40, 40, 40},
				  {50, 50, 50}
				};
		int total = 0;//int형으로 한행당 총합값을 저장해줄 변수 선언및 초기화 정의
		System.out.println(scoreTable.length);
		System.out.println(scoreTable[0].length);
		for(int row=0; row<scoreTable.length; row++){//for문으로 row값을 int형으로 0으로 선언 배열의 행의 크기만큼 반복하고 row값이 1씩 증가
			total = 0;//행의 열값을 더했던 총합을 다음행에서 다시 열의 총합을 더하기위해 초기화 
			for(int col=0; col<scoreTable[row].length; col++){//for문으로 col값을 int형 0으로 선언 col값이 row값의 크기보다 작은 작을때까지 반복하고 col값이 1씩증가
				total += scoreTable[row][col];// total에 scoreTable배열의 (0,0)부터 col값이 증가하면서 0행의 값들을 더한다. for문에 의해서 모든행 반복 
			}
			System.out.println(row);
			System.out.println((row+1)+"번 학생 평균 :" + (total*1f/scoreTable[row].length));//각행마다의 총합을 float형으로 행의 크기로 나눠서 나온 평균값을 출력해줌
		}
		//열의 평균
		int kortotal = 0;//int형으로 scoreTable 0열의 모든 행값을 더한 값을 저장할 변수
		int engtotal = 0;//int형으로 scoreTable 1열의 모든 행값을 더한 값을 저장할 변수
		int mathtotal = 0;//int형으로 scoreTable 2열의 모든 행값을 더한 값을 저장할 변수
		
			for(int x=0;x<scoreTable.length;x++){//for문으로 int형 x값을 0부터 scoreTable의 크기보다 작을때까지 반복하며 x값이 1씩증가한다. 
				kortotal += scoreTable[x][0];//각행의 0열에 있는 값들을 모두 더해서 kortotal에 저장
				engtotal += scoreTable[x][1];//각행의 1열에 있는 값들을 모두 더해서 engtotal에 저장
				mathtotal += scoreTable[x][2];//각행의 2열에 있는 값들을 모두 더해서 mathtotal에 저장
			}
		
			System.out.println("1."+kortotal/3f);//kortotal값을 float형 3으로 나눠서 나온값을 출력
			System.out.println("2."+engtotal/3f);//engtotal값을 float형 3으로 나눠서 나온값을 출력
			System.out.println("3."+mathtotal/3f);//mathtotal값을 float형 3으로 나눠서 나온값을 출력
			
		
	}

}
