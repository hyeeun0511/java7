package j0128; // 패키지 - 자동생성

import java.util.ArrayList;

// 상속 - 자동생성
public class C02 extends Object {

	// 눈에는 안보이지만 자동생성
//	C02(){ // 생성자 - 자동생성
//		super(); // 부모생성자호출 - 자동생성
//	} 

	public static void main(String[] args) {
		// 컬렉션 - 객체를 저장하는 확장배열 
		// Object o = newCar();
		// Object o = new C02();
		ArrayList<Integer> list = new ArrayList();
		list.add(5);
		list.add(4);
		list.add(1);
		list.add(10);

		int a = list.get(0); // 방법호 :  Integer -> int (자동형변환)
		// 주소값으로 뽑아오기 때문에 Integer로 받아야함
	
		// 넣을때는 add , 뽑을때는 get -> 타입을 맞춰줭함
		
		
		
//		Car c = new Car();
//		
//		Car c2 = null;
//		
//		FireCar f1 = new FireCar();
//		FireCar f2 = null;
////		f2.water(); // f2가 null인데 호출해서 에러남
//		
//		AmbulCar a1 = new AmbulCar();
//		AmbulCar a2 = null;
//		
//		c2 = (Car)f1; // Car <- FireCar (자동형변환)
//		f2 = (FireCar)c2; // FireCar <- Car (강제형변환)
//		f2.water();
		
//		a2 = (AmbulCar)c2; // 런타임에러 발생
		
		
		
		
		// 배열은 개수가 정해지면 추가가 안됨. 같은 타입만 저장가능
//		int[] a = new int[3];
//		a[0] = 1;
//		a[1] = 2;
////		a[2] = 3; // 정해진 총개수랑 다르묭 에러
////		a[1] = "홍길동"; // 타입이 다르면 에러
//		
//		System.out.println(a[0]+","+a[1]);
		
	}

}

// ==============================================
// Object : 모든 객체의 조상
// ==============================================
// 자동생성 : extends Onject
// 
// 
// 
// 
// 
// 