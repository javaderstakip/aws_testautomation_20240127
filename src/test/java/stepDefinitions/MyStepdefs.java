package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MyStepdefs {
    @Given("giris ekrarnina git")
    public void girisEkrarninaGit() {
        DriverSource.INSTANCE.getDriver().get("https://www.saucedemo.com/");
        DriverSource.INSTANCE.getDriver().manage().window().maximize();
    }

    @Then("pencereyi kapat")
    public void pencereyiKapat() {
        System.out.println("pencere kapandi..");
    }
}
