// =============================[HachSet]================
package j0130;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.List;

public class C03 {

	public static void main(String[] args) {
//		HashMap<String,Object> map = new HashMap<>();
//		   <key,value>
		Map<String,Object> map = new HashMap();
		List list = new ArrayList();
		List list2 = new ArrayList();
		List list3 = new ArrayList();
		list.add(1); //[0]
		list.add(2); //[1] 
		list.add(list2); //[2]:list2
		list.add(list3); //[3]:list3
		
		
		// map : 묶음을 키값으로 보낼때 사용
		map.put("name", "홍길동"); // (key,value)
		map.put("boardList", list);
		map.put("memberList", list2);
		// map에 넣는 방법 - put(key,value)
		// 읽어오기,출력 - get()
		System.out.println(map.get("name"));
		// 전체출력 - map은 list를 상속하지 않기때문에 Iterator 사용할수 없음
		// map -> set으로 변경해서 Iterator를 사용함,iterator();
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
//===========================[HashSet]================
//		// 순서X , 중복X
//		HashSet set = new HashSet();
//		set.add(2);
//		set.add(3);
//		set.add(1); // int->Integer->Object
//		set.add(4);
//		set.add(5);
//		set.add(3); // 실행은 됨. 입력은 안됨. -> 중복허용X
//		set.add(2); // 실행은 됨. 입력은 안됨. -> 중복허용X
//		
//		Iterator it = set.iterator();
//		while(it.hasNext()) {
//			int a = (int)(it.next());
//			System.out.println(a);
//		}
		
	}

}








//===========================[HashSet]================
// 입력한 순서대로 출력X
// 중복 제거