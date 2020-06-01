public class Exam05_9_2 {
	public static void main(String[] args) {
		String file = "/home/temp/Java.class";
		
		// 1. split
			String[] arr = file.split("/");
			System.out.println(arr.length);
			for (String string : arr) {
				if(string.equals("") != true) {
					System.out.println("/" + string);
				}			
			}
			// 2. substring (+ indexOf)
			int idx = 0; // 시작위치
			int e_idx = 0; //마지막위치
			while(true) {
				e_idx = file.indexOf("/", idx);
				// 슬래쉬 찾지 못하는 경우
				if(e_idx == -1) {
					System.out.println( file.substring(idx));
					break;
				}
				System.out.println( file.substring(idx, e_idx) );
				idx = e_idx;
				idx++;
			}
	}
}