package j0123_01;

public class C0123_01 {
	
	int aa; //인스턴스변수 - 객체선언후 참조변수명.변수명
	static int aaa; //클래스변수 - 객체선언없이 클래스명.변수명
	static void ch() { // 클래스 메소드 = 객체선언없이 클래스.메소드명
		int abc = 0; //지역변수 - 메소드 내에 선언된 변수
	}

//	void power(){
//		power = !power;
//	}
	
	
	public static void main(String[] args) {
		// 클래스명 참조변수명 = new 클래스명();
//		Tv t = new Tv(); // Tv객체 생성 -> t: 참조변수(주소값 저장)
		
		// Stuscore.java(파일) 만들어 객체생성 (번호,이름,국어,영어,수학,총점,평균)
		
		// 배열
//		int[] aaa = new int[5];
		int a = 0; //지역변수
		
		Stuscore[] ss = new Stuscore[5]; // Stuscore객체 5개 저장할수있는 공간생성 -> ss: 참조변수(주소값 저장)
		ss[0] = new Stuscore();
		ss[0].no = 1;
		ss[0].name = "홍길동";
		ss[0].kor = 100;
		ss[0].eng = 100;
		ss[0].math = 100;
		ss[0].total = ss[0].kor+ss[0].eng+ss[0].math;
		ss[0].avg = ss[0].total/3.0;
		
		System.out.printf("번호: %d\t 이름: %s\t 국어: %d\t 영어: %d\t 수학: %d\t 총점: %d\t 평균: %.1f\n"
				, ss[0].no, ss[0].name, ss[0].kor, ss[0].eng, ss[0].math, ss[0].total, ss[0].avg);
		
		
//		System.out.printf("번호: %d\t 이름: %s\t 국어: %d\t 영어: %d\t 수학: %d\t 총점: %d\t 평균: %.1f\n"
//				,s.no,s.name,s.kor,s.eng,s.math,s.total,s.avg);
		
		
//		Student s = new Student(); // Student.ja에 있는 정보가 s에 들어옴 -> s에 3개의 공간(변수) 생성
//		s.no = 1;
//		s.id = "aaa";
//		s.name = "홍길동";
//		Student s2 = new Student();
//		s.no = 2;
//		s.id = "bbb";
//		Student s3 = new Student();
//		s.no = 3;
//		s.id = "ccc";
		
		
		
		// 객체 - 다른타입 여러개 입력, 메소드 입력
//		Tv aaa = new Tv();
//		aaa.channel = 10;
//		aaa.color = "white";
//		System.out.println(aaa); // 주소값
//		System.out.println(aaa.channel); // 값출력
		
		// 배열 - 같은타입 여러개 입력
//		int[] aa = {1,2}; // aa에 값 두개 넣음
//		System.out.println(aa); // 주소값
//		System.out.println(aa[0]); // 값출력 
		
//		int[] bb = {0,0}; // bb에 값 두개 넣음
//		bb = aa; // bb에 aa의 주소값을 넣음
//		System.out.println(bb[0]+","+bb[1]); // 값출력
//		aa[0] = 100; // aa의 값만 변경 // bb에도 영향->bb의 값도 변함
//		System.out.println(bb[0]+","+bb[1]);
//		
//		// 기본형 8가지 타입
//		boolean a = true;
//		char b = 'a';
//		byte c = 1;
//		short d = 1;
//		int e = 1;
//		long f = 1L; //L: long형 접미사 / long에서는 L 권장
//		float g = 1.0f; //f: float형 접미사 / float에서는 f 권장
//		double h = 1.0; 
//		System.out.println(a);
		
	}

}

//================================================================================
// 객체,배열 공통점 : 여러개의 값을 저장할수있는 공간
// 객체 : 다른타입 여러개 저장 -> 속도 느림 (매번 타입 체크)
// 배열 : 같은타입 여러개 저장 -> 속도 빠름
// 기본형 타입과 배열은 다름
// int[] aa -> aa를 찍으면 주소값이 나옴 
//          -> 값 출력 : println(aa[0]) -> 0번째 값 출력  ==(값출력)==> aa[N] : N번째 값 출력
//                     배열에서 몇번째 위치인지 지정해줘야 값출력 가능 
// 방법) 주소값 넣기 -> 주소값 위치에 여러개의 주소값을 넣을수있는 공간 생성
// 
//-------------------
// System.out.printf();  // 1개만 출력 가능 // ex ("번호: %d\t 이름: %s\t",s.no,s.name)
//                                         "번호: %d\t 이름: %s\t" -> 형식문자열 ""한 묶음으로
// 
// 
//	public class C0123_01 {
//
//	int aa; //인스턴스변수 - 객체선언후 참조변수명.변수명
//	static int aaa; //클래스변수 - 객체선언없이 클래스명.변수명
//	static void ch() { // 클래스 메소드 = 객체선언없이 클래스.메소드명
//	int abc = 0; //지역변수 - 메소드 내에 선언된 변수
//
// public static void main(String[] args) {
// int a = 0; //지역변수
// }
//================================================================================






