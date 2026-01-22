// Q. Tv를 갖고 객체선언 -> 흰색,true,7 / 검정,false,10 넣어보기
package j0122_01;

public class C0122_05 {
	
//	int aa = 0; //인스턴스변수 - 객체선언후 참조변수명, 변수명.
//	static int bb = 0; // 클래스변수 - 객체선언없이 클래스명.변수명.
	

//	// 함수내에는 서로 같은 이름을 선언해도 됨. -> 지역변수({}벗어나면 사라짐)
//	static int add(int a,int b) { //인스턴스메소드(static이 없음) - 객체선언후
//		System.out.println("합: "+(a+b));
//		return a+b;
//	}
	
	static int addSub(int a,int b) {
		int result = a+b;
		int result2 = a-b;
		return result;
//		return result,result2; // 불가능 // return문은 1개만 전송 가능
	}
	
	static int add(int a,int b) { //클래스 메소드 - 객체선언X
		//System.out.println("합 : "+(a+b));
		return a+b;
	}
	
	static int sub(int a,int b) {
		//System.out.println("차: "+(a-b));
		return a-b;
	}
	
	//multi,divide
	static int multi(int a,int b) {
		//System.out.println("곱: "+(a*b));
	    return a*b;
	}
	
	static double divide(int a,int b) {
		//System.out.println("나누기: "+(a/b));
		return a/(double)b; // 정수/정수 = 정수 -> 형변환 필요
	}
	
	
	public static void main(String[] args) {
		int a = 10; 
		int b = 2;
		
		int result = 0, result2 = 0, result3 = 0;
		double result4 =0; // 평균 : 실수 -> double
		
		// return문 사용
		// 더하기
		result = add(a,b);
		result2 = sub(a,b);
		result3 = multi(a,b);
		result4 = divide(a,b);
		System.out.printf("%d,%d,%d,%.2f \n",result,result2,result3,result4);
		
		int[] aArr = {1,2,3};
		
		System.out.println(aArr); // 주소값 출력
		Tv t = new Tv();
		System.out.println(t); // 주소값 출력
		
		
		// 인스턴스 메소드 사용방법
		C0122_05 c1 = new C0122_05(); // 객체선언 필수!!
		c1.add(a,b); // 인스턴스메소드 호출 -> 객체선언후 참조변수명.함수명();
		
		// 클래스 메소드 사용방법 - 같은 클래스 내에는 클래스명 생략하능
		add(a,b);
		sub(a,b);
		multi(a,b);
		divide(a,b);
		
		
		// 파이썬 : 함수 선언이 함수호출보다 위에 있어야 함 -> 위에부터 한줄씩 실행되므로
		// -> 자바 : 상관없음 -> 컴파일 단계에서 다 인식함
			
//		int a = 10; // 기본변수 -> 값저장
//		int[] aArr = {1,2,3}; // 참조변수 - 배열선언 -> 주소저장
//		
//		System.out.println(a);
//		System.out.println(aArr);
		
		
		
		
//		C0122_05 c1 = new C0122_05(); // 객체선언 필수!!
//		System.out.println(c1.aa);
//		System.out.println(bb); // 같은클래스내에서는 클래스명 생략가능
//		
//		
//		int a = 0; // 지역변수 - 메인메소드 내 선언
//		
//		
//		// 흰색,true,7
//		Tv t1 = new Tv(); // Tv 객체선언
//		t1.color = "흰색";
//		t1.power = true;
//		t1.channel = 7;
//		
//		// 검정,false,10
//		Tv t2 = new Tv(); // Tv 객체선언
//		t2.color = "검정";
//		t2.power = false;
//		t2.channel = 10;

	}

}
