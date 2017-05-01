package com.machool.shipment.server;

import org.springframework.web.client.RestTemplate;

public class CountryClientWS {
	
	public String getCountry(String countryName) {
		String link = "https://restcountries.eu/rest/v2/name/" + countryName;
		RestTemplate restTemplate = new RestTemplate();
	    String country = restTemplate.getForObject(link, String.class);
	    country = country.substring(country.indexOf("alpha2Code")+13, country.indexOf("alpha2Code")+15);
	    return country;
	}
}
