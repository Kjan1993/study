package com.test.variable;

public class OpertorTest {

	public static void main(String[] args) {
		// 단항연산자
		int i = 0; // int형으로 변수 i 선언 i값을 0으로 정의함
		// ++i, i++
		i++; // 변수 i값을 처리후 i값 1 증가
		//System.out.println("i+1 = " + (i++)); <- 이건 사람의 인식에 오류가 있어날 수 있어 위와 같이 정의
		System.out.println("i+1 = " + i);// 변수 i의 값을 출력
		
		i = i-1; // --i, i--
		i--; // 변수 i값을 처리후 i값 1 감소
		System.out.println("i-1 = " + i);// 변수 i의 값을 출력
		//산술연산자
		
		int x = 10, y = 2; // int(정수)형으로 변수 x와 y를 선언 x는 10, y는 2로 정의
		
		char ch = 'A'; // char(문장)형으로 변수 ch 선언 'A'로 정의 
		int chSumInt = ch + 3; //int(정수)형으로 변수 선언하고 위에서 문자 A에 3을 더한 문자값을 int로 선언했기때문에 int형으로 변환
		char chSumInt2 = (char)chSumInt;//위에서 int형으로 변환했던 값을 (char)를 앞에 붙여서 강제 형변환후 char(문장)으로 선언한 변수에 저장
		
		int sum = x+y;//x와 y값을 더한값을 저장하기 위한 정수 변수 선언
		int sub = x-y;//x에서 y값을 뺀값을 저장하기 위한 정수 변수 선언
		int multi = x*y;//x와 y값을 곱한값을 저장하기 위한 정수 변수 선언
		float div = x/(y*1.f);//정수인 x,y를 나누게되면 int형이기 때문에 실수를 잘라버리기쌔문에 나눌값을 float으로 살리기위해 f를 붙여서 곱해 float형으로 저장하기 위한 변수 선언
		int mock = x/y;//x와 y값을 더한값을 저장하기 위한 정수 변수 선언
		int namuji = x%y;//x와 y값을 더한값을 저장하기 위한 정수 변수 선언
		


		System.out.println("x+y = " + sum);//sum값을 내부 콘솔시스템창에 출력 
		System.out.println("x-y = " + sub);//sub값을 내부 콘솔시스템창에 출력
		System.out.println("x*y = " + multi);//multi값을 내부 콘솔시스템창에 출력
		System.out.println("x/y = " + div);//div값을 내부 콘솔시스템창에 출력
		System.out.println("mock : x/y = " + mock);//mock값을 내부 콘솔시스템창에 출력
		System.out.println("나머지 : " + namuji);//namuji값을 내부 콘솔시스템창에 출력
		System.out.println("문자형 : char + int = " + chSumInt2);//chSumInt2값을 내부 콘솔시스템창에 출력
		
			
		System.out.println("x > y : "+ (x > y));// x가 y보다 큰 값인지 비교
		System.out.println("x >= y : "+ (x >= y));// x가 y보다 크거나 같은 값인지 비교
		System.out.println("x < y : "+ (x < y));// x가 y보다 작은 값인지 비교
		System.out.println("x <= y : "+ (x <= y));// x가 y보다 작거나 같은 값인지 비교
		System.out.println("x == y : "+ (x == y));// x와 y값이 같은 값인지 비교
		System.out.println("x != y : "+ (x != y));// x와 y값이 같은 값이 아닌지를 인지 비교
		
		// 삼항연산자
		// (조건식) ? A(true) : B(false)
		
		int kor = 92;// int형으로 국어의 시험성적을 나타낼 kor이라는 변수로 선언하고 kor값은 92라고 정수를 정의함;
		
		System.out.println("국어점수 레벨 : " + ((kor >= 90) ? "A" : "F"));//삼항연산자로 콘솔창에 출력해주는데 kor값이 90이상이면 A라는 문자값을 아니면 F라는 값을 출력함
		
		//Quiz 1) 1234.56789의 수에 소수점 세째자리에서 올림하시오.
		
		float quiz1 = 1234.56789f;// 실수형 변수 선언 및 정의
		
		quiz1 = ((int)((quiz1+0.005f)*100f))/100f;//quiz1을 반올림하기위해 0.005f 더한다
		quiz1 = (int) (quiz1*100);//반올림된 값을 소수점 둘째자리 밑에 수를 자르기 위해서 100을 곱함
		quiz1 = quiz1/100f;//123457값이된 quiz1을 100f으로 나눠서 1234.57이라는 값을 만들면서 실수로 변환
		
		System.out.println(quiz1);//quiz1의 최종 계산값을 콘솔에 출력
	}

}
