package j0128;

public class AudioPlayer extends Player{

	@Override
	void play(int cp) {
		System.out.println("입력을 받은 위치부터 실행 시작");
	}

	@Override
	void stop() {}
	// @Override : 오버라이딩을 두개 구현 OR 한개 구현/구현X + abstract 붙여주기

}
