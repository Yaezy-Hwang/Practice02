package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		
		System.out.print("첫번째 숫자: ");
		num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		num2 = sc.nextInt();
		
		System.out.print("몫: ");
		if (num1>num2) {
			System.out.println(num1/num2);
		} else {
			System.out.println(num2/num1);
		}
		
		System.out.print("나머지");
		if (num1>num2) {
			System.out.println(num1%num2);
		} else {
			System.out.println(num2%num1);
		}
		
		sc.close();
	}
}
