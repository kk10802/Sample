import java.util.Calendar;

public class CalendarExam {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = c.get(Calendar.MONTH) + 1;
		System.out.println(month);
		
		int max = c.getActualMaximum(Calendar.DATE);
		for(int i = 1; i <= max; i++) {
			
			System.out.print(" " + (i < 10 ? "0"+i : i));
			if(i % 7 == 0) {
				System.out.println();
			}
		}
		
		
	}

}
