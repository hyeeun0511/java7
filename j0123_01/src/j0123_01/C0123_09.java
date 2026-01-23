package j0123_01;

import java.util.Scanner;

public class C0123_09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 1) 객체 선언
		Stuscore[] s = new Stuscore[10]; // 학생 10명의 성적 저장 가능 // 배열로 객체선언
		String name = "";
		int kor=0,eng=0,math=0;
		int choice = 0;
		
		// 2) 학생성적입력 프로그램 생성
		System.out.println("[ 학생성적프로그램 ]");
		System.out.println("1. 학생성적입력");
		System.out.println("2. 학생성적출력");
		System.out.println("-----------------");
		
		// 3) 번호 선택
		System.out.print("원하는 번호를 입력하세요.>> ");  // choice
		choice = scanner.nextInt();
		
		// switch문
		switch(choice) {
		case 1:
			// 4) 학생성적입력
			// while문 : 반복
			// while 1바퀴 : 학생 1명 정보 입력
			while(true) {
				System.out.print("학생이름을 입력하세요.(0. 이전페이지로 이동)>>");
				name = scanner.next(); // 학생이름 입력 받음
				// 1) 0이 입력되었을 경우
				if(name.equals("0")) // if문 뒤에 ;를 붙이면 if문 종료
				break; // while문 종료
				// 2) 0이 입력되지 않았을 경우
				System.out.print("국어점수를 입력하세요.>> ");
				kor = scanner.nextInt(); // 국어점수 입력 받음
				System.out.print("영어점수를 입력하세요.>> ");
				eng = scanner.nextInt(); // 영어점수 입력 받음
				System.out.print("수학점수를 입력하세요.>> ");
				math = scanner.nextInt(); // 수학점수 입력 받음
				
				// 5) 입력받은 학생 한명의 정보를 객체로 만듦 -> 배열에 저장
				// Stuscore[] s = new Stuscore[10];       // 학생들을 저장하는 배열의 위치
				// static int count;                      // 현재 입력된 학생 번호  => 이 둘을 합쳐야함
				s[Stuscore.count]= new Stuscore(name,kor,eng,math); 
				System.out.println(); // 없어도 됨. => 줄바꿈 용도
				
			}//while(true)
			
			// 6) 학생성적출력
			// Stuscore.count : 현재 입력된 학생 수
			// => 입력된 학생 수 만큼 반복됨
			// 출력부분을 for문 안에 넣어놓은것 뿐. 
			for(int i=0;i<Stuscore.count;i++) { 
				System.out.printf(
				"%d. 이름:%s 국어:%d 영어:%d 수학:%d 총점:%d 평균:%.2f\n"
						);
				
			}
		}
		

	}

}
