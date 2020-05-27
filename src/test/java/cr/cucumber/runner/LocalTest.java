package cr.cucumber.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import cr.testbase.BrowserStackSerenityTest;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/local.feature")
public class LocalTest extends BrowserStackSerenityTest {
}
