package j0121_01;

import java.util.Arrays;
import java.util.Scanner;

public class C0121_01 {

	public static void main(String[] args) {
		// [ 1-45 로또프로그램 구현 ]
//		1. 순차번호 넣기
		// 1,2,3
		Scanner scanner  = new Scanner(System.in);  // input 받기위해
		int[] num = new int[45]; // 1~45까지 숫자 저장
		int[] random = new int[6]; //담청로또번호 6개 저장
		int[] input = new int[6]; // 입력번호 6개 저장
		int[] lotto = new int[6]; // 입력한 당첨번호 저장
		int count = 0; // 당첨번호 개수 저장
		// 1. 순차번호 넣기
		for(int i=0;i<45;i++) {
			num[i]=i+1;
		}
		System.out.println(Arrays.toString(num)); // 확인용
		
//		2. 번호 섞기
		for(int i=0;i<300;i++) {
			int no = (int)(Math.random()*45); // 0~44 랜덤숫자 생성
			int temp = num[0];
		    num[0] = num[no];  // 랜덤번호의 값을 0번방에 입력
		    num[no] = temp;    // temp에 저장된 값을 랜덤번호 방에 입력
		}
		System.out.println(Arrays.toString(num)); // 확인용  => 섞인 번호 45개 출력

//		3. 6개 번호 추출
		for(int i=0;i<random.length;i++) {
			random[i]=num[i]; // 섞인 번호 45개 중 앞에 6개 추출
		}
		
//		4. 6개 입력숫자 저장
		for(int i=0;i<6;i++) {
			System.out.println("1-45까지 숫자 입력>> ");
			input[i]=scanner.nextInt();  // 입력번호 6개 저장
		}

//		5. 입력번호와 당첨번호 확인
		for(int i=0;i<random.length;i++) {
			for(int j=0;j<input.length;j++) {
				if(random[i]==input[j]) {
					lotto[count]=random[i];  // random -> input넣어도 됨. => 맞춘번호 저장
					count++;
					break;
				}
			}		
		}
		
//		6. 모두 출력
		System.out.println("당첨번호 : "+Arrays.toString(random));
		System.out.println("입력번호 : "+Arrays.toString(input));
		System.out.println("당첨된 번호 : "+Arrays.toString(lotto));
		System.out.println("당첨된 개수 : "+count);

	}

}
