package j1028_02;

import java.util.ArrayList;

public class Buyer {
	String id;
	String pw;
	String userName;
	int money;
	int bonusPoint;
	ArrayList list = new ArrayList();
	// ArrayList : 제네릭(Generic) 기법이 적용된 클래스
	
	Buyer(){
		id = "aaa";
		pw = "1111";
		userName = "홍길동";
		money = 10_000_000;
 		bonusPoint = 0;
	}
	
	// 1) Tv
	void buy(Tv t) {
		money=money - t.price;
		bonusPoint += t.bonusPoint;
		list.add(t);
	}
	// 2) NoteBook
	void buy(NoteBook t) {
		money = money - t.price;
		bonusPoint += t.bonusPoint;
		list.add(t);
	}
	// 2) Audio
	// 2) Refrigerator
	// 2) Product
	

}
