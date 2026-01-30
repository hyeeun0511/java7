package j0129;

import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuDeck s = new StuDeck();
		loop:while(true) {
			s.screen_print();
			int choice = scan.nextInt();
			// 번호가 1~3이 아니면 종료
			switch(choice) {
			case 1:
				s.stu_input(); //  성적입력 부분
				break;
			case 2:
				s.stu_output(); //  성적출력 부분
				break;
			case 3:
				s.stu_delete(); //  성적삭제 부분
				break;
			case 0:
				System.out.println("[ 프로그램 종료 ]");
				break loop;
			}
		}//while
	}

}


// 1.
// 	public static void main(String[] args) {
//	Scanner scan = new Scanner(System.in);
//	StuDeck s = new StuDeck();
//	while(true) {
//		s.screen_print();
//		int choice = scan.nextInt();

// 2. switch문
////번호가 1~3이 아니면 종료
//			switch(choice) {
//			case 1:
//				break;
//			case 0:
//				System.out.println("[ 프로그램 종료 ]");
//				break loop;
//			}
// => StuDeck 으로 가서 성적입력 부분

