class IndexOf {
	public static void main(String args[]) {
		
		String str = "Java 개발자 양성을 통한 취업연계과정!!";
		int idx = -1;
		int count = 0;
		while(true) {
			idx = str.indexOf(" e ", idx + 1);
			if(idx == -1) break;
			idx++;
			
			count++;
		}
//		int idx = str.indexOf(" ");
//		System.out.println(idx);
//
//		idx = str.indexOf(" ", idx + 1);
//		System.out.println(idx);
		
		System.out.println(count);
	}
}