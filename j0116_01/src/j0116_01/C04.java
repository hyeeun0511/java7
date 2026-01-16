package j0116_01;

import java.util.Scanner;  // Scanner는 import를 해야함

public class C04 {

	public static void main(String[] args) {
		System.out.println(1.2345678);
		//System.out.println(10/(double)3);  // = 10/3.0  // 3.3333333333333335 : 5는 랜덤으로 나온 숫자
		//System.out.println(10/3);  // = 10/3  // 3
		System.out.println((double)10/3);  // 10.0/3  // 10을 더블로 바꿈  // 3.3333333333333335
		
		// printf -> %
		// d-정수, f-실수
		// System.out.printf("%.2f", 10/(double)3);  // 출력할 소수점 자리수 정할수 있음   // 3.33
		System.out.printf("%010d, %.2f",123, 10/(double)3);  // 출력할 소수점 자리수 정할수 있음  // 0000000123, 3.33
		
		// 출력
		System.out.println();
		
		// 입력 - System : console에서 입력을 받겠다.
		Scanner scanner = new Scanner(System.in);  // import 필수
		// System.out.println("숫자를 입력하세요.>> ");  // 밑으로 출력
		System.out.print("숫자를 입력하세요.>> ");  // 옆으로 출력
		int num = scanner.nextInt();  // 정수형타입 값을 받음
		System.out.println("입력숫자 : "+num);
		
		// input("숫자를 입력하세요.")
		

	}

}
