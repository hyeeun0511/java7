package j0127;

public class CationTv extends Tv{
	
	String text;
	void caption() {
		System.out.println("자막이 나타납니다.");
	}

}

//====extends Tv > 밑에 내용을 선언한것과 같다====//
//boolean power;
//int channel;
//
//void power() {
//	power = !power;
//} // power가 true면 false, false면 true
//void channelUp() {
//	channel++;
//}//channelUp
//void channelDown() {
//	channel--;
//}// channelDown