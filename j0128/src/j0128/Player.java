package j0128;

abstract public class Player {
	
	int currentPlay;
	
	abstract void play(int cp); //미완성메소드
	abstract void stop(); //미완성메소드
	
	void play() { //오버로딩 - 완성메소드  // 위에 play와 이름이 같지만 다른 메소드
		System.out.println("실행합니다.");
	}

}
