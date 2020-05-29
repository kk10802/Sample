public class ArrayExam5 {
	public static void main(String[] args) {
		int[][] arr1 = new int[][] { 
			{ 1, 2, 3 }, 
			{ 4, 5, 6 }, 
			{ 7, 8, 9 }, 
			{ 10, 11, 12 } };
		
		for(int i = 0; i < arr1.length; i++) {
//			int[] arr2 = arr1[i];
//			arr2[1]
//			int value = arr1[i][1];
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.println(arr1[i][j]);
			}
		}
	}
}