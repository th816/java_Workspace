package com.kh.practice.chap02;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i = 1; i <= num; i++) {
				System.out.print(i+" ");
			}
			
		}else {
		System.out.println("1이상의 숫자를 입력하세요.");
		practice1();
	}
			
	
	}
	
	public void practice2() {
		
	}
	public void practice3() {
		System.out.print("정수를 하나만 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i = 1; i<=num; i++) {
			if(i == num) {
				System.out.print(i);
			}else {
				System.out.print(i+" + ");
			}
			sum += i;
		}
		System.out.print(" = "+sum);
	}
	public void practice4() {
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			practice4();
		}else {
			if(num1 <= num2) {
				for(int i = num1; i <=num2; i++) {// 4 5 6 7 8
					System.out.print(i+" ");
					
			}else {
				for(int i = num1; i <=num2; i++) {// 4 5 6 7 8
					System.out.print(i+" ");
			}
		}
			}	
		
	}
			public void practice6() {
				System.out.print("시작 숫자 : ");
				int num = sc.nextInt();
				
				System.out.print("공차 : ");
				int gong = sc.nextInt();
				
				for(int i=1; i<=10; i++) {
					System.out.print(num+" ");
					num +=gong;				
					}
			}
			public void practice8() {
				//*
				//**
				//***
				//****
				
				System.out.print("정수 입력 : ");
				int num = sc.nextInt();
				for(int i = 1; i< num; i++ ) {
					for(int j = 0; j < i; j++) {
						System.out.print("*");
				}
			
				}
				System.out.println();
		
			}
	
	
}
	public void practice9() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = num; i >= 1; i--) { 
			
			}
		for(int j=1; j <= i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
			public void practice10() {
				System.out.print("정수 입력 : ");
				int num = sc.nextInt();
				for(int i = 0; i< num; i++) {
					
				
				for(int j = 1; j < num - i; j++) {
					System.out.print(" ");
				}
				for(int j = 1; j< 2+ i; j++) {
					System.out.print("*");
}
			System.out.println();
				
				
		
}
			}		
			public void practice11() {
				System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			
			for(int i = 0; i < num; i++) {
				for(int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				for(int j = 0; j < num - i; j++) {
					System.out.print("*");
				}
			
				System.out.println();
			}
			}		
	public void practice12() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			
			for(int j = 0; j< num -(1 + i); j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < 1+2*i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public void practice14() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num < 2) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		boolean isPrime = true;
		int count = 0;
		for(int i = 2; i <=num; i++) {
			// i값이 소수인지 아닌지 검사를함.
			for(int j =2; j< i; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime == true) {
				System.out.print(i + " ");
				count++;
			}
			// i값이 소수라면 출력을하고, 값을 1 증가시킴.
			
		}
		
		System.out.printf("2부터 %d까지의 소수의 개수는 %d개입니다.", num, count);
	}
	public void practice18() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i<num-1; i++) {
		
		for(int j=0; j < num - (1 + i); j++) {
			System.out.print(" ");
		}
		for(int j = 0; j < 1 + 2 * i; j++) {
			System.out.print("*");
		}
		System.out.println();
		

		for(int j=0; j <1+i; j++) {
			System.out.print(" ");
		}
		for(int j = 0; j < (num - i) *2 - 3; j++) {
			System.out.print("*");
		}
		System.out.println();		

		}	

}