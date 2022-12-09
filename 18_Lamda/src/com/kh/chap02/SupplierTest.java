package com.kh.chap02;

import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

import com.kh.model.vo.Product;

public class SupplierTest {
	/*
	 * Supplier 인터페이스 특징
	 * 1. 주로 생산자 역할을 띈 함수를 작성할때 사용
	 * 2. 매개변수 x 리턴값은 있다
	 * 3. 내부적으로 getXXX()메서드 존재
	 */
	//1) Supplier<T> : T형 변환
	static Supplier<Product> suppLier = () ->{return new Product("아이폰 14",1400000,100);};
	
	//2) xxxSuplier : xxx형 반환
	static BooleanSupplier isTrue = () -> false;
	
	
	
	public static void main(String[] args) {
		
		System.out.println(suppLier.get());
		
		System.out.println("z플립 사고 싶습니까?"+isTrue.getAsBoolean());
		
		
	}
	
	
}
