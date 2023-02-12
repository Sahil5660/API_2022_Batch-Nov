package org.testing.TestSteps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class HTTPMethods {
	Properties pr;
	public HTTPMethods(Properties pr) {
		this.pr=pr;
	}
	public Response PostRequest(String BodyData,String URIKey) {
		
		String URIValue=pr.getProperty(URIKey);
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(BodyData)
		.when()
		.post(URIValue);
		System.out.println("Status code is "+res.statusCode());
		System.out.println("Response is "+res.asString());
		return res;
		
		
	}
	
	public Response GetAllRequest(String URIKey) {
		String URIValue=pr.getProperty(URIKey);
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(URIValue);
				System.out.println("Status code is "+res.statusCode());
				System.out.println("Response is "+res.asString());
				return res;
	}
	public Response GetParticular(String URIKey,String endPoint) {
		String URIValue=pr.getProperty(URIKey)+"/"+endPoint;
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(URIValue);
				System.out.println("Status code is "+res.statusCode());
				System.out.println("Response is "+res.asString());
				return res;
	}
	public Response UpdateRecord(String BodyData,String URIKey,String endPoint) {
		String URIValue=pr.getProperty(URIKey)+"/"+endPoint;
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(BodyData)
				.when()
				.put(URIValue);
				System.out.println("Status code is "+res.statusCode());
				System.out.println("Response is "+res.asString());
				return res;
	}
	public Response DeleteRecord(String URIKey,String endPoint) {
		String URIValue=pr.getProperty(URIKey)+"/"+endPoint;
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.delete(URIValue);
				System.out.println("Status code is "+res.statusCode());
				System.out.println("Response is "+res.asString());
				return res;
	}
public Response DummyPostRequest(String BodyData,String URIKey) {
		
		String URIValue=pr.getProperty(URIKey);
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(BodyData)
		.when()
		.post(URIValue);
		System.out.println("Status code is "+res.statusCode());
		System.out.println("Response is "+res.asString());
		return res;
		
		
	}
public Response GetAllRequestEmployee(String URIKey) {
	String URIValue=pr.getProperty(URIKey);
	Response res=
			given()
			.contentType(ContentType.JSON)
			.when()
			.get(URIValue);
			System.out.println("Status code is "+res.statusCode());
			System.out.println("Response is "+res.asString());
			return res;
}
public Response GetParticularFromDummy(String URIKey,String endPoint) {
	String URIValue=pr.getProperty(URIKey)+"/"+endPoint;
	Response res=
			given()
			.contentType(ContentType.JSON)
			.when()
			.get(URIValue);
			System.out.println("Status code is "+res.statusCode());
			System.out.println("Response is "+res.asString());
			return res;
}
}
