// 1. 패키지 생성
package com.kh.var;

// 2. 클래스 생성 (앞글자는 대문자로!)
public class TestVariable {
	
   // 기능 제공 메소드 만들기
	public void method1() {
		
		// 일반 데이터 출력
		System.out.println(2500000);
		
		// --------------------------//
		
		// 변수 사용하기 (오류가 적다)
		// 공간(변수) <- 값
		// 공간에 값을 대입해라! (sal이라는 공간에 2500000을 대입해라)
		int sal = 2500000;
		
		System.out.println(sal);
		
		
		
		
	}
	
	
	public void method2() {
	    // 변수 선언하기
		
		// 1. 변수 선언 (회원 정보)
		String name; // 이름       - String (문자열)
		String num; // 전화번호 - String (문자열)
		String id; // 아이디    - String 
		String pw; // 비밀번호 - String 
		char gender; // 성별       - M/F , 남/여 Char (하나짜리)
		double hei; // 신장       - double
		double wei; // 몸무게    - double
		int age; // 나이   int
		boolean mrg; // 결혼여부 - boolean
		
		// 2. 선언한 변수의 값 대입하기(넣기)
		name = "김다희";
		num = "01012345678";
		id = "kh78";
		pw = "1234";
		gender = 'F'; 
		hei = 180;
		wei = 180;
		age = 50;
		mrg = false;
		
		//3. 변수 안의 값 확인하기
		System.out.println(name);
		System.out.println(num);
		System.out.println(id);
		System.out.println(pw);
		System.out.println(gender);
		System.out.println(hei);
		System.out.println(wei);
		System.out.println(age);
		System.out.println(mrg);
		
		
	}  

}
