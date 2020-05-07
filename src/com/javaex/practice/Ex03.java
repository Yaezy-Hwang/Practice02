package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해 주세요");
		System.out.print("나이: ");
		age = sc.nextInt();
		
		if(age>20) {
			System.out.print("\'1번그룹\'");
		}else {
			System.out.print("\'2번그룹\'");
		}
		
		System.out.println(" 입니다.");
		
		sc.close();
		
		
		/*결과 예상
		 20초과 = 1번그룹
		 20이하 = 1번 그룹
		 age = 15 >> 출력 : 2번그룹 입니다.
		 age = 19 >> 출력 : 2번그룹 입니다.
		 age = 20 >> 출력 : 2번그룹 입니다.
		 age = 21 >> 출력 : 1번그룹 입니다.
		 age = 100 >> 출력 : 1번그룹 입니다.
		 */
		
	}
}
