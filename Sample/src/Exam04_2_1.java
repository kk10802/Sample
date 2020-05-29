public class Exam04_2_1 {
	public static void main(String[] args) {
		int score = 2;

		if((score % 2 ==0 && score % 3 ==0)) {
			System.out.println("2의 배수이면서 3의 배수이면 쿵짝이다");
		}
		else if(score % 3 ==0) {
			System.out.println("3의 배수이면 쿵이다");
		}
		else if(score % 2 == 0){
			System.out.println("2의 배수이면 짝이다");
		}
		else {
			System.out.println("둘다 아니면 없다");
		}
	}
}