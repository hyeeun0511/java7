package j0127;

public class Card extends Object {
	static final int KIND_NUM = 4; // 종류의 수
	String kind; // 종류
	int number;  // 번호 // private : 같은 클래스 내에서만 접근 가능
	String[] num = {"0","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	// num[number] -> K가 찍힘
	Card(){
		super(); // Object의 기본생성자 호출
	}
	Card(String kind,int number){
		super();
		this.kind = kind;
		this.number = number;
	}
	
	@Override // Object클래스에 있는 11개 메소드 중에 1개
	public String toString() {
		return String.format("[ %s,%s ]", kind, num[number]);  
//		return kind+","+num[number];  
	}
	
	
	
}

// 하나만 상속받음 
// super() -> Object의 기본생성자 호출 : Deck() , Card() 에 자동으로 붙어있음
// extends Object : compiler가 자동으로 붙여줌
// Override : 재정의 
// 오버라이딩 : 이름,매개변수,타입 모두 같음
// 오버로딩 : 이름은 같지만 매개변수 또는 타입이 다름

// [super]
// 부모에 있는 변수를 가리킬때



