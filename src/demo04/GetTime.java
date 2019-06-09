package demo04;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;

public class GetTime {
	public static void main(String[] args) {
//		Calendar cal=Calendar.getInstance();
//		System.out.println("Calendar.YEAR:"+cal.get(Calendar.YEAR));
//		System.out.println("Calendar.MONTH:"+cal.get(Calendar.MONTH));
//		System.out.println("Calendar.DATE:"+cal.get(Calendar.DATE));
//		System.out.println("Calendar.HOUR_OF_DAY:"+cal.get(Calendar.HOUR_OF_DAY));
//		System.out.println("Calendar.MINUTE:"+cal.get(Calendar.MINUTE));
//		System.out.println("Calendar.SECOND:"+cal.get(Calendar.SECOND));
		

		
		LocalDateTime ss=LocalDateTime.now();
		ss.getSecond();

		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		//java8;
		LocalDateTime dt=LocalDateTime.now();
//		System.out.println("getYear():"+dt.getYear());
//		System.out.println("getMonth():"+dt.getMonth());
//		System.out.println("getMonth():"+dt.getMonth());
//		System.out.println("getHour():"+dt.getHour());
//		System.out.println("getMinute():"+dt.getMinute());
//		System.out.println("getSecond():"+dt.getSecond());
		

	}

}
