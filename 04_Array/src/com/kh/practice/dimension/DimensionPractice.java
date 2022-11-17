package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		
	public void method1() {
		String[][] arr = new String[3][3];
		
		for(int i =0; i<arr.length; i++) {
			for(int j =0; j<arr[i].length; j++) {
			//arr[i][j]
				System.out.printf("(%d, %d)" , i , j);
			}
			System.out.println();
		}
	
	}
	public void method2() {
		String[][] arr = new String[4][4];
		
		int value = 1;
		for(int i =0; i<arr.length; i++) {
			for(int j =0; j<arr[i].length; j++) {
//			arr[i][j] = value++;
				
			}
			
		}

		
		
	}
	public void method3() {
		int[][] arr = new int[4][4];
		int value = 16;
		for(int i =0; i<arr.length; i++) {
			for(int j =0; j<arr[i].length; j++) {
			arr[i][j] = value++;
			}
	  
		}
		
		
	}
	public void methoh4() {
		int[][] arr= new int[4][4];
		
		for(int i =0; i<arr.length - 1; i++) {
			for(int j=0; j<arr[i].length - 1; j++) {
				arr[i][j] = (int)(Math.random() * 10+1);
				
				arr[i][3] += arr[i][j];// 각행의 모든값의 합
				
				arr[3][j] += arr[i][j];// 각 열의 모든값의 합
				
				arr[3][3] += arr[i][j] * 2; // 가로 세로의 총합
				
			}
		}
		
		printArray(arr);
		
		
	}

		

	
	public void method5() {
		while(true) {
			System.out.print("행 크기 : ");
			int row = sc.nextInt();
		
			System.out.print("열 크기 : ");
			int col = sc.nextInt();
		
			if(row  >= 1 && row <=10 && col >= 1 && col <= 10) {
				System.out.println("반드시 1~10사이의 정수를 입력하세요.");
				continue;
		}
			char[][] arr = new char[row][col];
			for(int i =0; i<arr.length; i++) {
				for(int j =0; j<arr[i].length; j++) {
					arr[i][j] = (char)(int)(Math.random() * 26 +65);
				}	
		
			}
			public void PrintArray(int[][] arr) { 
				for(int i =0; i<arr.length; i++) {
					for(int j =0; j<arr[i].length; j++) {
						System.out.printf("%2c ", arr[i][j]);
					}
					System.out.println();
		}
	}
	public void printArray(int[][] arr) { 
		for(int i =0; i<arr.length; i++) {
			for(int j =0; j<arr[i].length; j++) {
				System.out.printf("%2c ", arr[i][j]);
			}
			System.out.println();
		}
	}
	public void practice6() {
		String[][] strArr = new String[][] {
			
			}
	
		for(int i=0; i < strArr[0].length; i++) {
			for(int j = 0; j < strArr.length; j++) {
				System.out.print(strArr[j][i]+" ");
			}
		}
		
		}
	
		public void practice7() {
			
			System.out.print("행의 크기 : ");
			int row = sc.nextInt();
			
			char[][] arr = new char[row][];
			for(int i=0; i < arr.length; i++) {
				System.out.print(i+"행의 열 크기 : ");
				int col = sc.nextInt();
				arr[i] = new char[col];
                //arr[i] = arr2;
					
			}
			char ch = 'a';
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					arr[i][j] = ch;
					if(ch == 'z') {
						ch = 'a';
					}else {
					ch++;
				}
			}
			
			
		}
		 
			for(int i =0; i<arr.length; i++) {
					for(int j =0; j<arr[i].length; j++) {
						System.out.printf("%2c ", arr[i][j]);
					}
						
			}
					
		}
	
	public void practice8() {
		String[] arr = {"강건강","남나나","도대담","류라라","문미미","박보배","송성실", "유예의", "진재주","차천축", "피퐁표", "홍하하"};
		
		String[][] class1 = new String[3][2];
		String[][] class2 = new String[3][2];
		
		int index = 0;
		System.out.println("==1분단");
		for(int i =0; i<class1.length; i++) {
			for(int j = 0; j<class1[i].length; j++) {
				class1[i][j] = arr[index++];
				System.out.print(class1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("==2분단");
		for(int i =0; i<class2.length; i++) {
			for(int j = 0; j<class2[i].length; j++) {
				class2[i][j] = arr[index++];
				System.out.print(class2[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice9() {
		String[] arr = {"강건강","남나나","도대담","류라라","문미미","박보배","송성실", "유예의", "진재주","차천축", "피퐁표", "홍하하"};
		
		String[][] class1 = new String[3][2];
		String[][] class2 = new String[3][2];
		
		int index = 0;
		System.out.println("==1분단");
		for(int i =0; i<class1.length; i++) {
			for(int j = 0; j<class1[i].length; j++) {
				class1[i][j] = arr[index++];
				System.out.print(class1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("==2분단");
		for(int i =0; i<class2.length; i++) {
			for(int j = 0; j<class2[i].length; j++) {
				class2[i][j] = arr[index++];
				System.out.print(class2[i][j] + " ");
			}
			System.out.println();
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 학생의 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		char [] line = {'첫', '두' , '세'};
		
		for(int i =0; i<class1.length; i++) {
			for(int j = 0; j<class1[i].length; j++) {
				if(class1[i][j].equals(name)) {
					System.out.printf("검색하신 %s 학생은 1분단 %c 번째 줄 %s쪽에 있습니다.", name, line[i], j == 0? "왼" : "오른");
				}
			}
		}
		for(int i =0; i<class2.length; i++) {
			for(int j = 0; j<class2[i].length; j++) {
				if(class2[i][j].equals(name)) {
					System.out.printf("검색하신 %s 학생은 2분단 %c 번째 줄 %s쪽에 있습니다.", name, line[i], j == 0? "왼" : "오른");
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			
			
			
			
			
			
			
			
			
			
			
			
			

	
		
		
		
		
		public void PrintArray (int[][] arr) { 
			for(int i =0; i<arr.length; i++) {
				for(int j =0; j<arr[i].length; j++) {
					System.out.printf("%2c ", arr[i][j]);
				}
				
	}
			System.out.println();
}

			
			
			
			
			
			
			
			
			
			
			
			
			
	}
	
	
	
	
	
