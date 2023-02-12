package org.testing.Helper;

import io.restassured.response.Response;

public class JsonParsingUsingJsonServer {
public static String ExtractionId(Response res,String JsonPath) {
	String ExtractedValue=res.jsonPath().get(JsonPath);
	return ExtractedValue;
	
	
}
}
