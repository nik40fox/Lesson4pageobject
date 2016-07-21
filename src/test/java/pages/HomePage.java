package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by mykola on 7/19/2016.
 */
public class HomePage extends BasePage {

    @FindBy(css = ".account-settings-tab")
    private WebElement accountSettingsTab;

    public HomePage() {
        PageFactory.initElements(driver, this);

    }

    public boolean isAccountSettingsTabDisplayed(){
        return accountSettingsTab.isDisplayed();

    }

}
