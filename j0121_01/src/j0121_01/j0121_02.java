package j0121_01;

import java.util.Scanner;

public class j0121_02 {

	public static void main(String[] args) {
		
		// Q. 1조123456
		// 6 맞추면 - 500원
		// 56 맞추면 - 1000원
		// 456 맞추면 - 10000원
		// 3456 맞추면 - 10만원
		// 23456 맞추면 - 100만원
		// 123456 맞추면 - 1000만원
		// 123456 랜덤으로 받아옴. 첫숫자 0 불가
		
		// 6자리를 랜덤으로 복권번호 생성
		// 0 - 999999 랜덤번호 생성해서 출력
		int random = (int)(Math.random()*100000); // int random : 0-99999 랜덤번호 생성 / *100000 : 6자리수 만들기 위해
		String lotto = String.format("%06d", random);
		System.out.println(lotto);
		
		// 100000 + (0-99999) 랜덤번호 생성
//		int lotto = 100000 + (int)(Math.random()*100000); // 100000-199999 랜덤번호 생성
//		System.out.println("복권 랜덤번호 : "+lotto);
		
		// 프로그램을 구현하세요.
		// 입력번호(000005-6자리)와 끝번호가 맞는지 확인해서 맞춤,틀림 출력하세요. (5번방)
		Scanner scanner  = new Scanner(System.in); // input 받기위해
		System.out.println("복권번호 6자리를 입력하세요.>> ");
		String input = scanner.next(); // 문자열
		
//		System.out.println(input.charAt(5));  // 입력한 번호의 5번방 문자
//		System.out.println(lotto.charAt(5));  // 로또번호의 5번방 문자
//		
		
		// 5번방 문자 비교 - 맞춤,틀림
		if (input.charAt(5) == lotto.charAt(5)) { //charAt() : 문자열에서 특정 위치의 문자를 반환
			System.out.println("500원 당첨!!");
		}else {
			System.out.println("틀림");
		}
		

		// 방 문자 비교 
//		if (input.charAt(5) == lotto.charAt(5)) {
//			if(input.charAt(4) == lotto.charAt(4)) {
//				if(input.charAt(3) == lotto.charAt(3)) {
//					if (input.charAt(2) == lotto.charAt(2)) {
//						if (input.charAt(1) == lotto.charAt(1)) {
//							if (input.charAt(0) == lotto.charAt(0)) {
//								System.out.println("1000만원");
//							} else {
//								System.out.println("100만원");
//							}
//						} else {
//							System.out.println("10만원");
//						}
//					} else {
//						System.out.println("10000원");
//					}
//				} else {
//					System.out.println("1000원");
//				}
//			}else {
//				System.out.println("500원");
//			}
//		}else {
//			System.out.println("틀림");
//		}


		
		
		
		
		
// ===================================================================
		
		
//		Scanner scanner  = new Scanner(System.in);
//		String[] binary = { // 2진수 배열
//				"0000","0001","0010","0011",  // 0,1,2,3
//				"0100","0101","0110","0111",  // 4,5,6,7
//				"1000","1001"                 // 8,9
//		};
//		
//		// 출력형태
//		// 1987 입력시 -> 0001 1001 1000 0111 출력
//		// 0752 -> 0000 0111 0101 0010 출력  // int는 0으로 시작 불가 -> 문자열(string)로 받기
//		// 숫자 1개를 입력받아, 2진수를 출력하세요.
//		System.out.println("숫자를 입력하세요.>> ");
////		int input = scanner.nextInt();  
////		System.out.println(binary[input]);  
//		String input = scanner.next(); // input 문자열로 받기
//		System.out.println(binary[Integer.parseInt(input)]); // 문자열 -> 정수형으로 변경 후 배열방에 입력
////		System.out.println(binary[Input.charAt(0)-'0']);  // 0번째 문자 갖고오는 것
		
		
		
//		System.out.println("숫자를 입력하세요.>> ");
//		String input = scanner.next(); // input 문자열로 받기
		
		
//		// 1234
//		for(int i=0;i<input.length();i++) {
//			System.out.println(binary[input.charAt(i)-'0']);  // -'0'  => char타입을 int타입으로 변경
////			binary['1'-'0'];
//		}
		
		
		
		
		
		
		
// ===================================================================
//		// 숫자타입 -> 문자열타입 (string)
//		System.out.println(""+7+7.7);
//		
//		// 문자열타입 -> 숫자(int_정수)타입
//		int a = Integer.parseInt("77"); // 정수형으로 바꿈
//		double b = Double.parseDouble("77.7"); // 실수형으로 바꿈
//		
//		// 문자(char)숫자타입 -> int타입
//		// 문자(char)타입 -> int(숫자)타입 으로 변경할수 있음
//		System.out.println('9'-'0');  // int타입 9 //''안에 숫자가 들어있을때만 가능!!
//		
//		// int타입 -> char타입으로 변경
//		System.out.println((char)(9+'0')); // 문자타입 9
		
				
		

	}

}
