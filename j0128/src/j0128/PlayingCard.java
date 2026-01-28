//=============================[ 인터페이스_interface.java ]=============================
package j0128;

// # 인터페이스 - interface 붙이고, 상수와 미완성메소드로 이뤄짐
public interface PlayingCard {
	public static final int SPADE = 4;
	int DIAMOND = 3;
	int HEART = 2;
	int CLOVER = 1;
	
	String getCardNumber(); 
//	public abstract String getCardNumber();  // 인터페이스에서는 public abstract 생략가능
	// String getCardNumber(){} // 인터페이스에서는 메소드에 중괄호 사용 불가 // 구현{} 불가능
	void pick();
	String getCardKind();
}
