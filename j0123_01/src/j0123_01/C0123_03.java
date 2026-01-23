package j0123_01;

public class C0123_03 {
	// 클래그변수,인스턴스변수,지역변수 - 메소드내선언
	// 클래스메소드 - 객체선언없이 클래스명.메소드명
	// 인스턴스메소드 - 객체선언후 참조변수명.메소드명
	
	
	int add(int a,int b) { // 인스턴스 메서드
		return a+b;
	}
	
	//sub,multi,divide
	//메서드 만들어서 결과값 만든 후 출력
	int sub(int a, int b) {
		return a-b;
	}
	int multi(int a, int b) {
		return a*b;
	}
//	int divide(int a, int b) {
//	    return a/(double)b;
//	}
	
	
	public static void main(String[] args) {
		//객체선언후 사용
		C0123_03 c = new C0123_03();
		int a = 10;
		int b = 3;
		int result = c.add(a,b);
		System.out.println(result);
		int result2 = c.sub(a,b);
		System.out.println(result2);
		int result3 = c.multi(a,b);
		System.out.println(result3);
//		double result4 = c.divide(a,b);
//		System.out.println(result4);
		

	}

}

//=====================================================
// 메서드
// 1. 클래스 메서드(static 메서드)
// 2. 인스턴스 메서드
// 변수 - 클래스변수, 인스턴스변수, 지역변수
//=====================================================