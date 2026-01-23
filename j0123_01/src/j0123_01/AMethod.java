package j0123_01;

import java.util.Scanner;

public class AMethod {
	
	// 3개의 값 출력
	void input(int[] num) {
		Scanner scanner = new Scanner(System.in); // 값 입력받기위해
		//3개의 input를 받아, num에 저장해서 출력하세요.
		for(int i=0;i<num.length;i++) {
			System.out.println("숫자를 입력하세요.>> ");
			num[i] = scanner.nextInt(); // 입력받은 값 -> num에 저장
		}
	}
	
}

//=====================================================
// Static -> 앞에 기본형 타입 생략 가능
// 배열,객체로 값을 보내면 -> 값이 변경됨
//=====================================================