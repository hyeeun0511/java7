package j0127; // 패키지-없으면 에러, 없으면 자동으로 부여(컴파일시 자동부여)

// Object상속 자동으로 부여(컴파일시)
public class C05 extends Object {
	
	// 기본생성자 - 없으면 에러, 없으면 자동으로 부여(컴파일시)
	C05(){
		super(); // 조상의 생성자 호출 - 없으면 에러, 없으면 자동으로 부여	(컴파일시)
	} 
	
	public static void main(String[] args) {
		Stuscore s1 = new Stuscore();
		s1.no =1;
		s1.name = "홍길동";
		
		Stuscore s = new Stuscore("홍길동", 90, 80, 70);
		// 자동으로 Stuscore() 생성자 호출 > 값이 name,kor,eng,math에 저장
		
	}

}
