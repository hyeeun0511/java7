package j0127;

public class C04 {
	
	// 기본생성자 - 생성자가 없으면 자동으롤 기본생성자를 생성해줌.(컴파일)
//	C04(){}
	// 클래스변수 - 객체선언없이 클래스명.변수명
	static int aa; // 초기화 자동으로 설정
	// 인스턴스 변수 - 객체선언후 참조변수명.변수명
	int b;
	
	public static void main(String[] args) { // main 메소드
		// 지역변수는 초기화가 자동으로 되지않기에 초기화를 해줘야함.
//		int a;
//		System.out.println(a); // 에러
		int a=0; // 초기화 // 지역변수는 초기화 안됨
		System.out.println(a); // 0
		
		C04 c = new C04(); // 생성자
		System.out.println(c.b); // 0

//		System.out.println(C04.aa); // 0 // 클래스(C04) 생략가능
		System.out.println(aa); // 0
	}

}
