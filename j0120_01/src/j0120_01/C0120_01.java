package j0120_01;

import java.util.Scanner;

public class C0120_01 {

	public static void main(String[] args) {
		
		// boolean,char,byte,short,int,long,float,double
		// 등가비교 == 비교가능
//		int a = 10;
//		if(a==10) {
//			System.out.println("맞습니다.");
//		}else {
//			System.out.println("틀립니다.");
//		}
		// String타입은 등가비교가 안됨. ==(X)
		// 객체타입 -> .equals()라고 써야함
		String str1 = "10";
		String str2 = "100";
		String str3 = new String("10");
		String str4 = "10";
		// 처음 선언시 같은 값을 작성할때 -> 같은 곳을 봄
		
		System.out.printf("%s,%s,%s \n",str1,str2,str3);
		if(str1==str4) { // 10==100
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		} // 다릅니다.
		if(str1==str3) { // 10==10
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		} // 다릅니다.
		if(str1.equals(str3)) { // 10==10  // 등가비교(==)가 아닌 equals로 해야함
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		} // 같습니다.
		
		
		
//		String str1 = "['게임','골프','수영','조깅','독서']";
//		String str2 = "['수영','조깅','독서']";
//		String str3 = "['게임','골프','독서']";
//		String str4 = "['게임','수영','조깅','독서']";
//		String str5 = "['게임','골프','독서']";
//		
//		// 수영이 포함되어있습니다. 수영이 없습니다. 출력하시오.
//		
//		// str1 수영이 포함되어 있나요?
//		if(str1.contains("수영")) {
//			System.out.println("수영이 있습니다.");
//		}else {
//			System.out.println("수영이 없습니다.");
//		}
//		// str2 수영이 포함되어 있나요?
//		if(str2.contains("수영")) System.out.println("수영이 있습니다.");
//		else System.out.println("수영이 없습니다.");
//		// str3 수영이 포함되어 있나요?
//		if(str3.contains("수영")) System.out.println("수영이 있습니다.");
//		else System.out.println("수영이 없습니다.");
//		// str4 수영이 포함되어 있나요?
//		if(str4.contains("수영")) System.out.println("수영이 있습니다.");
//		else System.out.println("수영이 없습니다.");
//		// str5 수영이 포함되어 있나요?
//		if(str5.contains("수영")) System.out.println("수영이 있습니다.");
//		else System.out.println("수영이 없습니다.");
		
		
		
//		// 0) 공통 부분
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.>> ");
//		String str = scanner.next();
//		System.out.println("찾고자 하는 번호를 입력하세요.>> ");
//		String input = scanner.next();
//		// contains:포함되어 있는지 확인 , indexOf:포함되어 있는지 확인+위치값도 알려줌
//		
//		// 1) indexOf : 포함되어있는지 + 위치값
//		int startNo = 0;
//		int count = 0;
//		String s_print = "";
//		// 2) for문
//		for(;;) {
//			int temp = str.indexOf(input,startNo);
//			if(temp==-1) break;
//			// 3을 찾았을 경우
//			count++;
//			s_print += temp+" ";
//			startNo = temp+1;
//		}
//		// 3) 출력
//		System.out.printf("%s의 위치 : %s\n", input,s_print);
//		System.out.printf("%s 포함 개수 : %d\n", input,count); 
		
		
		
		
		// 1) contains : 포함되어있는지 확인
//		if(str.contains("3")==true) {  // 3이 있는지 없는지 알려달라는 것  // contains :: boolean:True/False
//			System.out.println("3이 포함되어 있습니다.");
//		}else {
//			System.out.println("3이 포함되어 있지 않습니다.");
//		}
		
		
//		// Q. 7이 몇번 입력되었는지 개수를 출력하세요.
//		// count  // 개수 : if
//		// 1) 숫자 입력
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.>> ");
//		String str = scanner.next();
//		//  2) 숫자 출력  (s_print : 나열)
//		String s_print = "";
//		int count = 0;
//		for(int i=0;i<str.length();i++) {
//			int no = str.charAt(i)-'0';
//			if(no==7) {
//				count++;
//				if(count==1) s_print = i+"";
//				else s_print += (","+i);  
//			}
//		}
//		System.out.println("입력된 숫자길이 : "+str.length());
//		System.out.println("7번 위치 : "+s_print);
//		System.out.println("7번 개수 : "+count);
		
		
		
//		// Q. 입력받은 숫자들의 합을 구하시오.
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.>> ");
//		String str = scanner.next();
//		// (char)(2+'0') 
//		// '2'-'0'
//		int sum = 0;
//		String s_print = "";
//		for(int i=0;i<str.length();i++) {
//			int no = str.charAt(i)-'0';
//			sum += no;
//			if(i==0) s_print = no+""; // 처음 돌때만 ,(쉼표)넣고 그 뒤에는 넣지말라는 의미
//			else s_print += (","+no);  // 1,4,5,9,
//		}
//		System.out.println("출력 : "+s_print);
//		System.out.println("결과값 : "+sum);
		
		
//		// 34.1592
//		// 소수점 3자리에서 반올림
//		double num = 34.1592;
//		double num2 = Math.round(num*100)/100.0;  // 앞부분이 정수타임(round:long(정수)타입) -> 100.0으로해야 소수점이 나옴
//		// 34.1592  -*100-  3415.92  -round-  3415.9  -/100-  34.159
//		System.out.println(num2);
		
		
		
//		// 소수점 반올림:round, 올림:ceil, 버림:floor
//		System.out.println(Math.round(34.95));  // 정수
//		System.out.println(Math.ceil(34.95));   // 실수 (소수점)
//		System.out.println(Math.floor(34.95));  // 실수 (소수점)
		
		

		// Math.random() 0*10=0<= int(Math.random()*10 < 1*10
		
		// 1~3까지 랜덤숫자를 입력하는데, 중복이 없도록 숫자를 입력하세요.
//		int no1 = 0;
//		int no2 = 0;
//		int no3 = 0;
//		
//		// for문 사용해서 무한으로 돌리기
//		// 1) no1 뽑기
//		no1 = (int)(Math.random()*3)+1; // +1 : 1부터  // *3 : 3까지
//		// 2) no2 뽑기
//		for(;;) {
//			no2 = (int)(Math.random()*3)+1;
//			if(no1!=no2) 
//				break;
//		}
//		// 3) no3 뽑기
//		for(;;) {
//			no3 = (int)(Math.random()*3)+1;
//			if(no3!=no1 && no3!=no2) 
//				break;
//		}
//		
//		System.out.println("no1 : "+no1); 
//		System.out.println("no2 : "+no2); 
//		System.out.println("no3 : "+no3); 
		
		// for문에 if문 넣기
		
		
		
		
//		// 문자숫자타입을 수자타입으로 변경
//		int no = '2'-'0';
//		System.out.println(no); //int숫자로 취환 //숫자 2로 변함
//		
//		// 숫자를 문자로 치환
//		char ch = (char)(2 + '0'); //2+48=50
//		
//		// Stringx타입 -> chrar타입 변경
//		String str = "123";
//		char str2 = str.charAt(0);  // 문자1개 가져옴
//		// 숫자타입 -> 문자열타입 변경
//		String str3 = 234+"";
//		// 문자열 타입 -> int타입 변경
//		String str4 = "20";
//		int num = Integer.pardeOnt(str4);  //int타입 변겯
//		String str5 = "10";
//			int NUM2 = integer.PATRiNT(str5);
//		System.out.println(str4+str5);
		
		
		
		
//		Scanner scanner = new Scanner(System.in);  // 입력받기위해 Scanner 객체 생성
//		System.out.println(" [학생성적프로그램] ");
//		System.out.println("1. 학생성적입력");
//		System.out.println("2. 학생성적출력");
//		System.out.println("3. 학생성적수정");
//		int choice = scanner.nextInt();
//		
//		// 1) if문
//		if(choice==1) {
//			System.out.println("학생성적입력입니다.");
//		}else if(choice==2) {
//			System.out.println("학생성적출력입니다.");
//		}else {
//			System.out.println("학생성적수정입니다.");
//		}
		
		// 2) switch문
//		switch(choice) {
//		case 1:
//			System.out.println("[학생성적입력]");
//			break;
//		case 2:
//			System.out.println("[학생성적출력]");
//			break;
//		case 3:
//			System.out.println("[학생성적수정]");
//			break;
//		default:
//			break;
//		}

	}

}
