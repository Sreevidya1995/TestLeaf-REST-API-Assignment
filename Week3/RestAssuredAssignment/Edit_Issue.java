package jira.issue.assignment;

import java.io.File;

import org.testng.annotations.Test;

public class Edit_Issue extends Base_Class {
	@Test(dependsOnMethods = {"jira.issue.assignment.Create_Issue.createAnIssue"})
	public void editAnIssueUsingIssueId() {
		File editUsingIssueId = new File("./src/test/resources/Jira_CreateIssue/EditIssue_IssueId.json");

		response = request.body(editUsingIssueId).put("issue/" + Issue_Id);

		// Assertions
		response.then().assertThat().statusCode(204).statusLine("HTTP/1.1 204 No Content");
	}
	
	@Test(dependsOnMethods = {"jira.issue.assignment.Create_Issue.createAnIssue"})
	public void editAnIssueUsingIssueKey() {
		File editUsingIssueKey = new File("./src/test/resources/Jira_CreateIssue/EditIssue_IssueKey.json");

		response = request.body(editUsingIssueKey).put("issue/" + Issue_Key);

		// Assertions
		response.then().assertThat().statusCode(204).statusLine("HTTP/1.1 204 No Content");
	}

}
