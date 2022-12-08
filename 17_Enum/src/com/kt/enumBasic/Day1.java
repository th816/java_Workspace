package com.kt.enumBasic;

// 1) 기본 사용법
public enum Day1 {
	MONDAY, 
	TUESDAY,
	WENDSEDAY,
	THURDAY,
	FRIDAY,
	SATURSDAY,
	SUNDAY
	

}

//2) enum안에 각 상수요소마다 값을 더 추가시키고 싶은 경우.
	//	 비슷한 상수필드끼리 매칭시킬때 사용함
	
	enum Day2{
		// 1) 각 요소마다 우측에 매칭시킬 값을 추가
		MONDAY("MON"), 
		TUESDAY("TUE"),
		WENDSEDAY("WEN"),
		THURDAY("THE"),
		FRIDAY("FRI"),
		SATURSDAY("SAT"),
		SUNDAY("SUN");
		
		// 2) 매칭시킬값의 자료형으로 필드값 추가
		private final String shortName;
		
		//3) 생성자 추가
		Day2(String shortName){
			
			this.shortName = shortName;
		}
		
		//4) getter메서드 작성
		
		public String shortName() {
			
			
			return shortName;
		}
		
		
		
	}
	
	// 매핑 시킬 값이 여러개인 경우
	enum Day3{
		
		
		MONDAY("MON",1), 
		TUESDAY("TUE",2),
		WENDSEDAY("WEN",3),
		THURDAY("THE",4),
		FRIDAY("FRI",5),
		SATURSDAY("SAT",6),
		SUNDAY("SUN",7);
		
		// 2) 매칭시킬값의 자료형으로 필드값 추가
		private final String shortName;
		private final int day;
		
		
		//3) 생성자 추가
		Day3(String shortName, int day){
			
			this.shortName = shortName;
			this.day = day;
			
		}
		
		//4) getter메서드 작성
		
		public String shortName() {
			
			
			return shortName;
		}
		
		public int day() {
			
			return day;
			
		}
		
		// 필드값을 통해 enum을 찾는 메서드 추가.
		public static Day3 valueOfShortName(String shortName) {
			
			Day3 day[] = Day3.values();
			for(int i=0; i<day.length; i++) {
				if(day[i].shortName.equals(shortName)) {
					return day[i];
				}

			}
			
			return null;
		}
		
		public static Day3 valueOfDay(int day) {
			Day3 days[] = Day3.values();
			
			for(Day3 d : days) {
				
				if(d.day == day) {
					return d;
				}
			}
			return null;
			
		}
		
	}
	
	
	// 함수추가.
	
	enum Day4{
		
		MONDAY("MON",1){
			// 함수추가 2단계)
			public void printDay() {System.out.println("월요일 입니다.");}
		}, 
		TUESDAY("TUE",2){
			public void printDay() {System.out.println("화요일 입니다.");}
		},
		WENDSEDAY("WEN",3){
			public void printDay() {System.out.println("수요일 입니다.");}
		},
		THURDAY("THE",4){
			public void printDay() {System.out.println("목요일 입니다.");}
		},
		FRIDAY("FRI",5){
			public void printDay() {System.out.println("금요일 입니다.");}
		},
		SATURSDAY("SAT",6){
			public void printDay() {System.out.println("토요일 입니다.");}
		},
		SUNDAY("SUN",7){
			public void printDay() {System.out.println("일요일 입니다.");}
		};
		
		// 2) 매칭시킬값의 자료형으로 필드값 추가
		private final String shortName;
		private final int day;
		
		
		//3) 생성자 추가
		Day4(String shortName, int day){
			
			this.shortName = shortName;
			this.day = day;
			
		}
		
		//4) getter메서드 작성
		
		public String shortName() {
			
			
			return shortName;
		}
		
		public int day() {
			
			return day;
			
		}
		
		// 필드값을 통해 enum을 찾는 메서드 추가.
		public static Day4 valueOfShortName(String shortName) {
			
			Day4 day[] = Day4.values();
			for(int i=0; i<day.length; i++) {
				if(day[i].shortName.equals(shortName)) {
					return day[i];
				}

			}
			
			return null;
		}
		
		public static Day4 valueOfDay(int day) {
			Day4 days[] = Day4.values();
			
			for(Day4 d : days) {
				
				if(d.day == day) {
					return d;
				}
			}
			return null;
			
		}
		
		public void printDay1() {
			
			switch(this) {
			case MONDAY : System.out.println("월요일 입니다");
			case TUESDAY : System.out.println("화요일 입니다"); 
			case WENDSEDAY : System.out.println("수요일 입니다");
			case THURDAY : System.out.println("목요일 입니다");
			case FRIDAY: System.out.println("금요일 입니다");
			case SATURSDAY: System.out.println("토요일 입니다");
			case SUNDAY: System.out.println("일요일 입니다");
			}
		}
		
		
		public void printDay() {
			
			
			System.out.println("월요일입니다");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	