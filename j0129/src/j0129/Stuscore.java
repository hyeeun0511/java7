package j0129;

public class Stuscore {
	// 2.생성자
	{//번호자동증가
		count++;
		no = count;
	}
	// 3.기본생성자
	Stuscore() {}
	// 4.메소드
	Stuscore(String name, int kor, int eng, int math) {
		this.name = name; // 생성자에서 접근 -> this.name
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = total / 3.0;
	}
	
	@Override 
	//오버라이딩해서 각 객체에 맞게 변경함 
	public boolean equals(Object obj) {
		Stuscore s = (Stuscore)obj;
		if(this.name.equals(s.getName())){
			return true;
        }
		return false;
    }
	
	
	// 5. toString 오버라이드
	// 객체를 출력할 때 자동으로 호출되는 메소드
//	@Override
//	public String toString() {
//		return String.format("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
//					this.getNo(),this.getName(),this.getKor(),this.getEng(),this.getMath(),this.getTotal(),this.getAvg());
//	}
	// this : 객체 자신을 가리키는 참조변수 -> 객체의 필드나 메소드를 호출할 때 사용
	// String.format : 데이터에 있는 값을 내가 원하는 형태로 바꾸어 출력할 때 사용
	// @Override가 가장 먼저 실행됨
	// toString, equals, hashCode 등등 -> Object 클래스에 있는 메소드들 -> 모든 클래스는 Object 클래스를 상속받음
	

	// 1.필드
	static int count;
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	// 5. 메소드 : 총점,평균 계산
	public void calTotal(int kor, int eng, int math) {
		this.total = kor + eng + math;
	}
	public void calAvg(int kor, int eng, int math) {
		this.avg = total / 3.0;
	}
	
	
	// 필드 생성 후 -> getter/setter
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
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	
}
