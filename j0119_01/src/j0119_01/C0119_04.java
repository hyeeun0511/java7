package j0119_01;

import java.util.Scanner;

public class C0119_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  // 숫자 입력받기위한 객체  // 공통 부분

		// 이름,국어,영어,수학 입력받아 이름(str),국어(int),영어(int),수학(int),합계(int),평균(double)을 출력하시오.
		// 출력 형태 => 홍길동,100,100,99,299,99.33(소수점 2자리)
		
		// 1. 이름
		System.out.println("이름을 입력하세요.>> "); // 이름 입력받기
		String name = scanner.next(); // 이름 출력
		System.out.println("이름 : "+name);
		// 2. 국어
		System.out.println("국어점수를 입력하세요.>> "); // 국어점수 입력받기
		int kor = scanner.nextInt(); // 국어점수 출력
		System.out.println("국어점수 : "+kor);
		// 3. 영어
		System.out.println("영어점수를 입력하세요.>> "); // 영어점수 입력받기
		int eng = scanner.nextInt(); // 국어점수 출력
		System.out.println("영어점수 : "+eng);
		// 4. 수학
		System.out.println("수학점수를 입력하세요.>> "); // 수학점수 입력받기
		int math = scanner.nextInt(); // 수학점수 출력
		System.out.println("수학점수 : "+math);
		// 5. 합계,평균
		int total = kor+eng+math;
		double avg = total/3.0;
		// 6. 출력
		System.out.println("[ 학생 성적프로그램 ]");
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("-------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",name,kor,eng,math,total,avg);
		
		
		
		//		System.out.println("숫자를 입력하세요.>> ");
//		int input = scanner.nextInt(); // 숫자 입력받기
//		String result = ((input%2)==0)?"짝수":"홀수"; // 입력받은 숫자가 짝수인지 홀수인지 알아보는 삼항연산자
//        System.out.println(result); // 결과 출력
		
//		double a = 0.1;
//		float b = 0.1F;
//		
//		String result = (a==b)?"a와 b는 같다":"a와 b는 다르다";
//		System.out.println(result); // a와 b는 다르다
//		
//		System.out.println((double)b); // 0.10000000149011612
//		
//		float c = (float)a; // double -> float 형변환 // double 사용 선호
//		System.out.println(c);
		
//		int a = 10;
//		System.out.println(10*100/100); // 10
		
//		System.out.println("소수점이 있는 숫자를 입력하세요.>> ");
//		double input = scanner.nextDouble(); // 소수점이 있어서 double 타입으로 받아야함
//		// 소수점 3자리에서 반올림(round),올림(ceil),버림(floor)을 모두 해보시오. (소수점 2자리까지)
//		double result = Math.round(input*100)/100.0;  // 반올림
//		double result2 = Math.ceil(input*100)/100.0;  // 올림
//		double result3 = Math.floor(input*100)/100.0;  // 버림
//		System.out.printf("%.2f, %.2f, %.2f \n",result,result2,result3);
		
		// 소수점 2자리에서 반올림을 하시오. 34.195 -> 34.2
		// round 소수점 첫째자리에서 반올림 341.95 -> 342
//		double result = (int)(input*100)/100.0;  // 절사하는 방법
//		double result = Math.round(input*10)/10.0;
//		System.out.println(result);
		
		// 소수점첫째자리 - 반올림:round, 올림:ceil, 버림:floor
//		System.out.println(Math.round(3.592)); // Math : class / round : method
//		System.out.println(Math.ceil(5.12));
//		System.out.println(Math.floor(6.99));
		
		
		
		
		
//		// 숫자를 입력받아 소수점 2자리에서 절사해서 출력하시오.
//		// 3.141592 -> 3.14
//		// 405.7931 -> 405.79
//		System.out.println("숫자를 입력하세요.>> ");
//		double input = scanner.nextDouble();
//		// result = (int)(* 100) / 100
//	    double result = (int)(input*100)/100.0; // 100.0 -> double 타입으로 변환(소수점 이하 표현위해->.0 안할시 소수점 날아감)
//		System.out.println("결과값 : "+result);

	}

}
