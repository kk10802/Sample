public class Exam04_2_1 {
	public static void main(String[] args) {
		int score = 2;

		if((score % 2 ==0 && score % 3 ==0)) {
			System.out.println("2�� ����̸鼭 3�� ����̸� ��¦�̴�");
		}
		else if(score % 3 ==0) {
			System.out.println("3�� ����̸� ���̴�");
		}
		else if(score % 2 == 0){
			System.out.println("2�� ����̸� ¦�̴�");
		}
		else {
			System.out.println("�Ѵ� �ƴϸ� ����");
		}
	}
}