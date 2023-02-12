package org.testing.Utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonParsingUsingOrgJson {
	
	public static void ParsingIds(String Response, String KeyName) {
		JSONArray array=new JSONArray(Response);
		int length=array.length();
		
		for(int i=0;i<length;i++) {
			JSONObject ob=array.getJSONObject(i);
			System.out.println(ob.get(KeyName));
		}
	}

}
