package j0129; // 패키지-없으면 에러, 없으면 자동생성

public class TryClass extends Object{ //없으면 자동생성(Object)-11개메소드
	
	
	
	// 기본생성자 - 없으면 에러, 없으면 자동생성
	TryClass(){
		super(); //자동생성 - 부모생성자 호출
	}
	
	// equals(),toString(),hashCode()... - Object 클래스에 있음 > 11개 메소드 존재함
	
	
	
	// <예외처리 미루기 => throws>
	void method() throws Exception { // 에러가 나면 C04에 있는 t.method()에 예외처리를 맡김
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(0/0); // 0으로 나누면 에러
		System.out.println(4);
        System.out.println(5);
	}
	
}


//System.out.println(1);
//System.out.println(2);
//try {
//	System.out.println(3);
//	System.out.println(0/0); // 0으로 나누면 에러
//}catch (Exception e){
//	System.out.println(4);
//    e.printStackTrace(); //에러발생 정보,위치 메세지 출력
//}
//System.out.println(5);