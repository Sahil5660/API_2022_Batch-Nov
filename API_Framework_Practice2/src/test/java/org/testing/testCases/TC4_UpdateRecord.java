package org.testing.testCases;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.HandleJSONFile;
import org.testing.Utilities.JSONReplacement;
import org.testing.Utilities.LoadPropertiess;
import org.testing.Utilities.RandomData;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC4_UpdateRecord {
	@Test
	public void UpdateRequest() throws IOException {
		Properties pr=LoadPropertiess.LoadProperties("../API_Framework_Practice2/URI.properties");
		String bodyData=HandleJSONFile.LoadJSONFile("../API_Framework_Practice2/src/main/java/org/testing/Resources/UpdatePayload.json");
		
	   
		String replacedData=JSONReplacement.replaceJsonData(bodyData, "id", TC1_PostRequest.idValue);
		HTTPMethods http=new HTTPMethods(pr);
		http.UpdateRecord(replacedData, "QA_URI_Environment", TC1_PostRequest.idValue);

}
}
