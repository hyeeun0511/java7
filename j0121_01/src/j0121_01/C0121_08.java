package j0121_01;

import java.util.Arrays;
import java.util.Scanner;

public class C0121_08 {

	public static void main(String[] args) {
		// 1-45까지 랜덤숫자 6개를 추출해서
		// 입력받은 6개 숫자와 몇개 맞는지 출력하세요
		// 로또번호 :
		// 입력번호 :
		// 당첨된번호 :
		// 당첨개수 :
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[45];
		int[] random = new int[6];
		int[] input = new int[6];
		
		//0. 번호 넣기(1~45 섞기 전)
		for(int i=0;i<45;i++) {
			num[i]=i+1;			
		}
		System.out.println(Arrays.toString(num));  //1-45 출력
		
		// 1. 번호 섞기
		for(int i=0;i<300;i++) {
			int no = (int)(Math.random()*45);
			int temp = num[0]; // 임시저장
			num[0] = num[no]; 
			num[no] = temp; 
		}
		System.out.println(Arrays.toString(num));  //1-45 랜덤 출력
		
		// 2. 랜덤 숫자 6개
				for(int i=0;i<random.length;i++) {
					random[i]=num[i]; // 섞인 번호 45개 중 앞에 6개 추출  // int[] random = new int[6]; 선언 해놓음
				}
		
		// 3. 6개 입력 숫자
		for(int i=0;i<6;i++) {
			System.out.println("1-45까지 숫자 입력>> ");
			input[i]=scanner.nextInt();  // 입력번호 6개 저장
		}
		
		//4. [ 입력번호 = 당첨번호 ] 확인
		for(int i=0;i<random.length;i++) {     // 랜덤번호 6개
			for(int j=0;j<input.length;j++) {  // 입력번호 6개
				if(random[i]==input[j]) {      // 랜덤번호 = 입력번호 같으면
					System.out.println("당첨번호 : "+random[i]);  // 당첨번호 출력
					
				}
				
			}
		} // for
		
		

	}

}
