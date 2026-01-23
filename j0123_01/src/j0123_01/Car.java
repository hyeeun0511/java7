package j0123_01;

public class Car {
	
	Car(){
		this("White","auto",5); //this:생성자에서 다른생성자를 호출(this) 
//		color = "white";
//		gearType = "auto";
//		door = 5;
	} // 기본생성자
	
	
	// 매개변수가 있는 생성자
	// 지역변수(매서드내에 선언)
	Car(String color,String gearType,int door){
//		color = color; // String의 값과 color, color 값이 같음
		this.color = color; // this: 인스턴스변수를 가리킴 // Sting color의 color에 값을 넣어줌
		this.gearType = gearType; // String gearType에 값 넣음
		this.door = 	door; // int door에 값 넣음
	} // String color : 매개변수/지역변수

	String color; // 인스턴스변수
	String gearType;
	int door;
	
}
