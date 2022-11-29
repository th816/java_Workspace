package com.kh.practice.token.view;

import java.util.Scanner;
import java.util.StringTokenizer;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	
	
	Scanner sc = new Scanner(System.in);
	
	TokenController tc = new TokenController();
	
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("1. 지정 문자열 ");
			System.out.println("2. 입력 문자열 ");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1: tokenMenu(); break;
			case 2: intputMenu(); break;
			case 9: return;
			default: System.out.println("잘못 입력했습니다. 다시입력해주세요");
			}
		}
		
		
	}
	
	
	public void tokenMenu() {
		
		
		String str = "J a v a P r o g r a m ";
		System.out.println("토큰 처리 전 글자 : "+str);
		System.out.println("토큰 처리 전 개수 : "tc.afterToken(str));
		
		
		
	}
	
	public void intputMenu() {
		
		
	}
	
	

}
