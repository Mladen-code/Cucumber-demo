package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Parameter_Example_Steps {
    WebDriver driver;

    public Parameter_Example_Steps(Common_Steps common_steps) {
        this.driver = common_steps.getDriver();
    }

    @Given("Open Gigatron homepage")
    public void openGigatronHomepage() {
        driver.get("https://gigatron.rs/");
    }
    @When("I click on search field")
    public void iClickOnSearchField() {
        driver.findElement(By.cssSelector("#header__center__searchbox input[type=text]")).click();
    }
    @And("Type umbrella")
    public void typeUmbrella() {
        driver.findElement(By.cssSelector("#header__center__searchbox input[type=text]")).sendKeys("Umbrella");
    }
    @And("Type {string}")
    public void typeSearchTerm(String searchTerm) {
        driver.findElement(By.cssSelector("#header__center__searchbox input[type=text]")).sendKeys(searchTerm);
    }
    @Then("Page with results is opened")
    public void pageWithResultsIsOpened() {
        System.out.println("Page with results is opened");
    }

    @Given("Open Ebay advanced search page")
    public void openEbayAdvancedSearchPage() {
        driver.get("https://www.ebay.com/sch/ebayadvsearch");
    }
    @When("I advance search an item")
    public void iAdvanceSearchAnItem(DataTable dataTable) {
        driver.findElement(By.cssSelector("#_nkw")).sendKeys(dataTable.cell(1,0));
        driver.findElement(By.cssSelector("#_ex_kw")).sendKeys(dataTable.cell(1,1));
        driver.findElement(By.xpath("//input[@name='_udlo']")).sendKeys(dataTable.cell(1,2));
        driver.findElement(By.xpath("//input[@name='_udhi']")).sendKeys(dataTable.cell(1,3));
        driver.findElement(By.cssSelector("div.adv-form__actions > button")).click();
    }
}
