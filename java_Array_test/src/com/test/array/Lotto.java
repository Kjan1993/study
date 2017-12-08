package com.test.array;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("세트수를 입력하세요 : ");
		int inputNum = Integer.parseInt(sc.nextLine());
		for (int loop = 1; loop <= inputNum; loop++) {
			int[] lottoNum = new int[45];
			for (int i = 0; i < lottoNum.length; i++) {
				lottoNum[i] = i + 1;
			}

			int tempNum = 0;
			int changeIndex = 0;
			for (int i = 0; i < lottoNum.length * 2; i++) {
				changeIndex = (int) (Math.random() * lottoNum.length);
				tempNum = lottoNum[changeIndex];
				lottoNum[changeIndex] = lottoNum[0];
				lottoNum[0] = tempNum;
				
			}
			int[] sort = new int[6];
			sort = Arrays.copyOfRange(lottoNum, 0, 6);
			Arrays.sort(sort);
			System.out.println(Arrays.toString(sort));
		}
	}

}
