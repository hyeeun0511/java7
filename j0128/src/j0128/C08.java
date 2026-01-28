package j0128;

import java.util.Scanner;

public class C08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuDeck s = new StuDeck();
		loop:while(true) {
			s.screen_print(); // 출력화면
			int choice = scan.nextInt();
			switch(choice) {
			case 1: //입력
				s.stuInput(); // 학생성적입력
				break;
			case 2: // 출력
				s.stuOutput(); // 학생성적출력
				break;
			case 4: // 삭제
				s.stuDelete(); // 학생성적삭제
				break;
			case 0:
				System.out.println("[ 프로그램 종료 ]");
				System.out.println();
				break loop;
			}
		}
		// while문에 loop -> break loop; -> while문 종료
		
		
		
//		Stuscore s = new Stuscore();
//		s.setKor(50); // kor자체에 제약조건을 걸어줌. 
//		s.setKor(500); // kor자체에 제약조건을 걸어줌. 
////		s.kor = 500; 
//		System.out.println(s.getKor()); // 0 -> set이 안되어있음 -> 0~100까지만 값입력이 가능한데 500이 들어갔기때문. => 500 무시
	}

}
