public class StrBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append(25);
		sb.append('Y').append(true);
		System.out.println(sb.toString());

		sb.insert(2, false);
		System.out.println(sb.toString());

		sb.insert(sb.length() - 1, 'Z');
		System.out.println(sb.toString());
	}
}