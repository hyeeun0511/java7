package j0126;

public class Ci extends Shape{ //Shape.java에 있는 color, draw() 상속받음
	Point center; // int x, int y
	int r;
	//# 생성자 만들기
	// 기본생성자
	Ci(){ 
		this(new Point(0,0),100);
	}
	// 전체생성자 : 갖고있는 모든 변수를 초기화하는 생성자
	Ci(Point center,int r){
		this.center = center;
		this.r = r;
	}

}
