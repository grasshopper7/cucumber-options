package glue.implicit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrdersStepDef {

   @Given("You are at the {word} ready to order")
   public void atCounterReadyToOrder(String pos) {
      System.out.println("You are at the "+pos+" ready to order.");
   }

   @When("You describe the order to the barista")
   public void coffeeOrderToBarista() {
      System.out.println("You describe the order to the barista.");
   }

   @Then("The barista prepares and brings the coffee order")
   public void baristaPreparesAndBringsCoffee() {
      System.out.println("The barista prepares and brings the coffee order.");
   }
}
