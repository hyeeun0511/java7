package j0126;

public class Triangle extends Shape{
	// 점 3개
	Point[] p;
	// Point라는 객체로 배열을 받음
//	Point p1;
//	Point p2;
//	Point p3;
	
	Triangle(){}
	// 생성자 - 3개 점을 배열로 받아 선언
	Triangle(Point[] p){
		this.p = p;
//		p1 = p[0];
//		p2 = p[1];
//		p3 = p[2];
	}
	
	// 생성자 - 3개 점을 개별로 받아 선언
	Triangle(Point p1,Point p2,Point p3){
		p = new Point[] {p1,p2,p3};
//		this.p1 = p1;
//		this.p2 = p2;
//		this.p3 = p3;
	}

}
