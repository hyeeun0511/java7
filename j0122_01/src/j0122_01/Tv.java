package j0122_01;

public class Tv {
	
	String color; // 인스턴스변수
	boolean power;
	int channel;
	void power() {power = !power;};  // TV를 켜고 끄는 기능
	void channelUp() {channel++;};   // 채널을 높이는 기능
	void channelDown() {channel--;}; // 채널을 낮추는 기능
}
