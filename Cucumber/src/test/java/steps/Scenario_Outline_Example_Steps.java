package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Scenario_Outline_Example_Steps {
    WebDriver driver;

    public Scenario_Outline_Example_Steps(Common_Steps common_steps) {
        this.driver = common_steps.getDriver();
    }

    @Given("Open Sauce Demo Homepage")
    public void open_sauce_demo_homepage() {
        driver.get("https://www.saucedemo.com");
    }
    @When("I type {string} and {string}")
    public void iTypeUsernameAndPassword(String username, String password) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }
    @When("I click on the login button")
    public void i_click_on_the_login_button() {
        driver.findElement(By.id("login-button")).click();
    }
    @Then("Home page will be opened")
    public void home_page_will_be_opened() {
        Assert.assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl().trim());
    }
    @When("I type username and password")
    public void iTypeUsernameAndPassword() {
        System.out.println("Test promenljivih");
    }
}
