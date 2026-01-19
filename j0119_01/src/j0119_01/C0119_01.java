package j0119_01;

import java.util.Scanner;
// Scanner 작성 후 ctrl+shift+m -> import 자동완성

// 내장객체는 import해야 사용가능 - System

public class C0119_01 {

	public static void main(String[] args) {

		char ch = 'A';
		System.out.println(ch);
		System.out.println((int) ch);
		System.out.println(ch+1); // byte,short,char -> + 연산을 하면 int타입
		int ch2 = 65;
		System.out.println((char)ch2);
		
		String str = "aaa";
		System.out.println(str+77); // str : 문자열 -> 문자열+77(문자열) / str+77-1 -> 불가능
//		System.out.println(str+77-11); // 불가능 / str+77(문자열)-11(숫자) // 문자열-숫자 불가능
		System.out.println(str+(77-11)); // 가능 / 1) 숫자-숫자 2) 문자열+숫자(문자열)
		System.out.println(77-11+str); // 가능 / 1) 숫자-숫자 2) 숫자(문자열)+문자열
		
		
		// 예약어 : 이미 의미가 정해진 단어
//		int True = 10; // 대문자!! (소문자 사용시 에러) -> true는 예약어 
////		int true; // 예약어는 변수명으로 사용 불가
//		boolean a7 = true;
//		boolean b = false;
//		byte c = 1; // 256개 - 128 ~ 127
//		short d = 1;
//		int e = 1;
//		long f = 10000000000L; // int범위 초과 -> long형 접미사 L;  // long일시 L붙이는것 권장
//		float g = 1.0F; 
//		double h$_a = 1.0d;  // $,_ 문자만 사용 가능
//		char cc = 'a';  // 문자 1개만 가능 (2개 불가)
//		char cc2 = ' '; // 공백도 문자로 인식
////		char cc3 = '';  // 오류 발생 - 빈문자는 불가능
//		
//		String str = new String("aaa");
//		System.out.println(str);
//		
//		String str2 = "aaa"; // String 객체만 new를 사용하지 않아도 됨.
//		System.out.println(str2);
		
//		int a = 2_147483647; // _있어도 숫자로 인식 -> 2_147483647 = 2147483647
//		System.out.println(a-1); // 2147483646
//		
//		int b = 10;
//		System.out.println(b+1); // 11
		
		
		// 함수 -> 매소드
		// 함수, 객체 차이점 -> 이름() : 함수 / 클래스 : 첫글자가 대문자
//		System.out.println("출력입니다.");
//		System.out.println("입력해주세요.");
//		System.out.println();
//		System.out.println();
		
		// 입력부분 - 객체선언
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요.");
//		int a = scanner.nextInt();
//		// input("숫자를 입력하세요.") - 파이썬
//		
//		System.out.println("입력된 숫자 : "+a);
		
		

	}

}
