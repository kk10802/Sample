public class ArrayExam4 {
	public static void main(String[] args) {
		char[] chars = { 'b', 'e', 'z', 'a', 'w' };
		
		// 배열의 요소 섞어주기
		for(int i = 0; i < 10000; i++) {
			int a = chars[0]; // 0번째 요소
			int ran = (int) (Math.random() * chars.length);
			int b = chars[ran]; // 랜덤 번째 요소
			int temp = a;
			a = b;
			b = temp;
			chars[0] = (char)a;
			chars[ran] = (char)b;
			
			// 0.0 <= X < 1.0
		}	
		System.out.println(chars);
	}
}