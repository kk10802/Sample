public class Exam05_8 {
	public static void main(String[] args) {
		String str = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세";
		String[] arr = str.split(" ");
		
		String temp2 = " ";
		//for(int i = 0; i < arr.length; i < 0; i++) {
		for(int i = arr.length - 1; i > 0; i--) {
			temp2 += arr[i] + " ";
			System.out.println(temp2);
		}
		
		
		
		
		
//		String temp = " ";
//		for(String string : arr) {
//			temp += string + " ";
//			System.out.println(temp);
//		}
	}
}
