package j0123_01;

public class C0123_07 {

	public static void main(String[] args) {
		Stuscore[] s = new Stuscore[10];  // 배열로 객체 선언
		s[0] = new Stuscore("홍길동",100,100,99);
		s[1] = new Stuscore("유관순",90,90,91);
		s[2] = new Stuscore("이순신",80,95,74);
		
		
		for(int i=0;i<4;i++) {
			System.out.printf(
			"%d. 이름:%s  %d점 %d점 %d점 %d점 %.2f점\n",
			s[i].no,s[i].name,s[i].kor,
			s[i].eng,s[i].math,s[i].total,
			s[i].avg );
		}

	}

}
