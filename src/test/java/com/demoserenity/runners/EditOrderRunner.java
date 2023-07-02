package com.demoserenity.runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.demoserenity.stepDefinition",
        plugin = {"pretty", "html:target/cucumber-reports"},
        tags = "@EditOrderSuccess",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class EditOrderRunner {

}
