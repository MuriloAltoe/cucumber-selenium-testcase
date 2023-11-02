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

    @Given("que estou na página de login")
    public void que_estou_na_página_de_login() {
        driver = new ChromeDriver();
        driver.get("https://exemplo.com/login");
    }

    @When("eu preencho o campo {string} com {string}")
    public void eu_preencho_o_campo_com(String campo, String valor) {
        driver.findElement(By.name(campo)).sendKeys(valor);
    }

    @And("eu clico no botão {string}")
    public void eu_clico_no_botão(String botao) {
        driver.findElement(By.name(botao)).click();
    }

    @Then("eu devo ser redirecionado para a página inicial")
    public void eu_devo_ser_redirecionado_para_a_página_inicial() {
        String paginaAtual = driver.getCurrentUrl();
        assert paginaAtual.equals("https://exemplo.com/pagina-inicial");
        driver.quit();
    }
}
