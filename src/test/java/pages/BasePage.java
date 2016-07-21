package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {
    protected WebDriver driver;

    public BasePage() {
        this.driver = new FirefoxDriver();
    }
}
