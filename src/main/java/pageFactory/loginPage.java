package pageFactory;

import org.openqa.selenium.By;

public class loginPage {


   public static By username = By.xpath("//input[@name='email']");
   public static By password = By.xpath("//input[@name='password']");
   public static By submitButton = By.xpath("//button[text()='Sign In on Trademo']");
   public static By confirmButton = By.xpath("//button[text()='Confirm and Sign In']");

}
