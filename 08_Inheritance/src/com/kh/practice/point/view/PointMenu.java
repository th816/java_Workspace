package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CicleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CicleController cc = new CicleController();
	private RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원"); // circleMenu();
			System.out.println("2. 사각형");// rectangleMenu();
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1: circleMenu(); break;
			case 2: rectangleMenu(); break;
			case 9: return;
			default: System.out.println("잘못 입력했습니다. 다시입력해주세요");
			}
		}
	}
	
	public void circleMenu() {
		while(true) {
			System.out.println("===== 원 메뉴 =====");
			System.out.println("1. 원둘레"); // calcCircum()
			System.out.println("2. 원 넓이");// calcCircleArea()
			System.out.println("9. 메인으로");
			System.out.print("메뉴번호 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1: calcCircum(); break;
			case 2: calcCircleArea(); break;
			case 9: 
			default: return;
			}
			
		}
	}
	
	public void rectangleMenu() {
		while(true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 사각형 둘레"); // calcPerimeter()
			System.out.println("2. 사각형 넓이"); // calcReactArea()
			System.out.println("3. 메인으로");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1:calcPerimeter(); break; 
			case 2:calcRectArea(); break;
			case 3:
			default: return;
			}
		}
	}
	
	public void calcCircum() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		
		System.out.println( cc.calcCircum(x, y, radius) );
	}
	
	public void calcCircleArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		
		System.out.println(cc.calcArea(x, y, radius));
	}
	
	public void calcPerimeter() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("너비 : ");
		int width = sc.nextInt();
		
		System.out.println(rc.calcPerimeter(x, y, height, width));
	}
	
	public void calcRectArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("너비 : ");
		int width = sc.nextInt();
		
		System.out.println(rc.calcArea(x, y, height, width));
	}
	
	
	
	
	
	
}

