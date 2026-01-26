package j0126_02;

public class Deck {
	Card[] c = new Card[52];
	String[] shape = {"SPADE", "HEART", "DIAMOND", "CLOVER"};
	
	// 1) 객체선언
	Deck(){
		for (int i = 0; i < c.length; i++) {
			c[i] = new Card();
			c[i].number = (i % 13) + 1; // 1~13 반복
			c[i].kind = shape[i / 13]; // 0~12 SPADE, 13~25 HEART, ...
		}
	}
	
	// 5장 뽑기 
	void card5Print() {
		for (int i = 0; i < 5; i++) {
			System.out.println(c[i].kind + "," + c[i].number);
		}
	}
	// 지정한 번호부터 5장 뽑기
	void card5Print(int index) {
		for (int i = index; i < index + 5; i++) {
			System.out.println(c[i].kind + "," + c[i].number);
		}
	}
	// 카드 섞어서 랜덤 뽑기 ========================================
	// 카드섞기 메서드 생성 & 섞기
	void shuffle() {
		for (int i=0; i<c.length; i++) {
			int r = (int)(Math.random()*c.length);
		} // r: random  // c.length : 카드 개수 - 52장
	}
	// 카드 5장 랜덤
	void card5Random() {
		for (int i=0; i<5; i++) {
			int r = (int)(Math.random() * c.length);
			System.out.println(c[r].kind+","+c[r].number);
		}
	}
	
}
