package com.rev.service;

import java.util.HashMap;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.Map;

//import net.sf.json.JSONObject;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@Component
public class WelcomeService{
	public Map<String,String> retreiveMessage() {
		 HashMap<String, String> map = new HashMap<>();
		    map.put("key", "value");
		    map.put("foo", "bar");
		    map.put("aa", "bb");
		    return map;
	}
	
	public JSONObject retreiveASN() {
		    JSONObject json = null;
		    String myJsonString = "{\"document\":{\"type\":\"instance\",\"namespace\":\"fulfillment.storage.client\",\"id\":\"container-order-details\",\"version\":\"7.0\"},\"node\":{\"nodeId\":5505,\"countryCode\":\"US\"},\"order\":{\"custOrdNbr\":\"1561434566466\",\"fulfillOrdDueTime\":\"2019-06-28T05:00:00.0000 +0000\",\"localFulfillOrdDueTime\":\"2019-06-28T00:00:00.0000 -0500\",\"fulfillOrdNbr\":4474277434434,\"fulfillOrdStatusDesc\":\"IN TRANSIT\",\"isIntentToCancel\":\"N\",\"isReceiveDamage\":\"TRUE\",\"packageId\":\"12345680062647011337\",\"pkgTrackingNbr\":\"911003133756274369\",\"dspnsMethodDesc\":\"PICKUP IN STORE\",\"containerScanRequired\":false,\"cntrDetails\":[],\"customer\":[{\"firstName\":\"TEST\",\"lastName\":\"USER\",\"type\":\"ordered\",\"phone\":[{\"number\":\"(000)000-0000\",\"type\":\"primary\"}]}]}}\n" + 
		    		"";
			try {
				json = (JSONObject) new JSONParser().parse(myJsonString);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    return json;
	}
	
	public JSONObject retreiveDefaultPrinters() {
	    JSONObject json = null;
	    String myJsonString = "{\"document\":{\"type\":\"instance\",\"namespace\":\"fulfillment.node.commons\",\"id\":\"printers.defaultStorePrinter\",\"version\":\"1.0\"},\"node\":{\"nodeId\":\"5505\",\"countryCode\":\"US\"},\"defaultPrinter\":{\"name\":\"pr2\",\"ipAddress\":\"172.30.79.12\",\"hostName\":\"pr2\",\"lastUpdatedByUserId\":\"AAMANZO\",\"lastUpdateTS\":1560333236000}}";
		try {
			json = (JSONObject) new JSONParser().parse(myJsonString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return json;
}
}