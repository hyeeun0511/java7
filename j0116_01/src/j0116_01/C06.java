package j0116_01;

import java.util.Scanner;

public class C06 {

	public static void main(String[] args) {
		// Scanner
		// 타입 크기 순서 : byte<short,char<int<long<float<double<String
		
		int a = 5;
		int b = 0;
		++a;  // a값 1증가
		b = a;  // b에 a값을 대입
	    System.out.println("a: "+a);  // 6
		System.out.println("b: "+b);  // 5
		
		
		
		
		// 이름,국어,영어 -> 이름,합계,평균을 출력하시오.
		
		//3개의 숫자를 입력받아, 가장큰수를 출력하시오.
		// 삼항연산자를 2번쓰면 됩니다.
		// 예시.
		// (a>b)?( (a>c)?a:c ):( );  // 비교
		// (a>c)?a:c
		// 최대값 - 삼항식
		// 최소값 - 삼항식
		// (a+b+c) - (최대값) - (최소값) = 중간값
		// 최대값,중간값,최소값  > 큰 순서대로 정렬
//		int a = 5;
//		int b = 10;
//		int c = 7;
//		int result1 = (a>b)?( (a>c)?a:c ):( (b>c)?b:c );  // 최대값
//		int result2 = (a<b)?( (a<c)?a:c ):( (b<c)?b:c );  // 최소값
//		int result3 = (a+b+c) - result1 - result2;  // 중간값
//		System.out.println("최대값 : "+result1);
//		System.out.printf("숫자높은순 : %d,%d,%d \n",result1,result3,result2);
		
 		
		// 최대값 - Math.max()
//		Scanner scanner = new Scanner(System.in);  // 필수
//		// int result = Math.max(5, 10);  // 두수 중 최대값
//		int result = Math.max(5, Math.max(10, 7)); // 세수 중 최대값  // Math.max(5,10,7) 불가능
//		System.out.println("가장큰수 : "+result);
		
		
//		System.out.println("세개의 숫자를 입력하세요.>> ");
//		int a = scanner.nextInt();
//		int b = scanner.nextInt();
//		int c = scanner.nextInt();
//		int result = (a>b)?( (a>c)?a:c ):( (b>c)?b:c );  // 비교  // if문과 같음
//		System.out.println("가장큰수 : "+result);
		
		
//		// 대입연산자
//		int a = 10;
//		int b = 3;
//		
//		// 삼항연산자
//		System.out.println("숫자를 입력하세요.>> ");
//		a = scanner.nextInt();
//		String result = (a>0)?"0보다 큰수입니다.":"0보다 작은수입니다.";
//	    System.out.println(result);
		
		
//		a = -5;
//		int result = (a>=0)?a:-a;  // 조건식 / a->0이상일때 : a , a->0미만일때 : -a
//		System.out.println("절대값 : "+result);
		
		
//		System.out.println("두수를 입력하세요.>> ");
//		a = scanner.nextInt();
//		b = scanner.nextInt();
//		int result = (a>b)?a:b;  // 조건식 / 참일때값:a , 거짓일때값:b
//		System.out.println("더 큰수 : "+result);
		
		// 논리연산자 (a>5)&&(b<5), (a>11)||(b<5)
		
		
		// 비교연산자
//		System.out.println(a>b);  // true
//		System.out.println(a<b);  // false
//		System.out.println(a==b); // false
//		System.out.println(a!=b); // true
//		// System.out.println(a<>b); // 오류
		
		// 산술연산자
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println(a*b);
//		System.out.println(a/b);  // / : 나누기 연산자
//		System.out.println(a%b);  // % : 나머지 연산자
		
		
		
//		Scanner scanner = new Scanner(System.in); //Scanner 객체생성
//		System.out.println("이름을 입력하세요.>>");   
//		String name = scanner.nextLine();         // 문자열 입력받기
//		System.out.println("국어점수를 입력하세요.>>");
//		int kor = scanner.nextInt();              // 정수 입력받기
//		System.out.println("영어점수를 입력하세요.>>");
//		int eng = scanner.nextInt();      
//		int total = kor + eng;      
//		double avg = total / 2.0; 
//		System.out.printf("이름:%s,합계:%d,평균:%f", name, total, avg); 
	
		
		
//		int a = 10;
//		int b = 3;
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println(a*b);
//		System.out.println(a/b);  // 3.33333 -> 3  정수타입/정수타입 = 정수타입 (소수점 이하 버림)
//		System.out.println(a/(double)b);  // 3.33333
//		
//		boolean bol = true;
//		System.out.println(!bol);  // ! : 논리부정연산자
		
		
//		System.out.println(2.0*100);
//		int a = 10;
//		a += 1;  // a= a+1
//		a++;     // 증감연산자 : a=a+1
//		a--;     // a = a-1
//		System.out.println(a);

	}

}
