package jira.issue.assignment;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class Search_IssueType extends Base_Class{
	
	@Test(dependsOnMethods = {"jira.issue.assignment.Search_All_IssueTypes.searchIssueTypes"})
	public void searchIssueTypeUsingId() {
		response = request.get("issuetype/"+ listOfIssueTypesId.get(3));

		// Assertions
		response.then().assertThat().statusCode(200).body("id",Matchers.containsString(listOfIssueTypesId.get(3)));
	}
}
