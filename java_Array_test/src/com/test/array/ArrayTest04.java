package com.test.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] MorN = new int[7];
		
		for(int i=0; i<MorN.length;i++){
			System.out.print(i+1 +"번째 숫자 : ");
			MorN[i] = Integer.parseInt(sc.nextLine());
		}
		
		Arrays.sort(MorN);
		System.out.println("Max num : "+MorN[MorN.length-1]);
		System.out.println("Max num : "+MorN[0]);

	}

}
