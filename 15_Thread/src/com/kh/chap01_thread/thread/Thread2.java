package com.kh.chap01_thread.thread;

/*
 * 스레드 생성방법
 * 2. Runnable 인터페이스를 구현하는 방법
 * 	- Runnable 인터페이스의 run() 메서드 오버라이딩
 * 	- Thread객체 생성 후 생성자에 Runnable 인터페이스를 구현한 객체(Thredad2)를 매개값으로 전달한 후
 * 	  start() 메서드 호출
 * 
 */

public class Thread2 implements Runnable{
	
	
	// Runnable 인터페이스를 구현하여 구현메소드(run)만 따로 만드는것을 권장
	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			
			System.out.println(Thread.currentThread().getName()+"["+i+"]");
		}
		
	}

}
