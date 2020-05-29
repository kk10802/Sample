public class Exam05_1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(arr);
		
//		arr[1] = 0;
//		arr[3] = 0;
//		arr[5] = 0;
//		arr[7] = 0;
//		arr[9] = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] % 2 !=0) {
				System.out.print(arr[i]);
				sep = " , ";
				
			}
			
		}

	}
}