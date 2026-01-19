package j0119_01;

import java.util.Scanner;

public class C0119_05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  // 입력 받을때 작성 필수
		// Q. int score 점수를 입력받아
		// 97이상 A+ / 97~94 A / 93 A-
		// 89~88이상 B+ / 87~84 B / 83 B-
		// 77이상 C+....
		// 66이상 D+
		// 60미만 F
		// 출력하시오.
		System.out.println("음료 선택을 하세요."); 
		System.out.println("1. 아메리카노");
		System.out.println("2. 바닐라라떼");
		System.out.println("3. 아이스티");
		System.out.println("원하는 번호를 선택하세요.>> "); // 음료 선택 입력받기
		int input = scanner.nextInt(); // sore 점수 입력받기
		// switch문 - 한번 비교
		switch(input) {
		case 1:
			System.out.println("아메리카노를 생산합니다.");
			// 2분
			break; // switch문 탈출 / break가 있어야 선택됨 -> 미작성시, 전체 선택됨
		case 2:
			System.out.println("바닐라라떼를 생산합니다.");
			// 3분
			break;
		case 3:
			System.out.println("아이스티를 생산합니다.");
			// 1분 30초
			break;
		// default: *else와 동일(case에 없는 값 입력시)
			// System.out.println("음료 선택이 잘못되었습니다.");
		}
		
		
//		System.out.println("점수를 입력하세요.>> "); // 점수 입력받기
//		int score = scanner.nextInt(); // sore 점수 입력받기
//		if (score>=90) {
//			if(score>=98) System.out.println("A+");
//			else if (score >= 94) System.out.println("A");
//			else System.out.println("A-");
//		}else if(score>=80) {
//            if(score>=88) System.out.println("B+");
//            else if (score >= 84) System.out.println("B");
//            else System.out.println("B-");
//		}else if(score>=70) {
//            if(score>=78) System.out.println("C+");
//            else if (score >= 74) System.out.println("C");
//            else System.out.println("C-");
//		}else if(score>=60) {
//			if (score >= 68) System.out.println("D+");
//			else if (score >= 64) System.out.println("D");
//			else System.out.println("D-");
//		} else {
//			System.out.println("F");
//		}
//		System.out.println();
		
		
		// 19854(5자리 숫자 입력받기) -> 7이 몇개 있는지 출력하시오.
		// if문 5번 사용
		// 문자열 -> charAt() 함수 사용
//		int count = 0;
//		System.out.println("5자리 숫자를 입력하세요.>> "); // 5자리 숫자 입력받기
//		String num = scanner.next(); // 5자리 숫자 입력받기
//		if(num.charAt(0)=='7') count++; 
//		if(num.charAt(1)=='7') count++;
//		if(num.charAt(2)=='7') count++;
//		if(num.charAt(3)=='7') count++;
//		if(num.charAt(4)=='7') count++;
//		
//		System.out.printf("7의 개수 : ",count);
		
		
		
		
		
		
//		System.out.println("숫자를 입력하세요.>> "); // 숫자 입력받기
//		int input = scanner.nextInt(); // 숫자 입력받기
//		// 수(90이상),우(80이상),미(70이상),양(60이상),가(60미만)
//		if(input>=90) {
//			System.out.println("수");
//		}else if(input>=80) {
//			System.out.println("우");
//		}else if(input>=70) {
//			System.out.println("미");
//		}else if(input>=60) {
//			System.out.println("양");
//		}else {
//			System.out.println("가");
//		}
		
//		// 양수, 0, 음수 if else if else
//		if(input>0) {
//			System.out.println("양수입니다.");
//		}else if(input==0) {
//			System.out.println("0입니다.");
//		}else {
//			System.out.println("음수입니다.");
//		}
		
		
//		if(input>=60) {
//			System.out.println("합격입니다.");  // 한줄일때만 {} 생략가능
//			System.out.println("끝");
//		}else {
//			System.out.println("불합격입니다.");
//		}

	}

}
