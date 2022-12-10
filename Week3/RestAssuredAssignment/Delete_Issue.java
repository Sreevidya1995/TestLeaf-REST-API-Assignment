package jira.issue.assignment;

import org.testng.annotations.Test;

public class Delete_Issue extends Base_Class{
	@Test(dependsOnMethods = {"jira.issue.assignment.Search_All_Issues.searchAllIssues"})
	public void deleteAnIssueUsingIssueId() {
		response = request.delete("issue/" + listOfIssuesId.get(25));

		// Assertions
		response.then().assertThat().statusCode(204).statusLine("HTTP/1.1 204 No Content");
		System.out.println("The Issue Key " +listOfIssuesId.get(25)+ " is deleted");
	}
	
	@Test(dependsOnMethods = {"jira.issue.assignment.Search_All_Issues.searchAllIssues"})
	public void deleteAnIssueUsingIssueKey() {
		response = request.delete("issue/" + listOfIssuesKey.get(32));

		// Assertions
		response.then().assertThat().statusCode(204).statusLine("HTTP/1.1 204 No Content");
		System.out.println("The Issue Key " +listOfIssuesKey.get(32)+ " is deleted");
	}

}
