package com.wipro.anonymous.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.function.Consumer;

public class TimezoneConsumerTest {

	public static void main(String[] args) {
		
		Consumer<ZonedDateTime> time = (zdt) -> {
			
			System.out.println(zdt);
		};
		
		ZoneId zone = ZoneId.of("Europe/London");
		ZonedDateTime zoneDateTime = ZonedDateTime.of(LocalDateTime.now(), zone);
		time.accept(zoneDateTime);

	}

}
