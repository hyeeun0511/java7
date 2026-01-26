package j0126;

public class CMethod {
// CMethod(){} //기본생성자 - 자동으로 만들어짐

	int[] method(int num) {
		int a = 10; // return값이 없는 메서드 -> main으로 갖고갈수 없음
		int[] arr = {1,2,3};
		// 입력받은 숫자를 곱함
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr[i]*num;
		}
		return arr; // return 작성시 main으로 값을 갖고갈수 있음 // return 필수!!
	}
}
