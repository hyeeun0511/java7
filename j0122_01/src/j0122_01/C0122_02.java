package j0122_01;

public class C0122_02 {

	public static void main(String[] args) {
//		Stuscore s1; // 참조변수 선언 - 주소만 만들어짐  / s1=new Stuscore();->s1에 Stuscore에 있는 정보가 넘어옴
		Stuscore s1 = new Stuscore(); // 관리 편함. s1=홍길동, s2=유관순, ...
		
		// 객체 선언 하는 방법
		// 클래스 명
		AA a1 = new AA(); // 3개의 변수가 동시에 선언
		//================
		
		
		int a = 0; 
		String sstr = ""; 
		String str = new String("");
		Stuscore s = new Stuscore(); // 7개의 변수가 동시에 선언
		
		// 코드의 재사용이 좋음
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		Tv aa = new Tv();
		Tv b = new Tv();
		
//		// 홍길동
//		int no = 1;
//		String name = "홍길동";
//		int kor = 100;
//		int eng = 100;
//		int math = 100;
//		int total = kor + eng + math;
//		double avg = total/3.0;
//		// 유관순
//		int no2 = 0;
//		String name2 = "";
//		int kor2 = 0;
//		int eng2 = 0;
//		int math2 = 0;
//		int total2 = 0;
//		double avg2 = 0;

	}

}

