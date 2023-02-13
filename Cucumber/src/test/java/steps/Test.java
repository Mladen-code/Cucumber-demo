package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Test {
    @Given("Open page")
    public void openPage() {
        System.out.println("Nesto");
    }

    @When("Do something")
    public void doSomething() {

    }
}
