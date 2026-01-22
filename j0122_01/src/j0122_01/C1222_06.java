package j0122_01;

public class C1222_06 {
	
	
	// 합
	static int add(int a, int b, int c) {
		return a+b+c;
	}
	// 차
	static int sub(int a, int b, int c) {
		return a-b-c;
	}
	
	static int[] cal(int a,int b,int c) {
		int[] re = new int[2];  // re에 re[0],re[1]이 들어있음
		re[0] = a+b+c;
		re[1] = a-b-c;
		return re; // 객체로 보내면 다른 타입도 보낼수있음.
	}
	
//	// 곱
//	static int multi(int a, int b, int c) {
//		return a*b*c;
//	}
//	// 나누기
//	static int divide(int a, int b, int c) {
//		return a/(b*c); 
//	}
	

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		int c = 2;
		int[] re;  // 배열로 받았으면 배열로 보내야함(받은 배열 스타일로_int배열>int배열)
		
		re = cal(a,b,c);
		
		System.out.println(re[0]+","+re[1]);
		
//		int result = 0, result2 = 0, result3 = 0;
//		
//		// 매개변수 3개를 보내서 add,sub,multi,divide 함수를 만들어서
//		// 결과값을 리턴 받아, 출력하시오.
//		result = add(a,b,c);
//		result2 = sub(a,b,c);
//		System.out.printf("%d,%d \n",result,result2);

	}

}
