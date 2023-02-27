package org.tnsif.datetime;

import java.time.OffsetDateTime;
import java.time.OffsetTime;

public class Example3 {

	public static void main(String[] args) {
		
		OffsetTime t= OffsetTime.now();
		System.out.println(t);

		System.out.println();
		
		OffsetDateTime dt= OffsetDateTime.now();
		System.out.println(dt);
	}
}