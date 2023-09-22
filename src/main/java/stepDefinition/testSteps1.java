package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageFactory.loginPage;

public class testSteps1 {

     WebDriver driver;
     loginPage lp;
     WebDriverWait wait;


    @Given("Launch browser")
    public void launch_browser() {

        driver=new ChromeDriver();

    }
    @When("Open URL {string}")
    public void open_url(String string) {

        driver.get(string);

    }

    @When("^Enter username as (.*)$")
    public void enter_username_as(String email) {

        driver.findElement(loginPage.username).sendKeys(email);

    }
    @When("^Enter password as (.*)$")
    public void enter_password_as(String password) {

        driver.findElement(loginPage.password).sendKeys(password);

    }
    @When("Clicks on Submit button and Confirm")
    public void Clicks_on_Submit_button_and_Confirm() throws InterruptedException {

        driver.findElement(loginPage.submitButton).click();
//        wait = new WebDriverWait (driver, Duration.ofSeconds(100));
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(lp.confirmButton));
        Thread.sleep(5000);
        driver.findElement(loginPage.confirmButton).click();

    }

    @Then("User lands on India Imports shipments")
    public void User_lands_on_India_Imports_shipments() {


    }




}
