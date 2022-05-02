package steps;

import core.Browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HubStandard;
import pages.RiskAndIssueSubmission;

import java.text.BreakIterator;
import java.time.Duration;

public class RiskSteps extends HubStandard {


    @Given("I am on home page as a logged in user")
    public void iAmOnHomePageAsALoggedInUser() {
          Assert.assertTrue(HubStandard.onPage());
    }

    @When("I create risk with {string} data")
    public void iCreateRiskWithData(String data) {
        HubStandard.navigateToRisk();
        RiskAndIssueSubmission.createNewRisk(data);
    }

    @Then("I should see details are reflecting in dashboard")
    public void iShouldSeeDetailsAreReflectingInDashboard() {

    }

}
