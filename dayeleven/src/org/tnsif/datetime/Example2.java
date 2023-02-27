package org.tnsif.datetime;

import java.time.ZonedDateTime;

public class Example2 {

	public static void main(String[] args) {
		ZonedDateTime dt= ZonedDateTime.now();
		System.out.println(dt);
	}

}
//OUTPUT
//2023-02-20T08:50:31.188970500-08:00[America/Los_Angeles]