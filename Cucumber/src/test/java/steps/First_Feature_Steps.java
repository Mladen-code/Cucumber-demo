package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class First_Feature_Steps {
    WebDriver driver;

    public First_Feature_Steps(Common_Steps common_steps) {
    this.driver = common_steps.getDriver();
    }

    @Given("Open website one homepage")
    public void openWebsiteOneHomepage() {
        System.out.println("Homepage 1 is opened");
        driver.get("https://www.saucedemo.com");
    }
    @Given("Open website two homepage")
    public void openWebsiteTwoHomepage() {
        System.out.println("Homepage 2 is opened");
        driver.get("https://www.saucedemo.com");
    }
    @Given("Open website three homepage")
    public void openWebsiteThreeHomepage() {
        System.out.println("Homepage 3 is opened");
        driver.get("https://www.saucedemo.com");
    }
    @When("I click on login button")
    public void iClickOnLoginButton() {
        System.out.println("Login button is clicked");
    }
    @Then("Login page is opened")
    public void loginPageIsOpened() {
        System.out.println("Login form is opened");
    }

}
