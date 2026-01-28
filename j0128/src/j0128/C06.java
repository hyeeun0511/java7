package j0128;


public class C06 {

	public static void main(String[] args) {
		// Tank 객체 생성
		SCV s = new SCV();
		//----------------------------------------------
		Tank t = new Tank();
		System.out.println("현재체력 : "+t.hitPoint); // 150
		
		// 폭탄 - 데미지:-30
		System.out.println("폭탄 맞음 -30");
		t.hitPoint -= 30;
		System.out.println("현재체력 : "+t.hitPoint); // 
        System.out.println("-----------------");
		
        
		// Marine 객체 생성
		System.out.println(t.hitPoint); // 40
		System.out.println("-----------------");
		System.out.println("현재체력");
		System.out.println("총을맞음");
//		system.out.println("현재체력");
		System.out.println("현재체력");
//		s.repair(m);
		System.out.println(t.hitPoint);
		System.out.println("-----------------");

		
		Marine m = new Marine();
	}

}


//==============================================
//scv : 수리능력
// Drophip > AirNut> Unit
// Marine > GroundUnit > Unit
// Tanma >GfoordUpt > Unit
// rank > GroundUnit > Unit
// Scv > GroundUnit > Unit
// => 공통 연역이 없음
// ==> interface를 사용 - 서로 아무 관계없는 클래스들 연결 시켜줌




















