package com.wipro.weather.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

	@GetMapping("/weather")
	String showWeather(@RequestParam String city, @RequestParam String day) {
		return "Weather in " + city + " for " + day + " is cloudy"; 
	}
	
	@GetMapping("/tocentigrade/{fahrenheit}")
	String convertToCentigrade(@PathVariable double fahrenheit) {
		double centigrade = (fahrenheit - 32) * 5 / 9;
		return "Centigrade : " + centigrade + " C";
	}
	
}
