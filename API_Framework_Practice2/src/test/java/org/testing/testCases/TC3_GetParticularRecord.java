package org.testing.testCases;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.LoadPropertiess;
import org.testng.annotations.Test;

public class TC3_GetParticularRecord {
	@Test
	public void testCase3() throws IOException {
		Properties pr=LoadPropertiess.LoadProperties("../API_Framework_Practice2/URI.properties");
		HTTPMethods http=new HTTPMethods(pr);
		http.GetParticular("QA_URI_Environment", TC1_PostRequest.idValue);
	}
}
