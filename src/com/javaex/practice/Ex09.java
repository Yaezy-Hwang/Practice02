package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, large, small;
		String yesno;
		
		System.out.print("첫번째 숫자: ");
		num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		num2 = sc.nextInt();
		
		if (num1>=num2) {
			large = num1;
			small = num2;
		} else {
			large = num2;
			small = num1;
		}
		
		
		if (large/small==0) {
			yesno = " 입니다.";
		} else {
			yesno = " 아닙니다.";
		}
		
		
		System.out.println(small+" 는(은) "+large+"의 약수가"+yesno);
		
		sc.close();
	}
}
