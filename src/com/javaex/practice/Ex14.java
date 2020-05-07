package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float tax;
		System.out.println("수익을 입력해 주세요.");
		System.out.print("금익: ");
		int income = sc.nextInt();
		
		
		if (income>=8000) {
			tax = 1000*0.09f+3000*0.18f+4000*0.27f+0.36f*(income-8000);
			System.out.println("소득세는 "+tax+" 입니다.");
		}
		else if (income>4000) {
			tax = 1000*0.09f+3000*0.18f+0.18f*(income-8000);
			System.out.println("소득세는 "+tax+" 입니다.");
		}
		else if (income>=1000) {
			tax = 1000*0.09f+0.27f*(income-8000);
			System.out.println("소득세는 "+tax+" 입니다.");
		}
		else if (income>=1000){
			tax = 0.09f*income;
			System.out.println("소득세는 "+tax+" 입니다.");
		}
		else {
			System.out.println("잘못 입력했습니다.");
		}
		
		
		sc.close();
	}
}
