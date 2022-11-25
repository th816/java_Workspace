package com.kh.chap01_poly.part01_basic.model.vo;

public class Chil2 extends Parent{
	
	private int n;
	
	public Chil2() {
		
		super();
	}

	public Chil2(int n) {
		super();
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return "Chil2 [n=" + n + ", toString()=" + super.toString() + "]";
	}
	
	public void printchil2() {
		
		System.out.println("두번째 자식에서 호출됨");
	}
	
	
	
	

}
