package com.string.test;

public class StringTest {

	public static void main(String[] args) {
		//String�� char(����)���� �𿩼� ������� Ŭ����
		String msg = "�ݰ����ϴ�.";//String�� ������ ���ڿ� ����
		
		System.out.println(msg);//String msg�� ���ڿ��� ���
		System.out.println("���ڿ��� ���� : " + msg.length());//���ڿ� ���� Ȯ��
		System.out.println("���ڿ� �� : " + msg.equals("�ٹٹ�"));//���ڿ� ��
		System.out.println("����Ž�� : " + msg.contains("�ݰ�"));//���� Ž��
		System.out.println("�� �ε��� ��ȯ : " + msg.indexOf("�ϴ�."));//���ڿ� �迭���� ��ġ ��ȯ
		System.out.println("index�� ���� ��ȯ : " + msg.charAt(2));//�ε����� ��ġ�� ���ڸ� ��ȯ
		System.out.println("���ڿ� Ȯ�� : " + msg.isEmpty());//���ڿ��� ���ڰ� �ִ��� Ȯ��
		System.out.println("���ڿ� ��ü : " + msg.replace("�ݰ���", "������"));//���ڿ��� ������ ���ڿ��� ��ü�ؼ� ��ȯ
		System.out.println("���ڿ� �߶󳻱� : " + msg.substring(0,3));//������ ��ġ���ۺ��� ������ ��ġ������ ���ڿ��� ��ȯ
		System.out.println("�빮�� ��ȯ : " + msg.toUpperCase());//�빮�� ��ȯ �޼���
		System.out.println("�ҹ��� ��ȯ : " + msg.toLowerCase());//�ҹ��� ��ȯ �޼���
		
		boolean isNumber = true;
		msg="1245624";
		for(int index=0;index<msg.length();index++){
			System.out.println(msg.charAt(index));
			char ch = msg.charAt(index);
			if(!(ch>=48 && ch<=57)){
				isNumber = false;
			}
		}		
		System.out.println(isNumber ? "����" : "���ڰ� �ƴ�");
		
	}

}
