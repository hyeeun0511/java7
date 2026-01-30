package j0130;

import java.util.Scanner;

public class C05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 특정한 값만 입력을 받고자 할때 enum형태를 사용함
		Gender g = Gender.남성;
//		Gender g2 = "남자";
		System.out.println(g);
		
		Person p = new Person();
		p.g = Gender.남성; // g="남성";  실제 g에 남성이라고 입력됨
		
		
		
		// ex) 요일 - 월,월요일,mon,monday 다양 > '월'하나로 스타일 통일시킴
//		Day today = Day.SAT;
		// Day의 객체만 넣을 수 있음 > MON,TUE,WED,THU,FRI,SAT,SUN
//		System.out.println(today);
		
//		while(true) {
//			System.out.println("요일을 입력하세요.>> ");
//			String day = scan.next();
//			System.out.println("요일 : "+day);
//		}
		
		
	}

}
