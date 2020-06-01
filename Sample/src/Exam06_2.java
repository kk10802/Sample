public class Exam06_2 {
	public static void main(String[] args) {
		Exam06_2 e = new Exam06_2();
		int result1 = 0;
		result1 = e.plus(5, 3);
		System.out.println(result1);
		
		int result2 = 0;
		result2 = e.minus(5, 3);
		System.out.println(result2);
	}
	int plus(int v1, int v2) {
		int rrr = v1 + v2;
		return rrr;
	}
	int minus(int v1, int v2) {
		return v1 - v2;
	}
		
}