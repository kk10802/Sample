import java.util.Scanner;

public class �Է�2 {
	public static void main(String[] args) {
		System.out.println("ù��° ���� �Է����ּ���.");
		Scanner s =new Scanner(System.in);
		int first = s.nextInt();
		
		System.out.println("�ι�° ���� �Է����ּ���.");
		int second = s.nextInt();
		
		System.out.printf(
				"1�� %s, 2�� %s, ���������� %s",
				first, second, first / second);
	}
}
