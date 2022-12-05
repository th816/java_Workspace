package com.kh.chap03_Map.part02_properties.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ProperitesRun1 {

	public static void main(String[] args) {
		
//		// Properties : Map 계열 => key, value세트로 저장
//		// 단 Properties의 특징 : key, value 모두 String으로 제한되어있음.
//		
		Properties prop = new Properties();
//		
//		//String이 아닌 값을 넣게 될 경우.
//		// Map계열이기 때문에 put메서드 활용 가능.
//		
//		prop.put("다이제", new Snack("초코맛",1000));
//		
//		System.out.println(prop);
//		System.out.println(prop.get("다이제"));
//		
//		// 단, 주로 Properties를 사용하는 경우는 Properties에 담겨있는 key+value값 세트를 파일로 기록하기 위해서
//		
//		try {
//			prop.store(new FileOutputStream("test.properites"), "Properties test");
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//		
		
		//Properties에 값을 추가할떄는 보통
		// 1. setProperties(String key, String value)
		prop.setProperty("List","ArrayList");
		prop.setProperty("Set","HashSet");
		prop.setProperty("Map","HashMap");
		prop.setProperty("Map","Properties");
		
		System.out.println(prop); // 저장 순서유지 x, key 값 중복 안됨
		
		// 값 가져오기
		// 2. getProperty(String key) : String
		System.out.println(prop.getProperty("Set"));
		
	
		
		try {
			//3. store(OutputStream os , String Comments) : Properties에 담긴 key - value값들을 파일로 출력
			prop.store(new FileOutputStream("test.properties"), "Properties Test");
			
			//4. storeToXML(OutputStream os, String Comments) : Properties에 담긴 key - value값들을 xml문서로 출력
			prop.storeToXML(new FileOutputStream("test.xml"), "Properties Test");
			
		} catch (IOException e) {
			// 
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
