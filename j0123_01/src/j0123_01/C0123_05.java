package j0123_01;

import java.util.Arrays;

public class C0123_05 {
	long a,b;
	static int aa;
	
	long add() {  // "오버로딩" - 메소드명은 동일 - 매개변수 개수 또는 타입
		return a+b;
	}// 인스턴스 메서드
	
	static long add(long a,long b) {
		return a+b;
	}// 클래스 메서드
	
	static long add(long a,long b,long c) {
		return a-b-c;
	} // 클래스 메서드 오버로딩 : a+b 의 (add) 메서드와 동일하지만 개수가 다름 > 오버로딩 가능

	public static void main(String[] args) {
		int aa = 0; // 지역변수
//		// long a=0; 같은메소드 내에 같은 변수는 선언 불가
		
		int[] num = new int[3];
		AMethod a = new AMethod();
		a.input(num);
		System.out.println(Arrays.toString(num));
		
		
	    System.out.println(1);
	    System.out.println(1.0);
		// println(1), println(1.0) -> 오버로딩:다른 메서드 호출해서 처리
	}

}



//=====================================================
// public class C0123_05 {
//	long a,b;
//	int a;
// } => 오류 발생 : 같은 "클래스" 내에서 변수명이 중복되면 안됨