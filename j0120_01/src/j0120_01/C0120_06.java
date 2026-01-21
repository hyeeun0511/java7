package j0120_01;

import java.util.Arrays;
import java.util.Scanner;

public class C0120_06 {

	public static void main(String[] args) {
		// 1-45 사이의 랜덤숫자 6개를 입력후 출력하시오.
		Scanner scanner  = new Scanner(System.in);
		// 1-45까지 숫자 저장 / 랜덤번호 6개 저장 / 입력번호 6개 저장 / 로또번호 6개 저장
		int[] num = new int[45];
		int[] random = new int[6];
		int [] input = new int[6];
		int[] lotto = new int[6];
		// 1. 순차번호 넣기
		for(int i=0;i<num.length;i++) {
			num[i]=i+1; // 1~45까지 순차번호 넣기 // num[0]=1, ... num[44]=45
		}
		// 2. 번호 섞기
		
		// 3. 6개 번호 추출
		// 4. 6개의 숫자를 입력하세요.
		// 5. 번호확인입력
		// 6. 결과 출력
		

	}

}
