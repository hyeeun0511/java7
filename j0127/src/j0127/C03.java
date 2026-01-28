package j0127;

import java.util.Calendar;
import java.util.Date;

public class C03 {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance(); // 객체 1개 생성
		System.out.println(s1.getNum());

		Singleton s2 = Singleton.getInstance(); // 객체 1개 생성
		s2.setNum(100);
		System.out.println(s2.getNum());
		System.out.println(s1.getNum());
		
//		Singleton s1 = new Singleton(); // Singleton에서 private Singleton(){} 작성시 > 작성 불가 - 에러
//	    s1.setNum(100);
//	    System.out.println(s1.getNum());
				
		
		
//		Date d = new Date();
//		System.out.println(d);
//		Date d2 = new Date();
//		System.out.println(d2);
//		
////		Calendar c = new Calendar();
//		// 싱글톤 패턴 : 객체가 무조건 1개만 만들어지도록 하는 디자인 패턴
//		Calendar c = Calendar.getInstance();
//		Calendar c2 = Calendar.getInstance();
//		System.out.println(c);
//		System.out.println(c2);
	}

}




//==============================================
// d,d2 날짜는 따로 관리됨