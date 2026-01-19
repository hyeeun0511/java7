package j0119_01;

import java.util.Scanner;

public class C0119_06 {

	public static void main(String[] args) {

		// 7이 총 몇개 있는지 출력
		
		int count = 0;
		String num = "9789057899979971234567";
		
		// indexOf() 메소드, for문을 이용해서 7이 몇개 사용되었는지 출력하세요.
		// 7이 있는 위치와 7이 총 몇개가 있는지 출력하시오.

//		System.out.println(num.indexOf("7",15));  // ("7",7) : 7번째 위치부터 7찾기 / ("7",15) : 15번째 위치부터 7찾기

//		if(num.indexOf("7")==-1) {
//            System.out.println("해당 문자가 없습니다.");
//		}else {
//			System.out.println("문자위치 : "+num.indexOf("7"));
//		}
		
		
		
//		String num = "1234567";
//		// charAt() : 문자열에서 해당위치값을 문자로 변환
//		
//		// 입력받은 숫자에 7이 있는지 확인하시오.
////		System.out.println(num.indexOf("7"));
//		System.out.println(num.indexOf("8"));  // 해당 숫자가 없으면 -1 반환
//
//		if(num.indexOf("8")==-1) {
//            System.out.println("해당 문자가 없습니다.");
//		}else {
//			System.out.println("문자위치 : "+num.indexOf("8"));
//		}
		// contains : 해당 문자열이 있는지,없는지 확인하는 메소드 (위치는 알려주지 X)
//		if(num.contains("7")) {
//			System.out.println("7이 존재합니다.");
//		}else {
//			System.out.println("7이 존재하지 않습니다.");
//		}
		
		
		
//		Scanner scanner = new Scanner(System.in);
//		// Q. 핸덤숫자(0-9까지 숫자) 1개를 생성해서
//		// 입력받은 숫자 7개 중에 랜덤숫자랑 똑같은 숫자가 몇개인지 출력하시오
//		
//		// 1) 랜덤 숫자 1개 생성
////		System.out.println((int)(Math.random()*10)); // 0~9 랜덤숫자 1개
//		int rnum = (int)(Math.random()*10); // 랜덤숫자 1개 생성(0~9)
//		int r = (char)(rnum+'0'); // 숫자 -> 문자형 변환
//		
//		// int 숫자타입을 char숫자타입으로 변경방법
//		// (char)(1+'0') = 1+48 = 49 : 문자(1)
//		// char숫자타입을 int타입으로 변경방법
//		// '7'-'0' = int타입 7
//		
//		char ch = (char)(rnum+'0'); // 랜덤숫자 -> 문자형 변환
//		// 2) 숫자 7개 입력
//		int count = 0;
//		System.out.println("숫자 7개를 입력하세요.>> ");
//		String input = scanner.next(); // 숫자 7개 입력
//		// for문
//		for (int i=0;i<input.length();i++) {
//			if (input.charAt(i)==rnum) count++;
//		}
//		// 3) 출력
//		System.out.println("랜덤숫자 : "+ch);
//		System.out.println("입력숫자 : "+input);
//		System.out.println("결과 : "+count);
		
		
		
		// Q. 숫자 5개를 입력받아, 7이 몇개 입력되었는지 출력
		
		// 응용)
//		int count = 0; // count 변수 선언 
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.>> ");
//		String input = scanner.next(); // 숫자 5개 입력받기
//		
//		for (int i=0;i<input.length();i++) {
//			if (input.charAt(i)=='7') count++;
//		}
//		System.out.println(input.length()); // 입력된 문자열의 길이 확인
//		System.out.println("입력숫자 :" + input);
//		System.out.printf("7의 개수 : %d개",count);
		
		// 방법 1)
//		int count = 0; // count 변수 선언 
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("숫자 5개를 입력하세요.>> ");
//		String input = scanner.next(); // 숫자 5개 입력받기
//		
//		for (int i=0;i<5;i++) {
//			if (input.charAt(i)=='7') count++;
//		}
//		
//		System.out.println("입력숫자 :" + input);
//		System.out.printf("7의 개수 : %d개",count);
//		
		// 방법 2)
//		Scanner scanner = new Scanner(System.in);
//		int count = 0; // count 변수 선언
//		System.out.println("숫자 5개를 입력하세요.>> ");
//		String input = scanner.next(); // 숫자 5개 입력받기
//		
//		char ch1 = input.charAt(0);
//		char ch2 = input.charAt(1);
//		char ch3 = input.charAt(2);
//		char ch4 = input.charAt(3);
//		char ch5 = input.charAt(4);
//		
//		if (ch1=='7') count++;
//		if (ch2=='7') count++;
//		if (ch3=='7') count++;
//		if (ch4=='7') count++;
//		if (ch5=='7') count++;
		
		
		
		
		
		
		// Q. 랜덤숫자(0~9) 5개를 생성해서 -> 145667 -> 7이 몇개 있는지 출력
		// for문 사용
		
		// 방법 1)
//		int count = 0;
//		String random_num = "";
//		
//		for(int i=0;i<5;i++) {
//			int rnum = (int)(Math.random()*10);
//			random_num += rnum; // 문자열(랜덤숫자) 결합
//			if (rnum==7) count++;
//		}
//				
//		System.out.println("랜덤숫자 : "+random_num);
//		System.out.println("결과값 : "+count);
		
		// 방법 2)
//		int count = 0;
//		
//		int rnum = (int)(Math.random()*10);
//		if (rnum==7) count++;
//		
//		int rnum2 = (int)(Math.random()*10);
//		int rnum3 = (int)(Math.random()*10);
//		int rnum4 = (int)(Math.random()*10);
//		int rnum5 = (int)(Math.random()*10);
//		
//		if (rnum==7) count++; 
//		if (rnum2==7) count++; 
//		if (rnum3==7) count++; 
//		if (rnum4==7) count++; 
//		if (rnum5==7) count++; 
//		
//		System.out.println("결과값 : "+count);
		
		
		
//		int sum = 0;
//		int i = 0;
//		for(i=1;i<=10;i++) {
//			sum += i;
//			System.out.println(i+","+sum);  // i가 for문 안에 있을 경우 i=10, sum=55
//		}
//		
//		System.out.println(i+","+sum);  // i가 for문 밖에 있을 경우 i=11, sum=55
		
		
//		// Q. 1~100까지의 홀수의 합이 100을 넘는 시점의 i,sum값을 구하시오 (sumㅡ>100)
//		int sum = 0;
//		for (int i=1;i<=100;i++) {
//			if (i%2==1) {
//				sum += i;
//				if (sum>100) {
//					System.out.println(i+","+sum);
//					break;
//				}
//			}
//		}
		
		// Q. 1~100까지의 홀수의 합을 구하시오
//		int sum = 0;
//		for (int i=1;i<=100;i++) {
//			if (i%2==1) {
//				sum += i;
//				System.out.println(i+"+"+sum);	
//			}
//		}
		
		// Q. 1~100까지의 합을 구하시오.
//		int sum = 0;
//		for(int i=1;i<=100;i++) {
////			System.out.println(i);
//			sum += i;
//			System.out.println(i+"+"+sum);
//		}
		
		
		
//		int sum = 0;
//		
//		for(int i=1;i<=10;i++) {
//			System.out.println(i);
//			sum += i;
//			System.out.println(i+","+sum);
//		}

//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		
//		for(int i=0;i<5;i++) {
//			System.out.println(i);
//		}
//		// i : 0~4
//		// 1) i=1
//		// 2) i++ -> i=2
//		// 3) i<5 -> true
//		// 1)~3) 반복
		
		
//		// 0~9까지 랜덤숫자 5개를 출력하시오.(중복가능) ex)14356 
//		System.out.println(Math.random()*10);
//		System.out.println((int)(Math.random()*10)); // 0~9까지 랜덤숫자 
//		System.out.println((int)(Math.random()*10)+1); // 1~10까지 랜덤숫자
		
		
//		int r_num = (int)(Math.random()*10); // 0~9까지 랜덤숫자
//		int r_num2 = (int)(Math.random()*10); // 0~9까지 랜덤숫자
//		int r_num3 = (int)(Math.random()*10); // 0~9까지 랜덤숫자
//		int r_num4 = (int)(Math.random()*10); // 0~9까지 랜덤숫자
//		int r_num5 = (int)(Math.random()*10); // 0~9까지 랜덤숫자
//		// printf() 함수로 출력
//		System.out.printf("%d%d%d%d%d\n",r_num,r_num2,r_num3,r_num4,r_num5);
		
//		// 0~9
//		int r_num = (int)(Math.random()*10); // 0~9까지 랜덤숫자
//		// 0~99
//		int r_num2 = (int)(Math.random()*100); // 0~99까지 랜덤숫자
//		// 0~49
//		int r_num3 = (int)(Math.random()*50); // 0~49까지 랜덤숫자
		// 출력 아직 안함
		
//		// 1~45까지 랜던숫자를 출력하시오.
//		int random_num = (int)(Math.random()*45)+1; 
//  	// 1~100까지 랜덤숫자
//		int random_num2 = (int)(Math.random()*100)+1; 
//		System.out.println(random_num);

	}

}
