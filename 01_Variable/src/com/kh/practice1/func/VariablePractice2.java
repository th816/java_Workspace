package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {

	public void test2() {
		// 키보드로 정수 두 개를 입력 받아 두 수의
		// 합, 차, 곱, 나누기한 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();//23
		
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();//7
		
		System.out.println("더하기 결과 : "+ (num1+num2));
		System.out.println("빼기 결과 : "+ (num1-num2));
		System.out.println("곱하기 결과 : "+ (num1 * num2));
		System.out.println("나누기 결과 : "+(num1 / num2));
	}
	
	
}