package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DriverSteps {
    private WebDriver driver;

    @Given("Entrando na página de cadastro(exemplo do próprio selenium)")
    public void entering_the_page() {
        driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
    }

    @When("Prenchendo o Textinput {string} com {string}")
    public void sending_the_value_to_txtField(String field, String valor) {
        driver.findElement(By.id(field)).sendKeys(valor);
    }

    @And("Clicando no botão {string}")
    public void click_the_button(String button) {
        driver.findElement(By.cssSelector(button)).click();
    }

    @Then("Devo receber a mensagem {string}")
    public void check_the_answer(String message) {
        var answer = driver.findElement(By.id(message)).getText();
        assert answer.equals(message);

        driver.quit();
    }
}
