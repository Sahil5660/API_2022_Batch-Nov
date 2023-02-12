package org.testing.Utilities;

import java.util.regex.Pattern;

import org.json.JSONObject;

public class JSONReplacement {
	
	public static String replaceJsonData(String jsonBody,String VariableKeyName,String VariableKeyValue) {
		jsonBody=jsonBody.replaceAll(Pattern.quote("{{"+VariableKeyName+"}}"), VariableKeyValue);
		return jsonBody.toString();
		
	}

}
