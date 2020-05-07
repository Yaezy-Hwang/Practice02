package com.javaex.practice;

import java.util.Scanner;

public class Ex06_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, max, min;
		
		System.out.println("숫자 2개를 입력해주세요.");
		System.out.print("숫자1: ");
		num1 = sc.nextInt();
		System.out.print("숫자2: ");
		num2 = sc.nextInt();
		
		System.out.print("큰수: ");
		max = (num1>num2) ? num1 : num2 ;
		System.out.print(max);
		
		System.out.print("     작은수: ");
		min = (num1<=num2) ? num1 : num2 ;
		System.out.println(min);
		
		sc.close();
	}
}