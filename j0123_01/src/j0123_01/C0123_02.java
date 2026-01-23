package j0123_01;

public abstract class C0123_02 {

	public static void main(String[] args) {
		// 객체사용목적 - 여러개 값을 저장
		// 배열사용목적 - 각각 여러개 값을 저장 
		
		// 인스턴스면수
		int[] a = {1,2,3}; // 2-> {1,4,3} 으로 바꿔도 b는 변하지 않음
		int[] b = {1,2,3};
		
		
		
		// 클래스명.변수명 (클래스변수)
		Card.width = 200;
		Card.height = 300;
		System.out.println(Card.width);
		
//		Card.kind = "SPADE"; // 불가능
		Card c1 = new Card();
		c1.kind = "SPADE";
		c1.number = 10;
//		c1.width = 500; // 가능하지만 권장하지 않음 // 클래스명.변수명 으로 사용 권장 // Card.width=500;
		// 클래스명 : Card 대문자로 !! (헷갈리지않도록)
		System.out.println(c1.kind);
		System.out.println(c1.number);
        System.out.println(Card.width); // Card.width=200으로 변경됨
        Card c2 = new Card();
        
	}

}
