package com.kh.chap03_sync.sync;

public class Consummer implements Runnable{
	private Buffer buffer;
	
	public Consummer() {
		
	}
	
	public Consummer(Buffer buffer) {
		this.buffer = buffer;
	}
	
	@Override
	public void run() {
		for(int i =1 ; i<=10; i++) {
			try {
				buffer.getData();
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
