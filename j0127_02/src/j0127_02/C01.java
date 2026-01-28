package j0127_02;

public class C01 {

	public static void main(String[] args) {
		Stuscore s1 = new Stuscore();
		// 값넣는 방식 1. 직접
//		s1.no = 1;
//		s1.name = "홍길동";
		// 값넣는 방식 2. 메서드 이용 (setXxx()) > 캡슐화
		// 메서드 이용 > 조건 가능
		s1.setName("홍길동");
//		s1.kor = 500;
		s1.setKor(500);
		System.out.println(s1.getKor());
		
		
	}

}
