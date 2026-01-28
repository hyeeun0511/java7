
//======================[ 학생성적프로그램 ]=========================//

package j0127;

import java.util.Scanner;

public class C02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuDeck s = new StuDeck(); // StuDeck 클래스의 객체 생성 - stuDeck.java와 연결
		
		// 무한반복
		while(true) {
			s.stuPrint(); //화면출력부분 - stuDeck.java와 연결
			int choice = scan.nextInt();
			// switch문 : 선택지 
			switch(choice) {
			case 1:
				s.stuInput(); // 학생성적입력부분
				break;
			case 2:
//				s.stuOutput(); // 학생성적출력부분
				break;
			case 3:
//				s.stuUpdate(); // 학생성적수정부분
				break;
			case 0:
				System.out.println("[ 프로그램 종료 ]");
				System.out.println();
//				break loop;
			}
		}
		
		
		// 방법 1)
//		Stuscore s1 = new Stuscore();
//		s1.no = 1;
//		s1.name = "홍길동";
//		s1.kor= 100;
//		s1.eng= 100;
//		s1.math= 99;
//		s1.total= (100+100+90);
//		s1.avg = s1.total/3.0;
//		Stuscore s1 = new Stuscore("홍길동",100,100,90);
		
		// 방법 2) 생성자 오버로딩
//		Stuscore[] s = new Stuscore[10];
//		s[0] = new Stuscore("홍길동",100,100,90);
//		System.out.println(s[0].no+","+s[0].name);
//		
//		s[1] = new Stuscore("유관순",90,90,99);
//		System.out.println(s[1].no+","+s[1].name);

	}
}

// 기본 생성자 사용 -> 각각의 값을 직접 대입
// 생성자 오버로딩 사용 -> 값을 대입하면서 객체 생성