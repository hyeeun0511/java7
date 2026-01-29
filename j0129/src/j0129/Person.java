package j0129;

public class Person { //p1의 것
	long id; //20010111_1111111
	String name; //"홍길동"
	
	Person(){}
	Person(long id,String name){
		this.id = id;
		this.name = name;
	}
	
	// 복제 방법
	Person(Person p){
		this.id = p.id;
		this.name = p.name;
	}
	
	// main에서 주소가 아닌 값을 출력하기 위해 toString() 재정의
	@Override // 주인:  Object 클래스
	public String toString() {
		return String.format("%d,%s", id,name);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// id(주민등록번호)로 비교하고있기때문에 같다고 나옴
//		if (this.id == ((Person)obj).id) { 
		// name(이름)으로 비교
		if (this.name.equals( ( (Person)obj ).name) ) {
			return true;
		}
		return false;
	}

}
