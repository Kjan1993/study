package com.test.variable;

public class OpertorTest {

	public static void main(String[] args) {
		// ���׿�����
		int i = 0; // int������ ���� i ���� i���� 0���� ������
		// ++i, i++
		i++; // ���� i���� ó���� i�� 1 ����
		//System.out.println("i+1 = " + (i++)); <- �̰� ����� �νĿ� ������ �־ �� �־� ���� ���� ����
		System.out.println("i+1 = " + i);// ���� i�� ���� ���
		
		i = i-1; // --i, i--
		i--; // ���� i���� ó���� i�� 1 ����
		System.out.println("i-1 = " + i);// ���� i�� ���� ���
		//���������
		
		int x = 10, y = 2; // int(����)������ ���� x�� y�� ���� x�� 10, y�� 2�� ����
		
		char ch = 'A'; // char(����)������ ���� ch ���� 'A'�� ���� 
		int chSumInt = ch + 3; //int(����)������ ���� �����ϰ� ������ ���� A�� 3�� ���� ���ڰ��� int�� �����߱⶧���� int������ ��ȯ
		char chSumInt2 = (char)chSumInt;//������ int������ ��ȯ�ߴ� ���� (char)�� �տ� �ٿ��� ���� ����ȯ�� char(����)���� ������ ������ ����
		
		int sum = x+y;//x�� y���� ���Ѱ��� �����ϱ� ���� ���� ���� ����
		int sub = x-y;//x���� y���� ������ �����ϱ� ���� ���� ���� ����
		int multi = x*y;//x�� y���� ���Ѱ��� �����ϱ� ���� ���� ���� ����
		float div = x/(y*1.f);//������ x,y�� �����ԵǸ� int���̱� ������ �Ǽ��� �߶������ع��� �������� float���� �츮������ f�� �ٿ��� ���� float������ �����ϱ� ���� ���� ����
		int mock = x/y;//x�� y���� ���Ѱ��� �����ϱ� ���� ���� ���� ����
		int namuji = x%y;//x�� y���� ���Ѱ��� �����ϱ� ���� ���� ���� ����
		


		System.out.println("x+y = " + sum);//sum���� ���� �ֽܼý���â�� ��� 
		System.out.println("x-y = " + sub);//sub���� ���� �ֽܼý���â�� ���
		System.out.println("x*y = " + multi);//multi���� ���� �ֽܼý���â�� ���
		System.out.println("x/y = " + div);//div���� ���� �ֽܼý���â�� ���
		System.out.println("mock : x/y = " + mock);//mock���� ���� �ֽܼý���â�� ���
		System.out.println("������ : " + namuji);//namuji���� ���� �ֽܼý���â�� ���
		System.out.println("������ : char + int = " + chSumInt2);//chSumInt2���� ���� �ֽܼý���â�� ���
		
			
		System.out.println("x > y : "+ (x > y));// x�� y���� ū ������ ��
		System.out.println("x >= y : "+ (x >= y));// x�� y���� ũ�ų� ���� ������ ��
		System.out.println("x < y : "+ (x < y));// x�� y���� ���� ������ ��
		System.out.println("x <= y : "+ (x <= y));// x�� y���� �۰ų� ���� ������ ��
		System.out.println("x == y : "+ (x == y));// x�� y���� ���� ������ ��
		System.out.println("x != y : "+ (x != y));// x�� y���� ���� ���� �ƴ����� ���� ��
		
		// ���׿�����
		// (���ǽ�) ? A(true) : B(false)
		
		int kor = 92;// int������ ������ ���輺���� ��Ÿ�� kor�̶�� ������ �����ϰ� kor���� 92��� ������ ������;
		
		System.out.println("�������� ���� : " + ((kor >= 90) ? "A" : "F"));//���׿����ڷ� �ܼ�â�� ������ִµ� kor���� 90�̻��̸� A��� ���ڰ��� �ƴϸ� F��� ���� �����
		
		//Quiz 1) 1234.56789�� ���� �Ҽ��� ��°�ڸ����� �ø��Ͻÿ�.
		
		float quiz1 = 1234.56789f;// �Ǽ��� ���� ���� �� ����
		
		quiz1 = ((int)((quiz1+0.005f)*100f))/100f;//quiz1�� �ݿø��ϱ����� 0.005f ���Ѵ�
		quiz1 = (int) (quiz1*100);//�ݿø��� ���� �Ҽ��� ��°�ڸ� �ؿ� ���� �ڸ��� ���ؼ� 100�� ����
		quiz1 = quiz1/100f;//123457���̵� quiz1�� 100f���� ������ 1234.57�̶�� ���� ����鼭 �Ǽ��� ��ȯ
		
		System.out.println(quiz1);//quiz1�� ���� ��갪�� �ֿܼ� ���
	}

}
