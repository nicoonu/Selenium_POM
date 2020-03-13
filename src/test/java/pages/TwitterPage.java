package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TwitterPage extends BasePage{

    public TwitterPage(WebDriver d) { super(d); }

    By userName = By.name("session[username_or_email]");
    By password = By.name("session[password]");
    @FindBy (xpath = "//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/form/div/div[3]/div/div") WebElement signIn;

    public void setUser(String uN){
        writeText(userName, uN);
    }

    public void setPassword(String pW){
        writeText(password, pW);
    }

    public void clickSignIn(){
        signIn.click();
    }
}
