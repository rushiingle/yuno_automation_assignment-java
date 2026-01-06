package stepdefinitions;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import utils.ApiClient;
import utils.PayloadBuilder;

import static org.junit.Assert.assertEquals;

public class PurchaseSteps {

    Response response;
    String payload;

    @Given("a valid purchase request")
    public void valid_purchase_request() {
        payload = PayloadBuilder.minimalPurchase();
    }

    @Given("a purchase request with invalid card")
    public void invalid_card_request() {
        payload = PayloadBuilder.invalidCardPurchase();
    }

    @When("I send purchase request")
    public void send_purchase() {
        response = ApiClient.post("/payments", payload);
    }

    @Then("response status code should be {int}")
    public void validate_status(int status) {
        assertEquals(status, response.getStatusCode());
    }
}
