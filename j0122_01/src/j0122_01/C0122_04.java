package j0122_01;

public class C0122_04 {

	public static void main(String[] args) {
		// 기본베열
		Stuscore[] sArr = new Stuscore[10];
		// 객체선언
		sArr[0] = new Stuscore(); 
		sArr[0].no = sArr[0].count+1;
		sArr[1] = new Stuscore(); 
		
		
		// 1. 홍길동
		Stuscore s = new Stuscore();
		s.no = Stuscore.count+1; //클래스 변수 = 클래스명.변수명
		s.name = "홍길동";
		s.kor = 100;
		s.eng = 100;
		s.math = 99;
		s.calTotal();
		s.calAvg();
		Stuscore.count++; // 클래스변수 1증가
		// 2. 유관순
		Stuscore s2 = new Stuscore();
		s2.no = Stuscore.count+1; //클래스 변수 = 클래스명.변수명
		s2.name = "유관순";
		s2.kor = 90;
		s2.eng = 90;
		s2.math = 91;
		s2.calTotal();
		s2.calAvg();
		
		System.out.printf("%d,%s,%d,%d,%d,%d,%.2f\n",s.no,s.name,s.kor,s.eng,s.math,s.total,s.avg);
        System.out.printf("%d,%s,%d,%d,%d,%d,%.2f\n",s2.no,s2.name,s2.kor,s2.eng,s2.math,s2.total,s2.avg);
	}

}
