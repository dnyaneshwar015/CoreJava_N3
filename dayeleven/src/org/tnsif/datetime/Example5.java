package org.tnsif.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example5 {

	public static void main(String[] args) {
//		String x="25-02-2023 15:52";
//		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yy HH:mm");
		
		LocalDateTime l=LocalDateTime.now();
		DateTimeFormatter df=DateTimeFormatter.ofPattern("MM-dd-yy HH:mm");//<<--date time sequence print
		String x=l.format(df);
		System.out.println(x);
	}
}
