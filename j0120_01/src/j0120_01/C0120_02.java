package j0120_01;

import java.util.Scanner;


public class C0120_02 {

	public static void main(String[] args) {
		
		// 조건문 - if, switch
		// 반복문 - for, while
		
//		String num = "100";		
		int no = 10;		
		String name = "홍길동";		
		int num = 100;		
		String a = String.format("번호:%d,이름:%s,국어:%d \n",no,name,num);		
		System.out.println(a);
//		String b = System.out.printf("%010d \n",num);
		
		
		
//		int num = 100;
//		System.out.printf("%10d \n",num); // 10칸 확보 후 오른쪽 정렬
//		System.out.printf("%010d \n",num); // 10칸 확보 후 오른쪽 정렬, 빈공백 0으로 채우기
		
		
		
//		int i = 10;
//		String name = "홍길동";
//		double avg = 99.6799999;
////		"번호:10, 이름:홍길동, 평균:99.67"
//		System.out.printf("번호:%d, 이름:%s, 평균:%.2f \n", i, name, avg); // %d:정수, %s:문자열, %.2f:실수 소수점2자리
		
		
		
//		int i=0;
//		int sum = 0;
//		while(true) {
//			if(sum>100) {
//				break;
//			}
//			sum += i;
//			i++;
//		}
//		System.out.println("i의 값 : "+(i-1));
//		System.out.printf("%d-1의 sum의 값 : %d \n",i,sum-i);
//		
//		System.out.println("i의 값 : "+i);
//		System.out.println("sum의 값 : "+sum);
		
		
		// 무한반복
//		for(;;) {
//			break;
//		}
		
		
		
//		int i=0;
//		// 반복문 이름 지정 가능
//		loop:while (true) {
//			while(i<10) {
//				if(i==0) {
//					break loop; // loop 라벨이 붙은 while문 종료	
//				}
//			}
//		}
//		
//		loop2:for(i=0;0<9;i++) {
//			
//		}

		
		//		int i=0;
//		while (true) {
//			while(i<10) {
//				if(i==0) {
//					break; // 가장 가까운 for문(반복문) 종료		
//				}
//			}
//		}
		
		
//		//XXX 불가능 XXX//
//		if(i==0) {
//			break; // if문에서 break 사용 불가
//		}
		
		
//		int i = 11;
//		do {
//			System.out.println("실행");
//			i++;
//			}while(i<10);
//		
//		while(i<10) {
//			System.out.println("실행");
//			i++;
//			break; // 반복문 탈출
//		}
		
		
		// 공통 부분
//		Scanner scanner = new Scanner(System.in);
		
		// Q. 1~100까지의 랜덤숫자를 생성해서
		// 10번 시도해서 맞추는 프로그램을 [while문 / for문] 으로 구현하시오.
		
		// <출력형태>
		// 1번째 시도입니다.
		// 번호를 입력했을때 -> 입력한 수보다 큰수입니다. / 입력한 수보다 작은수입니다.
		// 정답입니다.
		// 랜덤숫자 정답 : 7
		
//		int ran_num = (int)(Math.random()*100)+1; // 1~100 랜덤숫자 생성
//		
////		for (int i = 1; i <= 10; i++) {
////			System.out.printf("%d 번째 시도입니다.\n", i);
//		
//		for(int i=0;i<10;i++) { // 10번 시도 - 반복문
//			System.out.println("숫자를 맞춰보세요. 숫자입력 >> ");
//			int input = scanner.nextInt(); // 입력
//			if(input<ran_num) {
//				System.out.println("입력한 수보다 큰수입니다.");
//			}else if(input>ran_num) {
//				System.out.println("입력한 수보다 작은수입니다.");
//			}else {
//				System.out.println("정답입니다.");
//				break;
//			}
//			i++;
//		}
		
		
//		int i=0;
//		while(i<10) {
//			System.out.println("숫자를 맞춰보세요. 숫자입력 >> ");
//			int input = scanner.nextInt(); // 입력
//			if(input<ran_num) {
//			System.out.println("입력한 수보다 큰수입니다.");
//			}else if(input>ran_num) {
//				System.out.println("입력한 수보다 작은수입니다.");
//			}else {
//				System.out.println("정답입니다.");
//				break;
//			}
//			i++;
//		}
		
		
		
		
//		// Q. 입력을 2개 받아 구구단 출력
//		// 3,7 -> 3단에서 7단까지 출력
//		// for문
//		System.out.println("숫자1을 입력하세요.>> ");
//		int input1 = scanner.nextInt();
//		System.out.println("숫자2를 입력하세요.>> ");
//		int input2 = scanner.nextInt();
//		int num1 = (input1<input2?input1:input2);
//		int num2 = (input1>input2?input1:input2);
////		int num1 = Math.min(input1, input2); // 둘중에 작은 수
////		int num2 = Math.max(input1, input2); // 둘중에 큰 수
//		
//		for(int i=num1;i<=num2;i++) {
//			System.out.printf("[ %d 단 ]\n",i);
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d x %d = %d \n",i,j,(i*j));
//				// \t : 옆으로 출력  \\ \n : 아래로 출력
//			}
//			System.out.println();
//		}
		
		
		
//		// 0~9까지 출력
//		int i=0; //초기값
//		while(i<=9) { //조건식
//			System.out.printf("%d\n",i);
//			i++; //증감식
//		}
		
		
//		// 000 ~ 999까지 출력
//		// while문
//		int i=0; //초기값
//		while(i<=9) {
//			int j=0;
//			while(j<=9) {
//				int k=0;
//				while(k<=9) {
//				System.out.printf("%d%d%d\n",i,j,k);
//				k++; // 증감식
//			}
//			j++; // 증감식
//		}
//		i++; // 증감식
//	}
		
		
		
//		// 000 ~ 999까지 출력
//		for(int i=0;i<=9;i++) {
//			for (int j=0; j<=9; j++) {
//				for(int k=0;k<=9;k++) {
//				System.out.printf("%d%d%d\n",i,j,k);
//				}
//			}
//		}
		
		
//		for(int i=0;i<2;i++) {
//			System.out.println("이름을 입력하세요.>> ");
//			String name = scanner.next();
//			System.out.println("국어점수를 입력하세요.>> ");
//			int kor = scanner.nextInt();
//			System.out.printf("%s\t%d\n",name,kor);
//		}
		

		

//		// Q. 2단부터 한 문단씩 출력   
//		// i : 행(줄) 결정
//		for(int i=2;i<=9;i++) {
//			System.out.printf("[ %d 단 ]\t",i);
//		}
//		System.out.println(); //enter키
//		for(int i=1;i<=9;i++) {       // 세로 줄
//			for(int j=1;j<=9;j++) {   // 가로 줄
//				System.out.printf("%d x %d = %d\t",j,i,(i*j));
//				// \t : 옆으로 출력  \\ \n : 아래로 출력
//			}
//			System.out.println();
//		}
		
		
		
		
//		// Q. 구구단은 출력하는데 2,4,6,8단 짝수단만 출력하시오.
//		for(int i=2;i<=9;i++) {
//			if(i%2!=0) continue; 
//			System.out.printf("[ %d 단 ]\n",i);
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d x %d = %d \t",i,j,(i*j));
//				// \t : 옆으로 출력  \\ \n : 아래로 출력
//			}
//			System.out.println();
//		}
		
		
		
//		// 정첩for문
//		// 구구단 출력
//		for(int i=2;i<=9;i++) {
//			System.out.printf("[ %d 단 ]\n",i);
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d x %d = %d \t",i,j,(i*j));
//				// \t : 옆으로 출력  \\ \n : 아래로 출력
//			}
//			System.out.println();
//		}

	}

}
