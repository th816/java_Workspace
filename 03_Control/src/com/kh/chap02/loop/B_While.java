package com.kh.chap02.loop;


public class B_While {
	
	/*
	 * while문
	 * [표기범법]
	 * 
	 * [초기식] // 필수가아님
	 * while(조건식) {// 조건이 true일경우 해당구문들을 반복적으로 실행, 조건식 내용에 true를 작성시 무한반복함
	 * 		반복적으로 실행할 코드
	 * 		[증강식]; // 필수는아님
	 * }
	 * 
	 * for문과 다르게 초기식, 증감식 필수가아님.
	 * 분기문에서 초기식, 증감식없이 작성하는법을 배울예정.
	 */
	
	
	
	public void method1() {
		// for문을 while문으로, whil문을 for문으로 표현할수있음.
		
		for(int i = 0; i<5; i++) {
			System.out.println("안녕하세요");
		}
		
		
		int i = 0; // 초기식
		while(i < 5) {//조건식
			System.out.println("안녕하세요");
			i++;//증강식
		}
		System.out.println("i : " + i);
		
		
	}
	
	public void method2() {
		//1~10사이의 정수중 홀수만 출력
		// 처음에는 for문으로, 그다음에 while문으로 변경
	
	
	for(int i = 1; i<=10; i++) {
		if(i % 2 == 1) {
			System.out.print(i+" ");
		}
		
	}
	for(int i =1; i<10; i+=2) {
		System.out.print(i+" ");
	}
	
	System.out.println();
	int i = 1;
	while(i < 10) {
		System.out.print(i+" ");
		i+=2;
	}

	
			
	}
	
	public void method3() {
		// 1부터 랜덤값(1~100)까지의 총 합계
		
		int random = (int)(Math.random() * 100 +1 );
		// 0.0<= 랜덤값 <100.0
		// 1.0<= 랜덥값 <101.0
		// 1.0<= 랜덤값 <= 100.0 -> 1<= 랜덤값 <= 100
		
		int sum = 0;
		
		//int i = 1; 
		//while(i <= random) {
		//	sum += i;
		//	i++;
		//}
		while(random > 0) { // 5
			sum += random--;
		}
		
		
		System.out.println("1부터 "+random+" 까지의 총 합계 : "+sum);
	}
	
	public void method4() {
		//A_For 10번을 메서드 while문으로 바꾸기
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("문자열 입력  : ");
		
	}
	
	
	
	/*
	 * do-while문
	 * [표현법] 
	 * do { // 조건검사없이 무조건 1번 do(실행) -> 조건이 맞지 않더라도 반드시 한번은 수행
	 * 		실행할 코드
	 * } while(조건식);// 조건식의 결과가 true면 실행할 코드를 다시실행
	 * 			     // 조건식의 결과가 false면 반복문을 빠져나옴
	 * 
	 * for/while문과 do-while문의 차이점
	 * for/while문은 처음 시작할때부터 조건검사를하고 반환값이 true이어야 실행 하는데.
	 * do-while문은 첫 실행은 무조건 조건검사 없이 실행함.
	 */
	
	public void method5() {
		//조건식이 맞지 않는경우에 do-while문 테스트
		int i= 1; 
		
		do{
			System.out.print(i++ +" ");
		} while(i <= 5);
	}
	
	public void method7() {
		//1부터 사용자가 입력한 숫자까지의 총합꼐
		// 1.do-while문 사용
		// "1부터 x까지의 총합계 : xx"
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int i = 1; 
		int sum = 0;
		
		do {
			sum += i++;
			} while(i <= num );
		System.out.printf("1부터 %d까지의 총 합계 : %d ", num, sum);
			
	}
}
