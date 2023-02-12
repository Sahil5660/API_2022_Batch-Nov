package org.testing.testCases;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.LoadPropertiess;
import org.testng.annotations.Test;

public class TC8_GetParticularFromDummy {
	@Test
	public void TC8() throws IOException {
		Properties pr=LoadPropertiess.LoadProperties("../API_Framework_Practice2/URI.properties");
		HTTPMethods http=new HTTPMethods(pr);
		System.out.println("TC8 Result");
		http.GetParticularFromDummy("DummyURIGetAllEmployee","1");
	}

}
