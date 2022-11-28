package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public class Baby extends Person implements Basic {
	
	public Baby() {
		
	}
	
	
	public Baby(String name, double weight, int health) {
		super(name, weight, health);
		
	
	}
	
	@Override
	public String toString() {
		return "Baby [toString()=" + super.toString() + "]";
	}
	
	// eat -> 몸무게 3증가, 건강도 1증가
	
	// sleep -> 건강도 3증가
	
	
	public void eat() {
		
		super.setWeight( super.getWeight() + 3 ); // 
		
		super.setHealth(super.getHealth() + 1); // 
		
		
		
	}
	
	@Override
	public void sleep() {
		// 건강도 10 증가
		super.setHealth(super.getHealth() + 3);
		
		
	}
	
	
	
	
	

}
