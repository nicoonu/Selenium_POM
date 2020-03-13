package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver d) {
        super(d);
    }

    public void goTo(String URL){
        driver.get(URL);
    }
}
