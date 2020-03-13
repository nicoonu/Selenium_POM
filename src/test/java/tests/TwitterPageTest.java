package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.TwitterPage;

public class TwitterPageTest extends BaseTest{

    @Test
    public void logInTw() throws Exception {
        HomePage homePage = new HomePage(driver);
        TwitterPage twitterPage = PageFactory.initElements(driver, TwitterPage.class);
        homePage.goTo("https://twitter.com/login");

        twitterPage.setUser("Nicolas"); twitterPage.setPassword("123");
        twitterPage.clickSignIn();
    }

}
