package com.kh.chap01_thread.thread;

// 스레드 생성방법
/*
 * 1. Thread 클래스를 상속받는 방법
 * 	- Thread 클래스 상속 후에 run()메소드 오버라이딩
 * 	- Thread1 객체를 생성 후 start()메소드 호출
 */

public class Thread1 extends Thread{
	
	/*
	 * 스레드 실행시 Run메서드 호출됨
	 * 따라서 작업을 하고자 하는 코드를 반드시 Run메서드 안에 재정의 해줘야 한다.
	 * 즉, Thread클래스 안에 있는 run 메서드를 재정의 해줘야한다.
	 */
	
	@Override
	public void run() {
		// 내가 작업할 코드를 작성.
		
//		for(int i =1; i<=100; i++) {
//			System.out.println(this.getName() +"["+i+"]");
//			// getName() : 스레드의 이름 반환, 순차적으로 Thread-0, Thread-1, 2.. 이름이 붙는다
//		}
		// 현재 작업으로 멀티쓰레드 환경을 만드려면 필요한 쓰레드의 개수 ->1
		
		// 쓰레드 생성방법 : 1. Thread 클래스 직접 상속받기
		Thread th1 = new Thread1();
		
		// 쓰레드의 이름 지정
		th1.setName("스레드 1");
		
		// 쓰레드 시작
		th1.start();
		
		// 쓰레드 생성방법 : 2. Runnable 인터페이스를 구현하기
//		Thread2 th2 = new Thread2();
//		Thread th3 = new Thread(th2);
		Thread th2 = new Thread(new Thread2());
		
		th2.setName("쓰레드2");
		
		th2.start();
		
		// 쓰레드 생성방법 3 : 1회용 쓰레드가 필요할때
		// 굳이 클래스 만들 필요 없이 1회용으로만 만들고자 할때 사용
		Thread th3 = new Thread() {
			@Override
			public void run() {
				for(int i=1; i<=100; i++) {
					System.out.println(getName()+"["+i+"[");
				}
			}
			
		}; // 익명 클래스는 ; 붙여줘야함
		th3.start();
		
		System.out.println("메인 스레드 종료!!");
		// 메인 스레드가 종료되더라도 실행중인 스레드가 하나라도 있다면 프로세스는 종료되지 않는다.
		// 매번 결과가 다르게 보일것. => 스케쥴에 따라 순차적으로 번갈아가며 작업이 수행되기 때문에
		
		
	}
	

}
