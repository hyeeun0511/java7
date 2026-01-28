package j0128;

public class SCV extends GroundUnit {
	SCV(){
		super(60);
		hitPoint = MAX_UP;
	}
	void repair(GroundUnit r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r; //u:unit
			while(u.hitPoint != u.MAX_UP) { // un.MAX_UP으로 해야 150이 충전됨
				u.hitPoint++; // unit일 경우 1씩 증가 -> 힘 보충
			}
			System.out.println("체력충전 완료 !!");
		}
	}

}


//==============================================
// scv : 수리능력