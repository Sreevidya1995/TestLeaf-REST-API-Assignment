package jira.issue.assignment;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class Search_All_IssueTypes extends Base_Class{
	
	@Test
	public void searchIssueTypes() {
		response = request.get("issuetype");

		// Assertions
		response.then().assertThat().statusCode(200);
		
		//Value for chaining
		JsonPath jsonResponse = response.jsonPath();
		listOfIssueTypesId = jsonResponse.getList("id");	
	}

}
