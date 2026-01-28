package j0127;

import java.util.*; // import java.util.Date;

public class C01 extends Object {
	
	public static void main(String[] args) {
		Deck d = new Deck(); // 카드한묶음 // Deck 클래스의 객체 생성 
//		d.pick(39);
//		d.pick(50);
//		d.pick(2);
//		d.pick(1);
//		d.pick(0);
//		d.c[1].number = 1; // 카드 1장의 숫자를 1으로 변경
//		d.c[2].number = 1; // 카드 1장의 숫자를 1으로 변경
//		d.c[3].number = 1; // 카드 1장의 숫자를 1으로 변경
//		d.c[4].number = 1; // 카드 1장의 숫자를 1으로 변경
		d.cardAllPrint(); // 카드 52장 출력 - 문자 // 순차출력
		d.shuffle(); // 카드 섞기
		System.out.println("---------------------");
		d.cardAllPrint(); // 카드 52장 랜덤으로 섞은 후 출력 - 문자
//		d.card5Print(); // 카드 5장 출력
		
		Login l = new Login(); // Login 클래스의 객체 생성
		System.out.println(l.pw);
		
		System.out.println(d.c[0].number);
		
		
		
		// 카드 52장 출력 - 숫자
//		d.cardAllPrint(); // Deck.java와 연결 -> cardAllPrint() 메서드 호출
		
//		Card[] c = new Card[52];
//		c[0] = new Card();
//		c[0].kind = "SPADE";
//		c[0].number = 1;
//		c[1] = new Card();
//		c[1].kind = "SPADE";
//		c[1].number = 2;
//		// 생성자 만들어서 간단하게 만들기 - Card.java로 이동
//		c[0] = new Card("SPADE",1);
//		c[1] = new Card("SPADE",2);
//		c[2] = new Card("SPADE",3);
//		c[3] = new Card("SPADE",4);
//		c[4] = new Card("SPADE",5);
//		c[5] = new Card("SPADE",6);
//		c[6] = new Card("SPADE",7);
		
		
		
//	Circle c1 = new Circle(); // Circle() : 기본생성자
//	System.out.println(c1.color); // Shape로부터 상속받은 변수

//		Scanner scanner = new Scanner(System.in);
//		Date today = new Date();
//		System.out.println(today);
	}

}
