// 로또 번호 맞추기 프로그램 //

package j0120_01;

import java.util.Arrays;
import java.util.Scanner;

public class C0120_05 {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		int[] num = new int[45]; // 1~45까지 숫자 저장
		int[] random = new int[6]; // 랜덤번호 6개 저장
		int[] input = new int[6]; // 입력번호 6개 저장
		int[] lotto = new int[6]; // 로또번호 6개 저장
		
		int count = 0; // 맞춘번호개수
		
		// 1-45 사이의 랜덤숫자 6개를 입력후 출력하세요.
		
		// 1) 순차번호 넣기
		for(int i=0;i<num.length;i++) {
			num[i]=i+1;
		}
		
		// 2) 번호 섞기
		for(int i=0;i<200;i++) {
			int no = (int)(Math.random()*45); // 0~44 랜덤숫자 생성
			int temp = num[0];
			num[0] = num[no];
			num[no] = temp;  // temp:임시저장공간 // 번호 섞을때 필수
		} 
		
		// 3) 6개 번호추출
		for(int i=0;i<6;i++) {
			random[i]=num[i];
		}
		System.out.println(Arrays.toString(random)); // 섞인 번호 45개 중 앞에 6개 출력(확인용)
		// 6개의 숫자를 입력하세요.
		for(int i=0;i<6;i++) {  // for를 나오자마자 i 사라짐  // for를 나오면  =>  int i=0;i<6;i++ 사용 불가
			System.out.printf("%d번째, 1-45까지 숫자를 입력하세요.>> \n",i+1);
			input[i]=scanner.nextInt();
		}
		
		// 4) 번호확인
		for(int i=0;i<6;i++) { // 랜덤 번호중 하나
			for(int j=0;j<6;j++) { // 입력한 번호중 하나
				if(random[i]==input[j]) { // 랜덤번호 = 입력번호
					lotto[count] = input[j]; // 맞춘번호 저장
					count++;
					break; // 입력한 번호와 일치하면 더이상 비교할 필요 없음 => 다음 랜덤번호로 이동해서 비교
				}
			}
		}
		
		


		
		
		String str = Arrays.toString(random);
		System.out.println("랜덤번호 : "+str);
		System.out.println("입력번호 : "+Arrays.toString(input));
//		System.out.println("맞춘번호 : "+Arrays.toString(lotto));  // 못맞추면 0으로 출력됨
		System.out.print("맞춘번호 : ");
		// 맞춘 번호만 출력
		for(int i=0;i<count;i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		System.out.println("맞춘번호 개수 : "+count+"개");
		
		
		
//		String str = Arrays.toString(random);
//		System.out.println("번호 : "+str);

	}

}
