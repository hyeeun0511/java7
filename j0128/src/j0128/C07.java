package j0128;

import java.util.ArrayList;

public class C07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		I b1 = new B();  // B b -> I b : interface에 있는 b로 변경
		I b2 = new B2();
		// new B() => B초급 // new B2() => B중급 
		I b = new B2();
		a.methodA(b);
		
		
	}

}
