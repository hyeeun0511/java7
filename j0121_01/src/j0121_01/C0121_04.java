package j0121_01;

import java.util.Scanner;

public class C0121_04 {

	public static void main(String[] args) {
		
		// 학생성적프로그램 - 이름,국어,영어,수학,합계
		// 이름 : String , 국어,영어,수학,합계 : int
		Scanner scanner  = new Scanner(System.in);
		String[] name = new String[2]; // 이름 2명
		int[][] score = new int[2][4]; // 국,영,수,합계 //[행][열] /[세로][가로]
		double[] avg = new double[2];  // 평균 2명 //double: 소수점까지 표현
		String[] title = {"이름","국어","영어","수학","합계","평균"};
		
		// 1. 성적입력
				int i = 0; // 학생수
				while(i<2) {
					System.out.printf("%s 이름을 입력하세요.>> ",title[0]);
					name[i] = scanner.next();
					int total = 0;
					for(int j=0;j<3;j++) { // 과목수별 점수 입력
						System.out.printf("%s 점수를 입력하세요.>> ",title[j+1]);
						score[i][j] = scanner.nextInt();
						total += score[i][j]; // 합계 계산
					}
					score[i][3] = total; // 합계 저장
					avg[i] = total/3.0;  // 평균 저장
					i++; // 다음 학생
				}
		
				// 2. 성적출력
				System.out.println("         [학생성적 프로그램]");
				System.out.println("---------------------------------------------");
				// 제목출력
				for (int t = 0; t < title.length; t++) {
					System.out.print(title[t] + "\t");
				}
				System.out.println();
				System.out.println("---------------------------------------------");
				// 내용출력(이름,국어,영어,수학,합계)
				for (int k = 0; k < score.length; k++) {
					System.out.print(name[k] + "\t"); // 이름 출력
					for (int p = 0; p < score[k].length; p++) {
						System.out.print(score[k][p]+"\t"); // 국어,영어,수학,합계 출력
					}
				// 평균 출력
					System.out.printf("%.2f \n",avg[k]); // 소수점 2자리까지 출력
				}
		
		
		
		
		
		// 대부분 2차원 배열로 많이 사용
		//[ 2차원 배열 ] 
//		int[][] score = {
//				{0,0,0,0,0},
//				{0,0,0,0,0},
//				{0,0,0,0,0},
//				{0,0,0,0,0},
//				{0,0,0,0,0},
//		};
//		int[][] score = new int[5][5]; // 5행 5열 // 25개 5,5 2차원 배열
//		int[] a = new int[25];
//		// 1차원 입력
//		for(int i=0;i<a.length;i++) {
//			a[i] = i+1; // 1~25까지 숫자 입력
//		}
//		
//		// 랜덤섞기 - 2차원 입력
//		for(int i=0;i<200;i++) { // 200번 섞기
//			int no = (int)(Math.random()*25); // 0~24 랜덤숫자 생성
//			int temp = a[0]; // a[0] 값을 temp에 저장 -> 랜덤으로 섞고 자리 바꾸리위해
//			a[0] = a[no]; // 랜덤숫자의 값을 a[0]에 입력
//			a[no] = temp; // temp에 저장된 값을 랜덤숫자 방에 입력
//		}
//		
//		
//		for(int i=0;i<score.length;i++) { // 행
//			for(int j=0;j<score[i].length;j++) { // 열  // score[i] -> i 필수(j 안됨) // score[i].length -> 각 행의 열 길이
//				//score[i][j] = j+1; // 각 행에 1~5까지 입력
//				//score[i][j] = 5*i+j+1; // 1~25까지 입력
//				score[i][j] = a[5*i+j]; // 0~24까지 입력
//			}
//		}
//		
//		// 2차원 출력
//	    for(int i=0;i<score.length;i++) { // 행
//	    	for(int j=0;j<score[i].length;j++) { // 열
//	    		System.out.print(score[i][j]+"\t"); // 값 출력 : ln-X -> 가로출력
//	    	} 
//	    	System.out.println();  // 행 바꿈 - 5개 가로로 출력 후
//	    }
		
		
		// [ 1차원 배열 ] - 랜덤으로 숫자 입력, 출력
//		int[] a = {1,2,3}; // 1 2 3
//		int[] a = new int[25]; // 0 0 0
//		for(int i=0;i<a.length;i++) {
//			a[i] = i+1; // 1 2 3
//		}
//		
//		for(int i=0;i<200;i++) {
//			int no = (int) (Math.random() * 25); // 중복 X . 랜덤으로 섞임
//			int temp = a[0]; // a[0] 값을 temp에 저장
//			a[0] = a[no]; // 랜덤숫자의 값을 a[0]에 입력
//			a[no] = temp; // temp에 저장된 값을 랜덤숫자 방에 입력	
//		}
//		// 자리만 바꿈 -> 중복 X
//		
//		for(int i=0;i<a.length;i++) { // 배열방 0~2
//			System.out.print(a[i]+"\t"); // 값 출력
//		}
		

	}

}
