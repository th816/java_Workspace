package com.kh.chap01_poly.part01_basic.model.vo;

public class Parent {
	
	private int x;
	private int y;
	
	
	public Parent() {
		super();
	}
	
	
	public Parent(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	
	
	
	@Override
	public String toString() {
		return "Parent [x=" + x + ", y=" + y + ", toString()=" + super.toString() + "]";
	}


	public void priParent() {
		System.out.println("부모클래스에서 호출됨.");
	}
	
	//다형성 적용후 instanceof 연산자를 쓰지 않을 경우 활용할 수 있는 방법
	public void printChil1() {
		System.out.println("첫번째 자식에서 호출됨");
	}
	
	@Override
	public void print() {
		System.out.println("첫번째 자식");
	}
	
}
