package steps;


import core.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {

    @Before
    public void beforeScenario(Scenario scenario) {
        System.out.println("Scenario Started: " + scenario.getName());
        Browser.startDriver();
        Browser browser =  new Browser();
        browser.login();
        System.out.println("Logged in Successfully");
    }

    @After
    public void afterScenario(Scenario scenario){
        System.out.println("Scenario Ended: " + scenario.getName());
        Browser.quitDriver();
    }


}
