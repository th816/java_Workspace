package com.kh.hw.shape.model.vo;

public class Shape {
	
	private int Type;
	private double Height;
	private double Width;
	private String Color;
	
	
	public Shape() {
		
		
	}
	
	
	public Shape(int type, double height, double width, String color) {
		this.Type = type;
		this.Height = height;
		this.Width = width;
		this.Color = color;
	}
	
	public void setType(int type) {
		this.Type = type;
	}
	
	public void setHeight(double height) {
		this.Height = height;
	
	}
	
	public void setWidth(double width) {
		this.Width = width;
		
	}
	
	public void setColor(String color) {
		this.Color = color;
	}
	
	
	public int getType() {
		return Type;
	}
	
	public double getHeight() {
		return Height;
	}
	
	public double getWidth() {
		return Width;
	}
	
	public String getColor() {
		return Color;
	}
	
	public String information() {
		return (Height+ " " + Width + " " +Color);
	}
	
	
}
