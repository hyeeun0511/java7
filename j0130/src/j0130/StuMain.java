package j0130;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuDeck s = new StuDeck();
		loop:while(true) {
			s.screen(); //화면출력
			int choice = scan.nextInt();
			switch(choice) {
			case 1://성적입력
				s.stu_input();
				break;
				
			case 2://성적출력
				s.stu_output();
				break;
				
			case 4://성적삭제
				s.stu_delete();
				break;
			
			case 8://파일불러오기
				s.fileOpen();
				break;
			
			case 0://프로그램종료
				System.out.println("[ 프로그램 종료 ]");
				break loop;
			}//switch
			
		}//while
		
		// 8. 파일 불러오기 -> 2. 성적출력 ==> 해야 불러온 성적 확인 가능
		
		


	}
}