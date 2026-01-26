package j0126;

public class C05 {

	public static void main(String[] args) {
		Deck d = new Deck(); // 객체선언 -> 카드 52장이 만들어짐
		// 10번째 카드 뽑기
		Card c = d.pick(1); // 10번째에 있는 카드 // 1-52 , 55 =? 에러
		System.out.println(c.kind+","+c.number);
		
		// 렌덤카드 1장 뽑기
		Card c2 = d.pick(); // 10번째에 있는 카드 // 1-52 , 55 =? 에러
		System.out.println(c2.kind+","+c2.number);
		// 카드 5장 뽑기
		Card[] cArr = d.pick5();
		for (int i = 0; i < cArr.length; i++) {
			System.out.println(cArr[i].kind + "," + cArr[i].number);
		}
		
		d.shuffle();
		
		cArr=d.pick5();
		for (int i = 0; i < cArr.length; i++) {
			System.out.println(cArr[i].kind + "," + cArr[i].number);
		}
		
		System.out.println("---------------------------");
		Card c3 = d.pick(1); // 10번째에 있는 카드 // 1-52 , 55 =? 에러
		System.out.println(c.kind+","+c.number);
		
		//-----------------------------------------------------
//		for (int i = 0; i < d.c.length; i++) {
//			System.out.println(d.c[i].number+","+d.c[i].kind);
//		}
//		Deck d2 = new Deck(); // 카드 그룹이 계속 만들어짐
//		Deck d3 = new Deck();
		//-----------------------------------------------------
		
		
//================================================================
//		Card[] c = new Card[52];
//		c[0] = new Card();
//		c[0].kind = "SPADE";
//		c[0].number = 1;
//		c[1].kind = "SPADE";
//		c[1].number = 2;
//		c[2].kind = "SPADE";
//		c[2].number = 3; 
//		// ...
//		c[13].kind = "HEART";
//		c[13].number = 1;
//		c[14].kind = "HEART";
//		c[14].number = 2;
//		// ...
//		// 계속해서 52장까지 번호를 넣음 => 자동화

	}

}
