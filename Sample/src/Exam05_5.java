import java.util.Scanner;

public class Exam05_5 {
	public static void main(String[] args) {
// ���ѹݺ� ����
		boolean isRun = true;
// �л� ��
		int studentNum = 0;
// �л��� ����
		int[] scores = null;
		Scanner scan = new Scanner(System.in);

		while (isRun) {
			System.out.println("======================================");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("======================================");
			System.out.print("���� > ");
			int selectNo = scan.nextInt();
			if (selectNo == 1) {
				System.out.println("�л����� �Է��ϼ���");
				studentNum = scan.nextInt();
				scores = new int[studentNum];
				
			} else if (selectNo == 2) {
				System.out.println("������ �Է��ϼ���");
				for(int i = 0; i < scores.length; i++) {
					scores[i] = scan.nextInt();
				}	
			} else if (selectNo == 3) {
				System.out.println("��������Ʈ�� �����ּ���");
				for(int i = 0; i < scores.length; i++) {
					//System.out.printf("");
					System.out.println(scores[i]);
				}
			} else if (selectNo == 4) {
				System.out.println("�м����ּ���");
				int sum = 0;
				for(int i = 0; i < scores.length; i++) {
					sum += scores[i];
				}
				double avg = sum / scores.length;
				System.out.printf("%s, %s", sum, avg);
			} else if (selectNo == 5) {
				isRun = false;
			}
		}
		System.out.println("���α׷� ����");
		scan.close();
		}
	}
