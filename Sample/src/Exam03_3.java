import java.util.Scanner;

public class Exam03_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("2자리수 정수 입력(10~99)>>");
		int n = scanner.nextInt();
		int ten = n / 10;
		int one = n % 10;
		
		System.out.println( ten == one ); 
		
	}
}