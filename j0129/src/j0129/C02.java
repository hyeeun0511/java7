package j0129;

public class C02 {

		public static void main(String[] args) {
			A a = new A();
//			B b = new B();
			// 업그레이드 완료
			I i = new B2(); // 다형성-부모의 참조변수로 자손의 객체를 다루는것
			
			a.methodA(i);
			
//			A a = new A();
//			B b = new B(); 
////			a.methodA(b); // 오류발생 : B는 methodA의 매개변수 타입이 아님  
//			B b2 = new B2();
//			a.methodA(b2);
		}
	}


