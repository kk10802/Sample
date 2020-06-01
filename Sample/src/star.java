
public class star {
	public static void main(String[] args) {
		// 전체크기 5
		int n = 11;
		int center = n / 2 + 1; // 3
		int left = center;
		int right = center;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(j < left || j > right) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			if(i < center) {
				left--;
				right++;
			} else {
				left++;
				right--;
			}
			System.out.println();
		}
				
	}
}
