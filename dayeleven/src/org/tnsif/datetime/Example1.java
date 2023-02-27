package org.tnsif.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Example1 {

	public static void main(String[] args) {
		LocalDate d=LocalDate.now();
		LocalTime t=LocalTime.now();
		LocalDateTime dt=LocalDateTime.now();
		LocalDate obj=LocalDate.of(2023, 2, 25);
		
		System.out.println(d);//today date print-->>2023-02-18
		System.out.println(t);//latest time print-->>08:32:08.898433700
		System.out.println();
		System.out.println(dt);//print date & time in one way
		System.out.println();
		System.out.println(obj);//any date u want to print
	}
}
/*OUTPUT
2023-02-20
08:44:27.451228100

2023-02-20T08:44:27.451228100

2023-02-25
*/