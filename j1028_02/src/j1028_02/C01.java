package j1028_02;

public class C01 {

	public static void main(String[] args) {
		// 1) Buyer 객체선언
		Buyer b = new Buyer();
		System.out.println(b.userName+"님 환영합니다.");
		// 2) 제품구매
		b.buy(new Tv());
		b.buy(new NoteBook());
	
		System.out.println("보유금액 : "+b.money+"원");
		System.out.println("보너스포인트 : "+b.bonusPoint+"p");

	}

}
