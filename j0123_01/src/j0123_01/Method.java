package j0123_01;

import java.util.Scanner;

public class Method {
	
	static Scanner scanner = new Scanner(System.in);

	// avg()
	double avg(int a,int b) {
		// Method.scanner.next(); // static 붙은 scanner 사용
		//scanner.next(); //같은 클래스 내에 있어서 Method 생략 가능
		// nextInt() -> 숫자를 받는것 
		// next() -> 문자열을 받는것 (지금은 숫자만 받으니까 nextInt() 사용)
		double result = (a+b)/2.0;
		return result; // static이 안붙음
	} //avg

	// total()
	int total(int a, int b, int c) {
		int result = a+b+c;
		return result;
	} // total
	
	//input() 2개의 값을 입력받아 합계를 리턴
	void input() {
		System.out.print("첫번째 숫자를 입력하세요.>> ");
		int a = scanner.nextInt();
		System.out.print("두번째 숫자를 입력하세요.>> ");
		int b = scanner.nextInt();
		System.out.println("합계 : "+(a+b));
	} // input
	
	// input2() 합의 값을 리턴해줌
	int input2() {
		System.out.print("첫번째 숫자를 입력하세요.>> ");
		int a = scanner.nextInt();
		System.out.print("두번째 숫자를 입력하세요.>> ");
		int b = scanner.nextInt();
		int result = a+b;
		return result;
	} // input2
	
	// 1. 리턴없이 2개 숫자 입력받아, 더하기,빼기,곱하기 값을 출력하는 메소드 구현
	// 2. 2개 숫자를 입력받아, 더하기,빼기,곱하기 값을 리턴 / 1개만 리턴 가능
	void addSubMulti() {
		System.out.print("첫번째 숫자를 입력하세요.>> ");
		int a = scanner.nextInt();
		System.out.print("두번째 숫자를 입력하세요.>> ");
		int b = scanner.nextInt();
		System.out.println("합 : "+(a+b));
		System.out.println("차 : "+(a-b));
		System.out.println("곱 : "+(a*b));
	}
	
	// 여러개 받아 리턴하는 방법 : 배열(int[])로 묶어서 리턴
	int[] addSubMulti2() {
		int[] result = new int[3];  // return타입 : int[]
		System.out.print("첫번째 숫자를 입력하세요.>> ");
		int a = scanner.nextInt();
		System.out.print("두번째 숫자를 입력하세요.>> ");
		int b = scanner.nextInt();
		result[0] = (a+b);
		result[1] = (a-b);
		result[2] = (a*b);
		return result;  // 리턴 1개만 가능
	}
	
	// 출력할 필요 없이 매개변수로 받아서 처리
	// 배열,객체를 매개변수로 보낼시 리턴이 필요없음
	// 기본타입 8가지 -> 리턴 필요 
	// (기본타입 : boolean,char,byte,short,int,long,float,double)
	void addSubMulti3(int[] result) {
		System.out.print("첫번째 숫자를 입력하세요.>> ");
		int a = scanner.nextInt();
		System.out.print("두번째 숫자를 입력하세요.>> ");
		int b = scanner.nextInt();
		result[0] = (a+b);
		result[1] = (a-b);
		result[2] = (a*b);
	}
	
	
	
}


//=====================================================
// avg의 result
// total의 result 
// => 이름이 result로 같아도 됨 -> 메서드를 나오면 result값이 사라지기 때문
// void -> return 필요 X
// int -> return 필요 O
// resurn result; : 같은 타입이라 result 사용
//                  -> 다른 타입이면 다른 이름 사용
//=====================================================

