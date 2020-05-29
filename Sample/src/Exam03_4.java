public class Exam03_4 {
	public static void main(String[] args) {
		int num = 12345;
		int total = 0;
		
		total = total + (num % 10);
		num = num / 10;
		total = total + (num % 10);
		num = num / 10;
		total = total + (num % 10);
		num = num / 10;
		total = total + (num % 10);
		num = num / 10;
		total = total + (num % 10);
		num = num / 10;
		System.out.println("각 자리 숫자의 합 : " + total);
	}
}