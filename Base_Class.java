package jira.issue.assignment;

import java.util.List;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Base_Class {
	static Response response = null;
	static RequestSpecification request = null;	
	static String Issue_Id = null;
	static String Issue_Key = null;
	static List<String> listOfIssuesId=null;
	static List<String> listOfIssuesKey=null;
	static List<String> listOfIssueTypesId=null;
	
	@BeforeMethod
	public void preConditions() {
		RestAssured.baseURI = "https://sreevidyaapi95.atlassian.net/rest/api/2/";
		RestAssured.authentication = RestAssured.preemptive().basic("sreevidya.hari95@gmail.com", "BZoFTaQrRIS1eWJ4j24r0875");
		request = RestAssured
							.given()
							.contentType(ContentType.JSON)
							.accept(ContentType.JSON)
							.log().all();
	}

	@AfterMethod
	public void postConditions() {
		response.then().log().all();
	}

}
