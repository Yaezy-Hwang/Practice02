package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		int age = 15;
		
		//age가 0살 초과 18살 미만
/*		if(0<age<18) {   >> 오류 : 변수는 연산자의 왼쪽에 위치해야함.
			System.out.println("청소년 입니다.");
		}  
*/		
		//수정
		if(age>0 && age<18) {
			System.out.println("청소년 입니다.");
		}

	}
}
