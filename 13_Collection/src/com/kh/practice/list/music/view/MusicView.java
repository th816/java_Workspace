package com.kh.practice.list.music.view;

import java.util.Scanner;

public class MusicView {
	
	public void mainMenu() {
		
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("======== 메인 메뉴 ========");
		System.out.println("1. 마지막 위치에 곡 추가 ");
		System.out.println("2. 첫 위치에 곡 추가 ");
		System.out.println("3. 전체 곡 목록 출력 ");
		System.out.println("4. 특정 곡 검색 ");
		System.out.println("5. 특정 곡 삭제 ");
		System.out.println("6. 특정 곡 정보 수정 ");
		System.out.println("8. 가수명 내림차순 정렬 ");
		System.out.println("9. 종료");
		
		
		int num = sc.nextInt();
		
		switch(num) {
		case 1:  addList(); break;
		case 2:  addAtZero(); break;
		case 3:  printAll(); break;
		case 4:  searchMusic(); break;
		case 5:  removeMusic(); break;
		case 6:  setMusic(); break;
		case 7:  ascTitle(); break;
		case 8:  descSinger(); break;
		case 9:  System.out.println("종료"); return;
		default: System.out.println("잘못 입력했습니다. 다시입력해주세요");
		}
	}
		
		
}
	
	public void addList(){
		
		
		
		
	}
	
	public void addAtZero() {
		
		
	}
	
	public void printAll() {
		
		
	}
	
	public void searchMusic() {
		
		
	}
	
	public void removeMusic() {
		
		
	}
	
	public void setMusic() {
		
		
	}
	
	
	public void ascTitle() {
		
		
	}
	
	public void descSinger() {
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
