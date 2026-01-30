package j0130;

import java.util.ArrayList;

public class C02 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		list.add(66);
		list.add(77);
		// for문으로 전체 지우기
		for(int i=list.size()-1;i>=0;i--) {
			list.remove(i); // 전체 지우기
		}
		System.out.println(list);
	}

}
