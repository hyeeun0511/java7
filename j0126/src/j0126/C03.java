package j0126;

import java.util.Scanner;

public class C03 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Stuscore[] s = new Stuscore[10];
		// 배열선언
		System.out.println("학생이름을 입력하세요.>> ");
		String name = scanner.next();
		System.out.println("국어점수를 입력하세요.>> ");
		int kor = scanner.nextInt();
		System.out.println("영어점수를 입력하세요.>> ");
		int eng = scanner.nextInt();
		System.out.println("수학점수를 입력하세요.>> ");
		int math = scanner.nextInt();
		// 배열에 객체저장
		s[0] = new Stuscore(name,kor,eng,math);
		System.out.println("학생이 저장되었습니다.");     
		// 배열에 저장된 객체 출력
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		
		
		
		
//		Stuscore[] s = new Stuscore[10];
//		s[0] = new Stuscore("홍길동",100,100,90);
//		s[1] = new Stuscore("유관순",90,90,95);
//		s[2] = new Stuscore("이순신",80,80,81);
				
		
//		Stuscore s1 = new Stuscore();
//		Stuscore s2 = new Stuscore();
//		s1.no = 1;
//		s1.name = "홍길동";
//		s1.kor = 100;
//		s1.eng = 100;
//		s1.math = 90;
//		s1.total = 100+100+00;
//		s1.avg = s1.total/3.0;
//		System.out.println(s1.no+","+s1.name);
//		Stuscore s2 = new Stuscore("유관순","100"90) 
}

}
