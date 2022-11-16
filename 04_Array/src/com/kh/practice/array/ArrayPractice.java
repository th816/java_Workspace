package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);
	
	
	public void practice1() {
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+ " ");
		}
		}
		
	public void practice2() {
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 10-i;
			System.out.print(arr[i]+ " ");
		}
	}
	public void practice3() {
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = 1+i;
		}
	}
	
	public void practice4() {
		String[] arr = new String[5];
		arr[0] = "사과";
		arr[1] = "귤";
		arr[2] = "포도";
		arr[3] = "복숭아";
		arr[4] = "참외";
		System.out.println(arr[1]);
		
	}
	public void practice5() {
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		char [] arr = new char[str.length()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		int count = 0;
		String index = "";
		
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] == ch){
				//갯수증가
				index +=i+" ";
				count++;
			}
		}
		
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : %s \n", str , ch, index);
		System.out.printf("%c 개수 : %d", ch, count);
		
	}
	
	public void practice6() {
		String[] days = {"월", "화", "수", "목", "금", "토", "일"};
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num >= 0 && num <= 6) {
			System.out.println(days[num]+"요일");
		}else { 
			System.out.println("잘못 입력 하셨습니다.");
		}
		
		
		
	}
	public void practice7() {
		System.out.print("정수 : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			arr[i] = sc.nextInt();
			
		}
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n총 합: "+sum);
		
	}
	
	public void practice8() {
		System.out.print("정수 : ");
		int size = sc.nextInt();
		
		if(size < 3 || size %2 == 0) {
			System.out.println("다시 입력하세요.");
			practice8();
		}else {
			int[] arr = new int[size];//5
			// 7 -> 4 ->0,1,2,3,4,5,6
			// 9 -> 6 ->0,1,2,3,4,5,6,7,8
			for(int index =0; index <= size/2; index++) {
				arr[index] = 1+index;
			}
			int value = 1;
			for(int index = size/2+1; index<arr.length; index++) {
				arr[index] = size/2 + 1 - value; 
				value++;
			}
			
			for(int i = 0; i<arr.length; i++) {
				System.out.print(arr[i] + (i == arr.length-1 ? "" : " , "));
			}
			// 0 , 1 , 2 -> 1, 2, 3
			
			
			// 3, 4 -> 2, 1
			
		}
	}
	
	public void practice9() {
		String[] meun = {"양념" , "후라이드" , "고추바사삭" , "레드콤보"};
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String chiken = sc.nextLine();
		
		for(int i = 0; i<meun.length; i++) {
			if(meun[i].equals(chiken)) {
				System.out.println(chiken+"치킨 배달 가능");
				return;
			}
		}
		System.out.println(chiken+"치킨은 없는 메뉴입니다.");
	}
	
	
	
	
	
	
	
	
	
}
