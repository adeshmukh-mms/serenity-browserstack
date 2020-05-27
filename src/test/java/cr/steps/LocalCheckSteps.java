package cr.steps;


import cr.pages.ui.LocalPage;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;



public class LocalCheckSteps {
    
	@Steps
	LocalPage localPage;

    @Then("^I should see \"([^\"]*)\"$")
    public void matchTitle(String matchTitle) throws Throwable {
        localPage.open();
        localPage.bodyShouldMatch(matchTitle);
    }
}
