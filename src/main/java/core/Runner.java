package core;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        glue={"steps"},
        tags = "@regression and not @wip",
        plugin = {"json:target/cucumber-report/cucumber.json"},
        publish = true
)
public class Runner {

}