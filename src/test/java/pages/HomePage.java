package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by mykola on 7/19/2016.
 */
public class HomePage extends BasePage {
    private WebElement accountSettingsTab = driver.findElement(By.cssSelector(".account-settings-tab"));
}
