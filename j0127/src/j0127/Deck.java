package j0127;

public class Deck {
	Card[] c = new Card[52]; // 카드 52장 저장할 배열 선언
	String[] shape = {"SPADE","HEART","DIAMOND","CLOVER"}; // String[] : 문자열 배열 선언
	
	Deck(){
		super(); // Object의 기본생성자 호출
		for(int i=0;i<c.length;i++) {
			c[i] = new Card(shape[i/13],(i%13)+1); // 카드 객체 생성
//			c[i].number = (i%13)+1; // 카드번호 // i=0->1, i=12->13, i=13->1
//			c[i].kind = shape[i/13]; // 카드모양 // i=0~12->0, i=13~25->1
		}
	}
	// 카드 섞기
	void shuffle() {
		Card temp;
		for(int i=0;i<1000;i++) {
			int no = (int)(Math.random()*52);
			temp = c[0];
			c[0] = c[no];
			c[no] = temp;
		}
	}
	// 카드전체출력
	void cardAllPrint() {
		for (int i=0; i<c.length; i++) {
			System.out.println(c[i]); // number->[c[i].number]
		}
	}
	// 카드5장출력
	void card5Print() {
		for (int i=0; i<5; i++) {
			System.out.println(c[i].number+","+c[i].kind);
		}
	}
	// 카드한장출력
	void pick() {
		int random = (int)(Math.random()*52); // 0~51
		System.out.println(c[random].number+","+c[random].kind);
	}
	// 원하는 카드한장출력 - 오버로딩 : 메서드 이름은 같지만 매개변수가 다름 /pick()과 비교
	void pick(int index) {
		index = index%52; // 0~51
		System.out.println(c[index].number+","+c[index].kind);
	}
}
