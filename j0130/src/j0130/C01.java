package j0130;

import java.util.ArrayList;
import java.util.Iterator;

public class C01 {

	public static void main(String[] args) {
		// list: 순서O/중복O
		// set : 순서X/중복X
		// map : key-중복X/value-중복O
		ArrayList list = new ArrayList(); // 객체선언
		// 입력(값추가)
		int a = 11;
		// add: 값추가 -> 데이터 저장
		list.add(11);  // int(Integer wrapper클래스로 자동변경) -> Object
		list.add(22);
		list.add(33);
		list.add(11);
		list.add(33);
		list.add(3);
		// 1개 가져오기(출력)
//		list.get(0); // list에 있는 0번째 값을 get형태로 가져와라
//		Object o = list.get(0); // Object : 형변환을 시켜줘야함 
		int aa = (int)list.get(0); // 방법 1)
//		Integer aa = (Integer)list.get(0); // Integer wrapper클래스로 형변환 // 방법 2) 이렇게 해도됨
		//System.out.println(aa); 
		
		// 삭제
		list.remove(3);
		
		// 전체출력
		for(int i=0;i<list.size();i++) {
			int no = (int)list.get(i);
			System.out.println(no);
		}
		System.out.println("=====================");
		// Iterator를 사용해서 전체출력을 해야함
		// Iterator 화용 : 향상된 for문
		Iterator it = list.iterator();
		while (it.hasNext()) { // hasNext(): 다음값이 있냐? 롹인
			int list_data = (int) (it.next()); // next(): 다음값을 가져와라
			System.out.println(list_data);
		}
	}

}
