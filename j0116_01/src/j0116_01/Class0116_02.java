package j0116_01;

public class Class0116_02 {

	public static void main(String[] args) {
		//# 일반형 변수
		// boolean - true,false / 변수선언 
		boolean aa = true;
		boolean aa2 = false;
		System.out.println(aa);
		System.out.println(aa2);
		
		// char - 문자
		char bb = 'a';
		char bb2 = '1'; // 숫자X -> 문자 1을 의미함
		System.out.println(bb);
		
		// byte - 128~127 가능
		byte cc = 1;
		byte cc2 = 127;
		byte cc3 = (byte) 129; // 오버플로우(overflow)
		System.out.println(cc);
		System.out.println(cc2);
		System.out.println(cc3);
		
		short dd = 1;
		System.out.println(dd);
		
		int ee = 1;
		int ee2 = (int) 3300000000L;  // 오버플로우 : 약 21억까지 입력가능
		System.out.println(ee2);
		
		long ff = 1;
		long ff2 = 220_000_000L;  // long : 접미사 L을 무조건 붙여야 함(21억 밑으로는 생략 가능) // ,가 아닌 _로 자리수 구분
		System.out.println(ff2);
		
		// 실수 - float,double
		float gg = 1.12345678F;  // float : 접미사 F를 무조건 붙여야 함  // .0이 무조건 붙음(ex_3140.0f)
		double hh = 1.123456789123456789;  // double : 접미사 D는 생략가능
		
		//--------------------------------------------------------
		
		// #참조형 변수 (객체변수) - 무조건 new 객체명()
		// 문자열(String) 변수 - 일반형변수처럼 선언가능
		String str = new String("aaa");  // new 필수
		String str2 = "bbb";
		System.out.println(str);
		
		int abc = 10;
		abc = 20;
		abc = 30;
		System.out.println(abc);
		
		final int AAA = 100;  // 상수
		// AAA = 20;  // 변수형태만 봐도 상수구나 이해할수 있도록 대문자 사용권장
		
		char ch = '\u0041';  // char : 무조건 ''   / ""(X)  // \\u L 16진수를 의미
		System.out.println(ch);
		
		
	}

}
