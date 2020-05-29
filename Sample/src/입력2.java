import java.util.Scanner;

public class 입력2 {
	public static void main(String[] args) {
		System.out.println("첫번째 수를 입력해주세요.");
		Scanner s =new Scanner(System.in);
		int first = s.nextInt();
		
		System.out.println("두번째 수를 입력해주세요.");
		int second = s.nextInt();
		
		System.out.printf(
				"1번 %s, 2번 %s, 나누기결과는 %s",
				first, second, first / second);
	}
}
