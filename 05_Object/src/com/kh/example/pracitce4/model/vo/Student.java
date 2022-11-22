package com.kh.example.pracitce4.model.vo;

public class Student {
	private int grade; 
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	{
		grade = 3;
		classroom = 15;
		name = "민경민";
		height = 178.1;
		gender = '남';
	}
	public Student() {
		
	}
 	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setClassroom(int grade) {
		this.classroom = classroom;
	}
	
	public void setName(String name){
		
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public int getGrade() {
		return grade;
	}
		
	public int getClassroom() {
		return classroom;
	}
	
	public String getName() {
		return name;
	}
	
	public double getHeight() {
		return height;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void information() {
		System.out.printf("%s학생은 %d학년이고 %d반이며, 키는 %.1fcm이고 %c학생입니다.", name,grade,classroom,height,gender);
	}
	
}
	