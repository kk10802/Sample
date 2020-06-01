public class Split {
	public static void main(String[] args) {
		String str = "Java Secure Coding";
		String[] strs = str.split(" ");
		for (int i = 0; i < strs.length; i++) {
			
		}
		// for-each
		for (String s : strs) {
			System.out.println(s);
		}
	}
}