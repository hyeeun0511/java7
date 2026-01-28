package j0128;

public class C05 {

	public static void main(String[] args) {
		
		AudioPlayer a = new AudioPlayer() {
			@Override
			void stop() {
				System.out.println("재생을 멈춥니다.");
			}
		};



		
//		//1) 객체선언
//		Player p = new Player(); // 미완성클래스는 객체선언이 안됨
//		//2) currentPlay 출력
//		System.out.println(p.currentPlay);
		
	

}
}
