package j0121_01;

import java.util.Arrays;

public class C0121_03 {

	public static void main(String[] args) {
		
		
		
		
//		// 5x5 2차원 배열 1~25까지 순차적인 번호를 입력해서 출력하시오.
//		int[][] score = new int[5][5]; // 5행 5열
////		int num = 1; // 1~25까지 숫자 입력용 변수, 입력 2번방법
//		int[] num2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};// 입력 3번방법
//																													
//		// 입력부분
//		for (int i = 0; i < score.length; i++) { // 행
//			for (int j = 0; j < score[i].length; j++) { // 열
////				score[i][j] = (i * 5) + j + 1; // 입력 1번 방법
////				score[i][j] = num++;  // num 값을 대입 후 1 증가, 입력 2번방법
//				score[i][j] = num2[(i*5)+j]; // 입력 3번방법
//			}
//		}
//		// 출력부분
//		for (int i = 0; i < score.length; i++) { // 행
//			for (int j = 0; j < score[i].length; j++) { // 열
//				System.out.print(score[i][j] + "\t");  // 값 출력
//			}
//			System.out.println(); // 행 바꿈
//		}
	
		
		
		
		
		
			
		
//		// [ 1차원 배열 순차적으로 번호 입력후 출력 ] 
//		int[] score = new int[5];
//		
//		for(int i=0;i<score.length;i++) {
//			score[i] = i+1;
//		}
//
//		for(int i=0;i<score.length;i++) {
//			System.out.print(score[i]+"\t");
//		}
		
		
		
		
		
		// 2차원 [5][5]
		// 1-25 값을 입력해서 출력하세요.
		// 3행 2열(2,1), 5행 1열(4,0), 2행 4열 값 출력
//		int[][] score = {
//				{1,2,3,4,5},
//				{6,7,8,9,10},
//				{11,12,13,14,15}, 
//				{16,17,18,19,20}, 
//				{21,22,23,24,25}
//		};
//		for(int i=0;i<score.length;i++) {
//			for (int j = 0; j < score[i].length; j++) {
//				System.out.print(score[i][j] + "\t");
//			}
//			System.out.println();
//		}
		
//		// 3행 2열, 5행 1열, 2행 4열, 5행 5열 값 출력
//		System.out.println(score[2][1]);
//		System.out.println(score[4][0]);
//		System.out.println(score[1][3]);
//		System.out.println(score[4][4]);
		
		
		
		
		
		// 1차원 배열
        int[] a = {1,2,3,4,5};
        for(int i=0;i<a.length;i++) {
        	System.out.print(a[i]+"\t");
        }
        System.out.println();
        
        // {}{} 중괄호 2개 -> []2개 필수 (int[][])
        // 2차원 배열
        int[][] score = {
        		{100,100,100},
        		{90,90,90},
        		{80,80,80}
        };
        for(int i=0;i<score.length;i++) {  // 행
        	for(int j=0;j<score.length;j++) {  // 열
        		System.out.print(score[i][j]+"\t");  // 값 출력 / score[i][j] -> i행 j열 값
        	}
        	System.out.println();  // 3개찍고 줄바꿈(enter)
        }

	}

}
