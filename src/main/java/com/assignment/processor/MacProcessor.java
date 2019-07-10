package com.assignment.processor;

import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;

/**
 * Deals with information for mac address.
 * @author ChandanaMulpuri
 *
 */
public class MacProcessor {

	private static final String API = "https://api.macaddress.io/v1";
	
	public static String getMacInfo(String mac) {
		String response = null;
		try {
			JsonNode json = Unirest
				.get(API)
				.queryString("apiKey", "at_Tf3XUd4jCw9hyJmMz7wYk4MI4Yq5x")
				.queryString("output", "json")
				.queryString("search", mac)
				.asJson()
				.getBody();
			response = mac+ " : "+json.getObject().getJSONObject("vendorDetails").getString("companyName");
		}catch(Exception e) {
			response = String.format("%s : error while fetching mac information.", mac);
			e.printStackTrace();
		}
		return response;
	}
	
	
}
