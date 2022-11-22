package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.*;

public class SquareController {

	Shape s = new Shape();
	
	
	public SquareController() {
		
	}
	
	public double calcPerimeter(double Height , double Width) {
		s.setHeight(Height);
		s.setWidth(Width);
		return s.getHeight() *2 +s.getWidth()*2;
	}
	
	public double calcArea(double Height , double Width) {
		s.setHeight(Height);
		s.setWidth(Width);
		return s.getHeight() * s.getWidth();
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		return s.information();
	}
	
	
	
}
