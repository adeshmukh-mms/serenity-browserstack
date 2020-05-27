package cr.steps;




import cr.pages.ui.GooglePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GoogleSearchSteps {
    
	@Steps
	GooglePage googlePage;

    @When("I type query {string}")
    public void search_google_for(String searchWord) throws Throwable {
        googlePage.launch("https://www.google.com/ncr");
        googlePage.searchForString(searchWord);
    }

    @When("I submit")
    public void thenSubmit() throws Throwable {
        googlePage.submitForm();
    }

    @Then("I should see title {string}")
    public void matchTitle(String matchTitle) throws Throwable {
        googlePage.titleShouldMatch(matchTitle);
    }
}
