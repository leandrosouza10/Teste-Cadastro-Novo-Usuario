package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class LoginPage extends Utils {
    WebDriver driver;
    private By createEmail = By.id("email_create");
    private By createEmailButton = By.id("SubmitCreate");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void acessarTelaLogin(){
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        waitPresent(createEmail,15);
    }
    public void cadastrarEmail(){
        driver.findElement(createEmail).sendKeys(randomEmail());

    }

    public void clicarBotao(){
        driver.findElement(createEmailButton).click();

    }
}
