package com.kh.example.practice3.mode.vo;

public class Circle {
	//필드부
	private static final double PI = 3.14;
	private int radius =1;
  
	//생성자부
	public Circle() {
		getAreaOfCircle();
		getSizeOfCircle();
	}
	
	//메서드부
	public void setRadius(int radius) {
		  this.radius = radius;
	  }
	
	public int getRadius() {
		return radius;
		
	}
	
	public void incrementRadius() {
		radius++;
		getAreaOfCircle();
		getSizeOfCircle();
	}
	//원의둘레 2*반지름*원주율
	public void getAreaOfCircle() {
		System.out.println(PI * radius * 2);
	}
	
	//원의넓이 반지름*반지름*원주율
	public void getSizeOfCircle() {
		System.out.println(radius * radius * PI);
		
	}
	
	
}


