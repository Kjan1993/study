package com.string.test;

public class StringTest {

	public static void main(String[] args) {
		//String은 char(문자)들이 모여서 만들어진 클래스
		String msg = "반갑습니다.";//String을 선언해 문자열 저장
		
		System.out.println(msg);//String msg의 문자열을 출력
		System.out.println("문자열의 길이 : " + msg.length());//문자열 길이 확인
		System.out.println("문자열 비교 : " + msg.equals("바바바"));//문자열 비교
		System.out.println("문자탐색 : " + msg.contains("반갑"));//문자 탐색
		System.out.println("비교 인덱스 반환 : " + msg.indexOf("니다."));//문자열 배열에서 위치 반환
		System.out.println("index의 글자 반환 : " + msg.charAt(2));//인덱스의 위치한 문자를 반환
		System.out.println("빈문자열 확인 : " + msg.isEmpty());//문자열에 빈문자가 있는지 확인
		System.out.println("문자열 교체 : " + msg.replace("반갑습", "감사합"));//문자열을 지정한 문자열로 교체해서 반환
		System.out.println("문자열 잘라내기 : " + msg.substring(0,3));//지정된 위치시작부터 지정된 위치끝까지 문자열을 반환
		System.out.println("대문자 변환 : " + msg.toUpperCase());//대문자 변환 메서드
		System.out.println("소문자 변환 : " + msg.toLowerCase());//소문자 변환 메서드
		
		boolean isNumber = true;
		msg="1245624";
		for(int index=0;index<msg.length();index++){
			System.out.println(msg.charAt(index));
			char ch = msg.charAt(index);
			if(!(ch>=48 && ch<=57)){
				isNumber = false;
			}
		}		
		System.out.println(isNumber ? "숫자" : "숫자가 아님");
		
	}

}
