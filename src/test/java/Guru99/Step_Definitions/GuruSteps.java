package Guru99.Step_Definitions;

import Guru99.Pages.OrderPage;
import Guru99.Util.ConfigurationsReader;
import Guru99.Util.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class GuruSteps {

    OrderPage verify = new OrderPage();


    @Given("The user navigates to {string}")
    public void the_user_navigates_to(String string) {
        Driver.getDriver().get(ConfigurationsReader.getProperty("url"));

    }

    @When("The user verify the header contains {string}")
    public void the_user_verify_the_header_contains(String string) {

    }


}
