package org.testing.testCases;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.LoadPropertiess;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC7_DummyGetRequestAll {
	
	@Test
public void GetRequest() throws IOException {
		
		Properties pr=LoadPropertiess.LoadProperties("../API_Framework_Practice2/URI.properties");
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.GetAllRequestEmployee("DummyURIGetAllEmployee");
}
}