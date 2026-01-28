package j0128;

public class Unit {
	int hitPoint; //현재체력
	final int MAX_UP; //최대체력 //값이 안들어가있어서 에러
//	Unit(){MAX_UP = 100;} //기본생성자에서 초기화
	Unit(int hp){
		MAX_UP = hp; //생성자에서 초기화
	}
}
