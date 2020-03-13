package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver d) {
        this.driver = d;
    }

    /* Metodo click */
    public void click(By elementBy) {
        driver.findElement(elementBy).click();
    }

    /* Metodo escribir texto */
    public void writeText(By elementBy, String text) {
        driver.findElement(elementBy).sendKeys(text);
    }

    /* Metodo leer texto */
    public String readText(By elementBy) {
        return driver.findElement(elementBy).getText();
    }
}