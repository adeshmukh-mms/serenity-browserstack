package cr.cucumber.runner;

import cr.testbase.BrowserStackSerenityTest;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features"},
glue = {"cr.steps","cr.testbase","cc.pages.ui"})
public class ParallelChromeTest extends BrowserStackSerenityTest {
}
