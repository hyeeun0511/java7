package j0119_01;

import java.util.Scanner;

public class C0119_03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// 숫자 5개를 연속으로 입력받아 합계를 출력하시오. 12435 = 15
		System.out.println("숫자 5개를 입력하세요.");
		String num = scanner.next();
		System.out.println("입력한 숫자 : "+num);
		char ch = num.charAt(0);  // num.charAt(0) -> 문자
		char ch2 = num.charAt(1);
		char ch3 = num.charAt(2);
		char ch4 = num.charAt(3);
		char ch5 = num.charAt(4);
		System.out.println(ch+","+ch2+","+ch3+","+ch4+","+ch5);
		System.out.printf("결과값 : %d \n",(ch-'0')+(ch2-'0')+(ch3-'0')+(ch4-'0')+(ch5-'0'));
		
		
		
		// 1+3=4
//		System.out.println("숫자를 한번에 입력하세오.(13)");
//		String num = scanner.next();
//		char ch = num.charAt(0); // num문자열에서 0번째 문자 추출
//		char ch2 = num.charAt(1); // num문자열에서 1번째 문자 추출
//		System.out.println(ch+","+ch2);
//		System.out.printf("결과값 : %d \n",(ch-'0')+(ch2-'0')); // '1' - '0' = 1 , '3' - '0' = 3));
		
		
		
//		System.out.println("숫자1을 입력하세요.");
//		int num = scanner.nextInt();
//		System.out.println("숫자2를 입력하세요.");
//		int num2 = scanner.nextInt();
//		System.out.printf("숫자1:%d, 숫자2:%d \n",num,num2);
		
		
//		int i = 'b'-'a';
		//System.out.println(1); // 1
		
		//int j = '2'-'0';
		//System.out.println(j); // 2
		
		//int k = '5'-'0';
		//System.out.println(k); //5
		
		//char ch = '5';
		//int num = ch-48; // int타입으로 바꾸게되면
		//System.out.println(num); // 53
		
		
//		char ch1 = 'a'; // 97
//		System.out.println(ch1); // a
////		char ch2 = ch1+1; // 에러
//		int ch2 = ch1+1;
//		System.out.println(ch2); // 98
//		System.out.println((char)ch2); // b // 98을 (char)아스키문자로 출력 // 주의! char:숫자
//		ch1++; // 타입 유지
//		char ch3 = ++ch1; // 98 ch : int타입 // char특징 : ++,-- 실행시켜줌
//		System.out.println(ch3); // 넣고 1을 추가해야함
		
//		int a = 1_000_000;
//		int b = 2_000_000;
//		long c = (long)a * b; // (long)a * b , a * b(long), (long)a * (long)b  =>  가능
//		System.out.println(c);
		
		
		// 단항연산자 - 부호연산자
//		int a = -10;
//		System.out.println(a);
//		int b = +10;
//		System.out.println(b);
//		
//		// 단항연산자 - 증감연산자
//		a++; // a+=1 , a=a+1
//		b--; // b-=1 , b=b-1
//		
//		// 논리연산자 : &&,||  
//		
//		// 산술연산 : -,+,*,/,%
//		System.out.println(10+3); // 13
//		System.out.println(10-3); // 7
//		System.out.println(10*3); // 30
//		System.out.println(10/3); // 정수/정수 = 정수 -> 3
//		System.out.println(10%3); // 나머지 연산자 -> 1
//		
//		// 삼항연산자 - 비교연산자 : >,<.>=,<=,!=
//		String str = (a>b)?"맞습니다.":"틀렸습니다.";
//		System.out.println(str);
//
	}

}
