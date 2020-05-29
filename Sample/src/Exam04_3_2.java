import java.util.Scanner;

public class Exam04_3_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개 입력>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		
		if(a <= b && a >= c) {
			System.out.println(a);
		}
		else if(a <= c && a >= b) {
			System.out.println(a);
		}
		else if(b <= a && b >= c) {
			System.out.println(b);
		}
		else if(b <= c && b >= a) {
			System.out.println(b);
		}
		else if(c <= a && c >= b) {
			System.out.println(c);
		}
		else if(c <= b && c >= a) {
			System.out.println(c);
		}
	}
}