package jira.issue.assignment;
//
//import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class Search_All_Issues extends Base_Class{
	
	@Test
	public void searchAllIssues() {
		response = request.queryParam("jql", "project=\"NOVBatch\"").get("search");

		// Assertions
		response.then().assertThat().statusCode(200);
		
		//Value for chaining
		JsonPath jsonResponse = response.jsonPath();
		listOfIssuesId = jsonResponse.getList("issues.id");		
		listOfIssuesKey = jsonResponse.getList("issues.key");	
	}

}
