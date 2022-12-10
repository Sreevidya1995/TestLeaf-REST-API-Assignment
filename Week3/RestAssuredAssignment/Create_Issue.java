package jira.issue.assignment;

import java.io.File;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class Create_Issue extends Base_Class {
	@Test
	public void createAnIssue() {
		File createIssue = new File("./src/test/resources/Jira_CreateIssue/CreateIssue.json");

		response = request.body(createIssue).post("issue");

		// Assertions
		response.then().assertThat().statusCode(201).body(Matchers.containsString("id"))
				.body(Matchers.containsString("key"));

		// Getting the issue details in the response
		Issue_Id = response.jsonPath().get("id");
		Issue_Key = response.jsonPath().get("key");
		// System.out.println(Issue_Key + " and " + Issue_Id);
	}
}
