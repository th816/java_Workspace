package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.*;

public class PolyRun {

	public static void main(String[] args) {
		
		/*
		 * 명심할 사항 : '=' 대입연산자 기준으로 왼쪽과 오른쪽의 자료형은 "항상" 같아야함
		 * 
		 * 1. 부모타입 래퍼런스 변수로 부모타입 객체를 다루는것 => 당연히 가능하다
		 */
		
		
		
		
		System.out.println("1. 부모타입 레퍼런스 변수로 부모객체를 다루는 경우");
		Parent p1 = new Parent();
		p1.priParent();
		// p1 레퍼런스변수로 Parent에만 접근 가능
		
		// p2 자식타입 래퍼런스 변수로 자식 객체를 다루는경우
		System.out.println("2. 자식타입 래퍼런스 변수로 자식객체를 다루는 경우");
		Chil1 c1 = new Chil1(); // 기본생성자에 슈퍼생성자 호출하는 구문이 항상있음 따라서 부목ㄱ체 사용가능
		c1.printChil1();
		((Parent)c1).priParent();
		//c1 래퍼런스로 Parent(부모),chil1(자식)에 있는 필드나 메서드 둘다 접근가능
		//c1 래퍼런스 변수가 Parent에 있는 메소드에 접근시 자동으로 형변환된채 진행됨
		//즉 자식에서 부모클래스 자동 형변환(업캐스팅). -> 작은것에서 큰것으로 형변환 된것과 같은이치
		
		//3. 부모타입 래퍼런스 변수로 자식 객체를 다루는 경우(다형성이 적용)
		
		System.out.println("3. 부모 타입 래퍼런스로 자식 객체를 다루는 경우(다형성 적용)");
		Parent p2 = /*(Parent)*/ new Chil1();
		/*
		 * 양쪽의 자료형이 다른데도 불구하고 오류발생x
		 * Parent형으로 "자동형변환"이 되고 있기 때문에
		 * 상속 구조에서는 클래스 형변환이 가능하다
		 * 
		 */
		p2.priParent();// p2라는 래퍼런스 변수로는 Parent에만 접근이 가능
		
	((Chil1) p2).printChil1();// 단, 자식객체로 접근하고 싶을때 chil1형으로 강제형변환후 접근가능
	/*
	 * 클래스간에 형변환 가능(단, 상속구조일 경우에만)
	 * 
	 * 1. UpCasting
	 * 		자식타입 -> 부모타입으로 형변환
	 * 		생략가능(자동형변환 개념)
	 * 		ex) 자식객체.부모메서드(); -> ((부모객체)자식객체).부모메서드()
	 * 		부묘 변수 = new 자식객체
	 * 
	 * 2. DownCasting
	 * 		부모타입 => 자식타입으로 형변환
	 * 		생략불가능(강제형변환 해야함)
	 * 		ex ((자식)부모).자식메서드();
	 * 
	 * 다형성을 쓰는 이유
	 * 	- 부모타입으로부터 파생된 여러가지 타입의 자식객체들을 부모클래스 타입 하나로 다룰수 있음
	 */
	
	//* 다형성 장점
	// 다형성 배우기 전
	// chil1 객체 2개
	// chil2 객체 2개
	// 객체 배열을 이용하기
	
	Chil1[] arr1 = new Chil1[2];
	arr1[0] = new Chil1(1,2,3);
	arr1[1] = new Chil1(4,5,6);
	
	Chil2[] arr2 = new Chil2[2];
	arr1[0] = new Chil2(5,5,5);
	arr1[1] = new Chil2(7,7,7);
	
	//단 다형성이 적용되면 부모타입 래퍼런스 변수로 모든 자식객체를 받아줄 수 있다
	System.out.println("==== 다형성 접목한 객체배열 ====");
	Parent[] arr = new Parent[4];
	arr[0] = new Chil1(1,2,3);
	arr[1] = new Chil2(4,5,6);
	arr[2] = new Chil1(8,8,8);
	arr[3] = new Chil2(9,9,90);
	// 하나의 부모타입으로 모든 자식객체들을 받을 수 있음 => 편리, 코드수 감소, 생산성이 증대
	
	((Chil1) arr[0]).printChil1();
	((Chil2) arr[1]).printChil2();
	((Chil1) arr[2]).printChil1();
	((Chil2) arr[3]).printChil2();	
	
	
	System.out.println("===== 반복문 활용해서 출력해보기 =====");
	for(int i=0; i<arr.length; i++) {
		
		// instanceof 연산자 // 반환값 -> true, false
		// 현재 참조하고있는 래퍼런스 변수가 실제로 어떤 클래스(객체)타입을 참조하고 있는지 확인할때 사용
		
		if(arr[i] instanceof Chil1) {
			((Chil1)(arr[i])).printChil1();
		}else {
			((Chil2) arr[i]).printchil2();
		}
		
		
	}
	
	
	
	
	
	}

}
