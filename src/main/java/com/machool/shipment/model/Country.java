package com.machool.shipment.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

public class Country implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String name;           
	private String capital;
	private List<String> altSpellings; 
	private String relevance;      
	private String region;         
	private String subregion;
	private HashMap<String, String > translations;
	private String population; 
	private List<Float> latLng;      
	private String demonym;        
	private String area;           
	private String gini;           
	private List<String> timezones;    
	private List<String> borders;      
	private String nativeName;     
	private List<String> callingCodes; 
	private List<String> topLevelDomain;
	private String alpha2Code;     
	private String alpha3Code;   
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public List<String> getAltSpellings() {
		return altSpellings;
	}
	public void setAltSpellings(List<String> altSpellings) {
		this.altSpellings = altSpellings;
	}
	public String getRelevance() {
		return relevance;
	}
	public void setRelevance(String relevance) {
		this.relevance = relevance;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getSubregion() {
		return subregion;
	}
	public void setSubregion(String subregion) {
		this.subregion = subregion;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}
	public List<Float> getLatLng() {
		return latLng;
	}
	public void setLatLng(List<Float> latLng) {
		this.latLng = latLng;
	}
	public String getDemonym() {
		return demonym;
	}
	public void setDemonym(String demonym) {
		this.demonym = demonym;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getGini() {
		return gini;
	}
	public void setGini(String gini) {
		this.gini = gini;
	}
	public List<String> getTimezones() {
		return timezones;
	}
	public void setTimezones(List<String> timezones) {
		this.timezones = timezones;
	}
	public List<String> getBorders() {
		return borders;
	}
	public void setBorders(List<String> borders) {
		this.borders = borders;
	}
	public String getNativeName() {
		return nativeName;
	}
	public void setNativeName(String nativeName) {
		this.nativeName = nativeName;
	}
	public List<String> getCallingCodes() {
		return callingCodes;
	}
	public void setCallingCodes(List<String> callingCodes) {
		this.callingCodes = callingCodes;
	}
	public List<String> getTopLevelDomain() {
		return topLevelDomain;
	}
	public void setTopLevelDomain(List<String> topLevelDomain) {
		this.topLevelDomain = topLevelDomain;
	}
	public String getAlpha2Code() {
		return alpha2Code;
	}
	public void setAlpha2Code(String alpha2Code) {
		this.alpha2Code = alpha2Code;
	}
	public String getAlpha3Code() {
		return alpha3Code;
	}
	public void setAlpha3Code(String alpha3Code) {
		this.alpha3Code = alpha3Code;
	}
	public HashMap<String, String> getTranslations() {
		return translations;
	}
	public void setTranslations(HashMap<String, String> translations) {
		this.translations = translations;
	}

}
