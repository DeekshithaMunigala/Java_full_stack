package com.wipro.collection;


import java.util.Map;
import java.util.TreeMap;

public class CurrencyCode {

	public static void main(String[] args) {
		Map<String, String> currencyCode = new TreeMap();
		currencyCode.put("INR", "Indian Rupee");
		currencyCode.put("USD", "United States dollar");
		currencyCode.put("AUD", "Australia dollar");
		currencyCode.put("KRW", "Korea won");
		
		for(Map.Entry<String, String> data:currencyCode.entrySet()) {
			System.out.println(data.getKey() + " : " + data.getValue());
		}

	}

}
