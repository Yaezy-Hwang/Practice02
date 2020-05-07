package com.javaex.practice;

import java.util.Scanner;

public class Ex10_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사번(정수)를 입력해주세요.");
		System.out.print("사번: ");
		int idnum = sc.nextInt();
		
		if(idnum>0) {
			if(idnum%3==0) {
				System.out.println("A팀 입니다.");
			} else if(idnum%3==1) {
				System.out.println("B팀 입니다.");
			} else {
				System.out.println("C팀 입니다.");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		sc.close();
	}
}
