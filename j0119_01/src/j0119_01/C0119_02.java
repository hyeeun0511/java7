package j0119_01;

import java.util.Scanner;

public class C0119_02 {

	public static void main(String[] args) {
		// 변수 - boolean,char,byte,short,int,long,float,double,String
		// 실수 : float(4byte), double(8byte)
		// 정수 : byte(1byte), short(2byte), int(4byte), long(8byte)
		// Scanner -> (String)을 받을수 있는 것 : next(), nextLine()
		// nextBoolean(),nextInt()-소수점 블가능,nextLong()-소수점 불가능,nextDouble()-소수점 가능,nextFloat()-소수점 가능
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("이름을 입력하세요.>> ");
//		String name = scanner.nextLine(); // 사이띄움 가능 // 홍 길동 -> 홍 길동
//		System.out.println("이름 : "+name);
//		
		System.out.println("이름을 입력하세요.>> ");
		String name = scanner.next(); // 사이띄움 안됨, enter키 입력없음. // 홍 길동 -> 홍
		System.out.println("이름 : "+name);
		
		// Q 코드 실행
//		System.out.println("안녕"+5.8); 
//		System.out.print(3+5+"방가"+4+2+"\n"); // \n : 줄바꿈
//		System.out.printf("%s:%d","홍길동",15);
		// println : 출력 + 줄바꿈
		
		// Q. 이름과 실수를 입력해서, 실수소수점 3자리까지 입력해서, 소수점 첫째자리까지 출력하시오.
		// 1) 입력받기
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("이름을 입력하세요 : ");
//		String name = scanner.next();  // 문자열 입력
//		System.out.print("실수를 입력하세요 : ");
//		double num = scanner.nextDouble(); // 실수 입력
//		// 2) 출력하기 : 소수점 3자리, 1자리까지 출력
//		// printf() 함수를 사용해서 출력
//		System.out.printf("이름:%s, 숫자:%.1f",name,num);
		
		
		
		
		
		
		
//		int a = 10;
//		int b = 3;
//		System.out.println(a/b); // 3 -> int/int = int(정수형) // 소수점 이하 버림(실수형 불가)ㄴ
//		System.out.println((double)a/b); // 3.3333333333333335 -> double/int = double(실수형)
//		// printf : 소수점 자리수 출력 가능, 공백크기 지정가능, 공백 0표시(0채우기) 가능
//	    System.out.printf("%.2f",(a/(double)b)); // 3.33 -> 소수점 둘째자리까지 출력
//	    %d : 정수
//	    %f : 실수
//	    %s : 문자열

	}

}
