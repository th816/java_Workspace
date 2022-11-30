package com.kh.practice.numRange.view;

import java.util.Scanner;

public class NumberMenu {
	
	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		
		// 해결방법 2. 예외처리 구문으로 해결(예외가 발생했을 경우를 대비해서 실행할 내용을 정의해두는것)
				/*
				 * try ~ catch문
				 * [표현법]
				 * try{
				 *         //예외가 발생될수 있는 구문
				 * }catch(발생될 예외클래스 변수명 -> 매개변수){
				 * 			// 예외 발생시 실행할 구문.
				 * }
				 * 
				 */
//		try {
//			System.out.println("나눗셈 연산 결과 : "+(num1/num2));//ArithmeticException
//		}catch(ArithmeticException e) {
//			System.out.println("0으로 나눌수 없습니다");
//			e.printStackTrace(); // 현재 발생한 오류를 추적할수있는 로그정보 제공
//		}

		System.out.print("정수 1: ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 2: ");
		int num2 = sc.nextInt();
		
//		
//		if(num1 % num2 ==0) {
//			System.out.println("배수입니다");
//		}else {
//			System.out.println("배수가 아닙니다");
//		}

		try {
			System.out.printf("%d는 %d의 배수인가 ? : ",num1,num2);
			System.out.print(num1 % num2);
			System.out.println(true);
		}catch(ArithmeticException e) {
			System.out.println(false);
			
		}
		
		
		
		
		
	}
	

}
