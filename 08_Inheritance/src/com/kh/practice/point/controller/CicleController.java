package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CicleController {
	
	public static final double PI = 3.14;
	Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		
		return "면적 : "+(PI*radius*radius);
		
	}
	
	public String calcCircum(int x, int y, int radius) {
		
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		return "둘레 : "+(PI * radius*2);
	}
	

}
