package j0126_02;

public class C01 {

	public static void main(String[] args) {
		// 52장의 카드를 생성해서
		// 숫자 : 1~13
		// 모양 : SPADE, HEART, DIAMOND, CLOVER
		//==============================================
		Deck d = new Deck(); // Deck 객체선언
		d.card5Print(); // 5장 뽑기
		d.card5Print(5); // 5번부터 5장 뽑기(이어서 5장뽑기)
		
		System.out.println("=========================");
		System.out.println("[카드 랜덤 출력]");
		// [Deck.java]
		// Deck.java에 카드 섞기 메서드 생성 후 호출
		// d2.shuffle(); // 카드 섞기
		// [C01.java]
		// 카드 5장 랜덤 출력
		d.shuffle(); // 카드 섞기
		d.card5Random(); // 카드 5장 랜덤 출력
		

		
		
		//==============================================
//		d.card5Print(10); // 10번부터 5장 뽑기(이어서 5장뽑기)
		
//		// 0-4번까지 5장의 카드를 출력하세요.
//		// 1) 객체선언
//		Card[] c = new Card[52]; // 카드 총 52장
//		// 2) 카드 모양
//		String[] shape = {"SPADE", "HEART", "DIAMOND", "CLOVER"};
//		// 3) Deck 객체선언
//		for (int i = 0; i < c.length; i++) {
//			c[i] = new Card();
//			c[i].number = (i % 13) + 1; // 1~13 반복
//			c[i].kind = shape[i / 13]; // 0~12 SPADE, 13~25 HEART, ...
//		}
//		// 4) 출력
//		// 0~4번까지 5장 카드 출력
//		for (int i = 0; i < 5; i++) {
//			System.out.println(c[i].kind + "," + c[i].number);
//		}
	}

}
