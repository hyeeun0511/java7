package j0121_01;

import java.util.Arrays;

public class C0121_05 {

	public static void main(String[] args) {
//		int[] num = new int[5]; // 1차원 배열 선언
		int[] num = {1,2,3,4,5}; // 선언과 동시에 초기화
		
		int[] num2 = new int[10];
		
		System.out.println(Arrays.toString(num));
		// [1,2,3,4,5]에서 3->50 으로 병경
		num[2]=50; // 2번방에 50 대입
		System.out.println(Arrays.toString(num)); // [1,2,50,4,5]
		// [1,2,3,4,5]에 번호 추가,삭제 불가능
		num[1]=0;
		System.out.println(Arrays.toString(num)); // [1,0,50,4,5]
		
		// 추가하는 방법 : 새로운 배열 생성
//		// 배열생성 -> 배열의 값을 복사 -> 새로운 배열에 추가/삭제
		
		// 방법1 : for문 이용
//		for(int i=0;i<num.length;i++) {
//			num2[i] = num[i]; // num 배열의 값을 num2 배열에 복사
//		}
		
		// 방법2 : System.arraycopy() 이용
//		System.arraycopy(num, 2, num2, 0, 2); // num 2번방부터 num2 0번방에 2개 복사
		System.arraycopy(num, 0, num2, 0, num.length); // num 배열 전체를 num2 배열에 복사
		
		System.out.println(Arrays.toString(num2));
		
	}

}
