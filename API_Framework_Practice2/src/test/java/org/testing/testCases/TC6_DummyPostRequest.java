package org.testing.testCases;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.Helper.JsonParsingUsingJsonServer;
import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.HandleJSONFile;
import org.testing.Utilities.JSONReplacement;
import org.testing.Utilities.LoadPropertiess;
import org.testing.Utilities.RandomData;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC6_DummyPostRequest {
	//static String returnidValue;
	@Test
	public void PostRequest() throws IOException {
		Properties pr=LoadPropertiess.LoadProperties("../API_Framework_Practice2/URI.properties");
		String bodyData=HandleJSONFile.LoadJSONFile("../API_Framework_Practice2/src/main/java/org/testing/Resources/dummyPayload.json");
		
	   
		String replacedData=JSONReplacement.replaceJsonData(bodyData, "id", RandomData.generateRandomData());
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.DummyPostRequest(replacedData,"Dummy_APIs");
		//returnidValue=JsonParsingUsingJsonServer.ExtractionId(res, "id");
}
}
