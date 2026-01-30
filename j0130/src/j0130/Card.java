package j0130;

public class Card {
	// 기본생성자
	Card(){}
	Card(String kind,int number){
		this.kind = kind;
		this.number = number;
	}
	
	int number;
	String kind;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
