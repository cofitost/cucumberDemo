package selab.cofitost.cucumberDemo;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GreetingStepdefs {
  Hello hello = null;
  String hi = null;

  @Given("I have an application with {string}")
  public void I_have_a_greeting_application_with(String arg1) {
    hello = new Hello(arg1);
  }

  @When("^I ask it to say hi$")
  public void I_ask_it_to_say_hi() {
    hi = hello.sayHi();
  }

  @Then("I receive {string}")
  public void I_receive(String arg1) {
    assertEquals(arg1, hi);
  }
}