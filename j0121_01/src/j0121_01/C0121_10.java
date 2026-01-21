package j0121_01;

import java.util.Scanner;

public class C0121_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 0. 변수 선언
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		int[] no = new int[5]; // 번호 5명 선언
		String[] name = new String[5]; // 이름 5명 선언
		int[][] score = new int[5][4]; // 국,영,수,합계
		double[] avg = new double[5];  // 평균 5명
		int count = 0; // 입력된 학생 수 
		// total !! 학생 성적 입력 전 필수 
		int total = 0; // 합계 
		// int[][] : 정수만 저장 가능 -> 평균은 double로 따로 저장
		
		loop:while(true) {
			System.out.println("[ 학생성적프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 성적검색");
			System.out.println("0. 종료");
			System.out.println("------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			int choice = scanner.nextInt(); // 번호 입력
			
			switch(choice) { //switch : 선택
			// 1. 성적입력
			case 1:
				total = 0; // 합계 초기화 (다음 학생때 합계가 합쳐져서 나오지 않도록) 
				System.out.println("[ 학생 성적 입력 ]");
				System.out.printf("%d번째 학생 이름을 입력하세요.>> ",count+1);
				name[count] = scanner.next();  // count로 작성 -> 0,1,2,3,4번방(몇번째 학생인지 구분)=> 더 간단하게
				for(int i=0;i<3;i++) {
					// 국 영 수 점수 입력
					System.out.printf("%s 점수를 입력하세요.>> ",title[i+2]); //title[i+2] :과목시작위치: 국어,영어,수학 //title[i]: 0:번호,1:이름
					score[count][i] = scanner.nextInt(); // count: 학생번호, i: 과목
					// 합계
					total += score[count][i];  // 합계누적계산 // total=total+score[count][i]; 
					// 평균
					avg[count] = total/3.0;
					no[count] = count+1; //번호
					System.out.println("학생성적이 입력되었습니다.");
				}
				
				break;
			// 2. 성적출력
			case 2:
				System.out.println("  [ 학생성적출력 ]  ");
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",title[0],title[1],title[2],title[3],title[4],title[5],title[6]); //번호,이름,국어,영어,수학,합계,평균");
				System.out.println("-------------------------------------------------------");
				for(int i=0;i<count;i++) {
					System.out.printf("%d\t",no[i]); // 번호
					System.out.printf("%s\t",name[i]); // 이름
					 // 국영수
					System.out.printf("%"); // 합계
					 // 평균
				}
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				System.out.println("프로그램을 종료합니다.");
				break loop; //종료 //while문 탈출
			}
		}
		
		// 1. 성적 입력
		// 성적 출력
		// 성적 수정
		// 성적 검색
		// 종료

	}

}
