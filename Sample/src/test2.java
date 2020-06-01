
public class test2 {
	public static void main(String[] args) {
		String s = " ";
		System.out.println(System.currentTimeMillis());
		for(int i = 1; i < 50000; i++) {
			s += i;
		}
		System.out.println(System.currentTimeMillis());
		
		StringBuffer sb = new StringBuffer();
		for(int i = 1; i < 50000000; i++) {
			sb.append(i);
		}
		System.out.println(System.currentTimeMillis());
	}

}
