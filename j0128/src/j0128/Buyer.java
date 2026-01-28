package j0128;

import java.util.ArrayList;

public class Buyer {
	String id;
	String pw;
	String userName;
	int money;
	int bonusPoint;
	ArrayList list = new ArrayList(); 
	
	Buyer(){ // default - 같은클래스,같은패키지
		id = "aaa";
		pw = "1111";
		userName = "홍길동";
		money = 10_000_000;
		bonusPoint = 0;
	}
	// 부모의 참조변수로 자손의 객체선언
	// Product p = Tv();
	// Product p = new NoteBook();
	void buy(Tv t) {
		money = money - t.price; // 구매금액만큼 보유금액을 빼줌
		bonusPoint += t.bonusPoint;
		list.add(t);
	}
	void buy(NoteBook t) {
		money = money - t.price; // 구매금액만큼 보유금액을 빼줌
		bonusPoint += t.bonusPoint;
		list.add(t);
	}
	void buy(Audio t) {
		money = money - t.price; // 구매금액만큼 보유금액을 빼줌
		bonusPoint += t.bonusPoint;
		list.add(t);
	}
	
	void buy(Refrigerator t) {
		money = money - t.price; // 구매금액만큼 보유금액을 빼줌
		bonusPoint += t.bonusPoint;
		list.add(t);
	}
	
	void buy(Product p) {
		money = money - p.price; // 구매금액만큼 보유금액을 빼줌
		bonusPoint += p.bonusPoint;
		list.add(p);
	}
	
	

}
