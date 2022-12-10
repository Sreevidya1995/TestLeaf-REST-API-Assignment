package jira.issue.assignment;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class Search_Issue extends Base_Class{
	
	@Test(dependsOnMethods = {"jira.issue.assignment.Create_Issue.createAnIssue"})
	public void searchIssueUsingIssueId() {
		response = request.get("issue/" + Issue_Id);

		// Assertions
		response.then().assertThat().statusCode(200).body("id",Matchers.containsString(Issue_Id));
	}
	
	@Test(dependsOnMethods = {"jira.issue.assignment.Create_Issue.createAnIssue"})
	public void searchIssueUsingIssueKey() {
		response = request.get("issue/" + Issue_Key);

		// Assertions
		response.then().assertThat().statusCode(200).body("key",Matchers.containsString(Issue_Key));
	}
}
