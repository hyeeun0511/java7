package j0126_03;

public class C01 {

	public static void main(String[] args) {
		// 1.카드클래스 정의
		// 1) 카드 52장 배열선언
		Card[] c = new Card[52];
		// 2) 카드 모양 4개 배열선언
		String[] shape = {"SPADE", "HEART", "DIAMOND", "CLOVER"};
		// Deck클래스 정의
		// 메인에서 Deck객체 선언후
		Deck d = new Deck(); 
		// 3) 카드 52장 생성 - Deck클래스에서 처리
		// 5개 카드 출력
		d.card5Print(); // Deck.java에 메서드 생성 & 호출
		// 섞기
		d.cardshuffle(); // Deck.java에 메서드 생성 & 호출
		// 5개 카드 출력
		// d.card5Print(); // -> 카드출력 2번 (순차적)
//		d.card5Random(); // Deck.java에 메서드 생성 & 호출
		d.card5Random(); // Deck.java에 메서드 생성 & 호출
		

	}

}
