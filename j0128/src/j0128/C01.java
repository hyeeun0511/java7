package j0128;

public class C01 {

	public static void main(String[] args) {
		Car c = new Car();
		Car.name = "홍길동";
		c.door = 10;
		Car c2 = new Car();
		c2.door = 20;
		Car.name = "유관순";
		
		int num = 2;
		int no = c2.move(num); // Car.java 의 move() 메서드 호출
		System.out.println(no);
		
		int no2 = c2.move(); // 무조건 10을 return받음
		System.out.println(no2); 
	}

}
