import java.util.Scanner;

public class Exam05_5 {
	public static void main(String[] args) {
// 무한반복 상태
		boolean isRun = true;
// 학생 수
		int studentNum = 0;
// 학생별 점수
		int[] scores = null;
		Scanner scan = new Scanner(System.in);

		while (isRun) {
			System.out.println("======================================");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("======================================");
			System.out.print("선택 > ");
			int selectNo = scan.nextInt();
			if (selectNo == 1) {
				System.out.println("학생수를 입력하세요");
				studentNum = scan.nextInt();
				scores = new int[studentNum];
				
			} else if (selectNo == 2) {
				System.out.println("점수를 입력하세요");
				for(int i = 0; i < scores.length; i++) {
					scores[i] = scan.nextInt();
				}	
			} else if (selectNo == 3) {
				System.out.println("점수리스트를 보여주세요");
				for(int i = 0; i < scores.length; i++) {
					//System.out.printf("");
					System.out.println(scores[i]);
				}
			} else if (selectNo == 4) {
				System.out.println("분석해주세요");
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
		System.out.println("프로그램 종료");
		scan.close();
		}
	}
