package j0129;

class C01 {

	static int a; // 클래스변수 - 자동초기화 O
	int b; // 인스턴스변수 - 자동초기화 O
	
	public static void main(String[] args) {
//		int c; // 지역변수 - 자동초기화 X
		int c=0; // => 값을 넣어줘야함
		System.out.println(c);
		
		// Q. b를 출력하세요.
		// 1) 객체선언
		C01 c01 = new C01(); 
		// 2) 출력
		System.out.println(c01.b);
		
		System.out.println(C01.a);
		System.out.println(a); // 클래스변수 : 같은 클래스 내에서는 클래스명 생략가능
		
		System.out.println(new Stuscore("홍길동",100,100,100));
	}

}
