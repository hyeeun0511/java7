package j0127;

public class Tv {
	boolean power;
	int channel;

	void power() {
		power = !power;
	} // power가 true면 false, false면 true
	void channelUp() {
		channel++;
	}//channelUp
	void channelDown() {
		channel--;
	}// channelDown

}//Tv
