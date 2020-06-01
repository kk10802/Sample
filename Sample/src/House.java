
public class House {
	// 두 수를 입력받아서 큰 수를 변환하는 기능의 메소드
	int getMaxValue(int v1, int v2) {
		if(v1 > v2) {
			return v1;	
		} else {
			return v2;
		}
		// return 0;
	}
	public static void main(String[] args) {
		MethodExam e = new MethodExam();
		int max = e.getMaxValue(100, 101);
		System.out.println(max);
		
		
		
		
	}

}
