package j0122_01;

import java.util.Scanner;

public class C0122_09 {
	static Scanner scanner = new Scanner(System.in); //인스턴스변수 -(객체선언 후) 참조변수명.변수명

	static int[] stuInput() {
		int[] score = new int[3];
//		int kor = 0;
//		System.out.println("국어점수를 입력하세요.>> ");
//		kor = scanner.nextInt();
//		return kor;
		// 국어,영어,수학 점수 받아서 return
		
		// 1. 점수 입력
		System.out.println("국어점수를 입력하세요.>>");
		score[0] = scanner.nextInt();
		System.out.println("영어점수를 입력하세요.>>");
		score[1] = scanner.nextInt();
		System.out.println("수학점수를 입력하세요.>>");
		score[2] = scanner.nextInt();
		return score; // return은 1개만 가능 -> 여러개 : 배열로 묶어서 return
	}
	
	public static void main(String[] args) {
		
		
		// 국영수 점수를 출력하세요
		// 2. 점수 출력 -1번째 방법
		//System.out.println(stuInput());
//		int[] score = stuInput(); // 배열로 받음
//		System.out.printf("국어점수: %d\n",score[0]);
//		System.out.printf("영어점수: %d\n",score[1]);
//		System.out.printf("수학점수: %d\n",score[2]);
		
		// 점수 출력 -2번째 방법
		int[] score = stuInput();
		System.out.printf("국어점수: %d\n영어점수: %d\n수학점수: %d\n",score[0],score[1],score[2]);
//		System.out.printf("국어점수: %d\n",stuInput()[0],"영어점수: %d\n",stuInput()[1],"수학점수: %d\n",stuInput()[2]);
		
		
		
		
		
//		// 객체선언 - 주소값 매개변수 전달 - MainMethod
//		MainMethod m = new MainMethod();
//		
//		// 주소값 매개변수 전달하면 값이 변경됨
//		Stuscore[] stuArr = new Stuscore[3]; // stuArr : 저장소
//		m.stuInput(stuArr); // 학생 한명의 성적 저장
//		m.stuOutput(stuArr); // 저장된 학생 성적 출력

	}

}
