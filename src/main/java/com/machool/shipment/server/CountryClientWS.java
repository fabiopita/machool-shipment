package com.machool.shipment.server;


import org.springframework.web.client.RestTemplate;

import com.machool.shipment.model.Country;

public class CountryClientWS {
	
	public String getCountryRest(String countryName) {
		String link = "https://restcountries.eu/rest/v2/name/" + countryName;
		RestTemplate restTemplate = new RestTemplate();
		Country[] countries = restTemplate.getForObject(link, Country[].class);
		if (countries.length > 0) 
			return countries[0].getAlpha2Code();
		else 
			return "";
	}
	
	
	
}
