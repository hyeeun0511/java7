package j0128;

public class Stuscore {
	{// 인스턴스 초기화 블럭 : 객체생성시마다 실행
		count++;
		no = count;
	}
	// 기본생성자
	Stuscore (){} 
	// 오버로딩 생성자
	Stuscore(String name,int kor, int eng, int math){
		this.name = name;
	    this.kor = kor;
	    this.eng = eng;
	    this.math = math;
	    this.total = kor + eng + math;
	    this.avg = this.total / 3.0;
	}
	
	//멤버변수 
	// 변수 2가지 : 공통변수(클래스변수), 개별변수(인스턴스변수)
	// static : 공통변수(클래스변수)
	// private : 변수에 직접 손대지 않고, 통제된 방법으로만 쓰게 하려고 / 같은 클래스 내에서만 접근 가능
	static int count; // 학생수 -> 객체생성시마다 1씩 증가
	private int no;  // private : 같은 클래스 내에서만 접근 가능
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	//합계 구하는 메서드
	public void calTotal(int kor,int eng,int math) {
		this.total = kor+eng+math; 
	}
	// 평균 구하는 메서드
	public void calAvg(int total) {
		this.avg = total / 3.0;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Stuscore.count = count;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		if(kor>=0 && kor<=100)  // 제약조건
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public double getAvg() {
		return avg;
	}
	
	// setTotal,setAvg : 값 입력해서 바로 넣을수 있음 -> 국영수: 합계 한번에 넣을수 있음
	// 세 과목의 합계를 1000점으로 넣어도 입력,저장이 가능
	// calTotal, calAvg 메서드를 이용해서 합계와 평균을 구하는게 더 안전
	public void setTotal(int total) {
		this.total = total;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	

}
