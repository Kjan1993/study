package com.test.array;

import java.util.Scanner;

public class ArrayTest02 {

	public static void main(String[] args) {
		// �����
		int currentIndex = 0;
		// ���̵� �迭
		String[] idArray = new String[100];
		idArray[0] = "mimi";
		idArray[1] = "mama";
		idArray[2] = "mumu";

		// �н����� �迭
		String[] pwdArray = new String[100];
		pwdArray[0] = "mimi";
		pwdArray[1] = "mama";
		pwdArray[2] = "mumu";
		String menu;
		Scanner scan = new Scanner(System.in);

		int info = 3;
		String idStr = "";
		String pwdStr = "";

		
		// �޴��κ�
		while (true) {
			System.out.println("*** ���� ���� ���α׷� ***");
			System.out.println("[1]�α���");
			System.out.println("[2]ȸ������");
			System.out.println("[3]���̵�/�н�����ã��");
			System.out.println("[4]����");
			System.out.println("�޴��� �������ּ���.");

			menu = scan.nextLine();
			String msg = "";
			switch (menu) {
			case "1":
				msg = "�α����� �����ϼ̽��ϴ�.";
				System.out.print("���̵� �Է����ּ��� :");
				idStr = scan.nextLine();

				System.out.print("�н����带 �Է����ּ��� : ");
				pwdStr = scan.nextLine();
				int findIndex = 0;
				for (int login = 0; login <= info; login++) {
					if (idStr.equals(idArray[login])) {
						findIndex=login;
						break;
					}
				}
				if (findIndex > -1) {
					if(pwdStr.equals(pwdArray[findIndex])){
						System.out.println("�н����尡 ����ġ");
					}
					System.out.println("�α��ο� �����Ͽ����ϴ�.");
					break;
				} else {
					System.out.println("�н����尡 Ʋ�Ƚ��ϴ�. ���Է��ϼ���.");
				}

				break;
			case "2":
				msg = "ȸ�������� �����ϼ̽��ϴ�.";
				System.out.println("ȸ�����Կ� �ʿ��� ���̵�� ��й�ȣ�� �Է����ּ���.");
				System.out.print("���̵� : ");
				idArray[info] = scan.nextLine();
				if(currentIndex>=idArray.length){
					String[] temp = new String[idArray.length+20];
					for(int i = 0;i<idArray.length;i++){
						temp[i] = idArray[i];
						
					}
					idArray=temp;
				}
				boolean exsistId=false;
				
				for(int i=0;i<idArray.length;i++){//
					if(idStr.equals(idArray[i])){
						exsistId = true;
					}
				}
				
				if(!exsistId){//�����ϴ� ���̵� ������
					System.out.println("�н����� : ");
					pwdStr = scan.nextLine();
					idArray[currentIndex]=idStr;
					pwdArray[currentIndex]=pwdStr;
					currentIndex++;
					System.out.println("���Կ� �����߽��ϴ�.");
				}else{
					System.out.println("�ߺ��� ���̵� �Դϴ�.");
				}
				System.out.print("�е���� : ");
				pwdArray[info] = scan.nextLine();
				info++;
				break;
			case "3":
				msg = "���̵�/�н����� ã�⸦ �����ϼ̽��ϴ�.";
				break;
			case "4":
				msg = "���α׷��� �����մϴ�.";
				System.out.println(msg);
				return;

			default:
				msg = "�޴� ������ �ùٸ��� �ʽ��ϴ�.";
			}

		}
	}

}
