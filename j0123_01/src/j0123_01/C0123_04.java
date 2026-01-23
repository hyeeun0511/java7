package j0123_01;

public class C0123_04 {
	
	static void add(int a,int b) { // 클래스 메서드
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		// 객체선언후 사용
		int a = 10;
		int b = 9;
		int c = 5;

		Method m = new Method(); // Method 클래스의 객체 m 생성
		
		//a,b를 보내서 평균값을 리턴해서 받아, 출력
//		double result = m.avg(a,b); // 평균: double
//		System.out.println("합계 : "+result);
//		
//		// a,b,c를 보내서 합계를 리턴해서 출력
//		int result2 = m.total(a, b, c);
//		System.out.println("합계 : "+result2);
//		
//		// input()호출해서 출력하시오.
//		//input() 2개의 값을 입력받아 합계를 리턴
//		m.input();
//		
//		// 두개의 수를 입력받아 합계를 리턴
//		// 리턴 타입을 int로 
//		int result3 = m.input2();
//		System.out.println("합계 : "+result3);
		
		// 함수호출
		// 1. 리턴없이2개 숫자 입력받아, 더하기,빼기,곱하기 값을 출력하는 메소드 구현
//		m.addSubMulti();
		
		// 함수호출
//		int[] result = m.addSubMulti2();
//		for(int i=0;i<result.length;i++) {
//			System.out.println(result[i]);
//		}
		
		// 함수호출 - 매개변수로 보내서 받기
		int[] score = new int[3];
		m.addSubMulti3(score);  // 매개변수로 배열을 보내서 결과를 받음 // 없을시 0 0 0으로 출력
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]);
		}
		
		
		
//      C0123_04.add(a,b);
	}

}


//=====================================================
// Method m = new Method(); 
// Method 클래스의 객체 m 생성 => 공통부분
//=====================================================
