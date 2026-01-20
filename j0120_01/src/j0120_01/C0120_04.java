package j0120_01;

import java.util.Arrays;
import java.util.Scanner;

public class C0120_04 {
	public static void main(String[] args) {
		// 1~45까지의 랜덤번호를 출력하세요.
//		(int)(Math.random()*45)+1;
		int[] random = new int[45];
		
//		for(i)
		
		Scanner scanner = new Scanner(System.in);
		
		// 순차번호 출력
//		System.out.println("숫자번호: "+Arrays.toString(random));
		
		// 1~45 순차번호 넣기
		for (int i = 0; i < 45; i++) {
		    random[i] = i + 1;
		}
		
		// 랜덤숫자 섞기
		for(int i=0;i<100;i++) {
			int no = (int)(Math.random()*45);
			int temp = random[0];
			random[0] = random[no];
			random[no] = temp;
		}
		// 순차번호 출력 (번호 6개 받아 출력)
		int[] input = new int[6];
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d번째 번호를 입력하세요.>> \n",i+1);
			input[i] = scanner.nextInt();
			if(input[i]<=0 || input[i]>=46) {
				System.out.printf("입력번호 : %d, 번호를 잘못입력하셨습니다.\n",input[i]);
				i -= 1;
				continue;
			}
		}
		System.out.println("입력번호 : "+Arrays.toString(input));
		
		// 앞 6개만 출력하세요.
		System.out.print("램덤번호 : ");
		for(int i=0;i<6;i++) {
//			System.out.println(random[i]+" ");            
		}
		System.out.println();
		
		
		// 순차번호
		
		

		// class 앞자리 6개만 출력하세요.);
		for(int i=0;i<6;i++) {
            System.out.print(random[i]+" ");
        }
		System.out.println();

	}

}
