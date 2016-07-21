package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Page Object for Registration Page
 */
public class LoginAndRegistrationPage extends BasePage {
    private WebElement firstNameField = driver.findElement(By.id("first-name"));
    private WebElement lastNameField = driver.findElement(By.id("last-name"));
    private WebElement emailField = driver.findElement(By.id("join-email"));
    private WebElement passwordField = driver.findElement(By.id("join-password"));
    private WebElement joinNowButton = driver.findElement(By.className("btn btn-primary join-btn"));
    private WebElement alertText = driver.findElement(By.cssSelector(".uno-alert.error.hidden>p>strong"));
    private WebElement loginEmailField = driver.findElement(By.id("login-email"));
    private WebElement loginPasswordField = driver.findElement(By.id("login-password"));
    private WebElement signInButton = driver.findElement(By.cssSelector(".login-form>input"));

    public LoginAndRegistrationPage() {
        driver.get("https://www.linkedin.com/");
        PageFactory.initElements(driver, LoginAndRegistrationPage.class);
    }

    /**
     * Fill registration form
     * @param firstName - user First Name
     * @param lastName - user Last Name
     * @param email - user email
     * @param password - user password
     */
    public void fillRegistrationForm ( String firstName, String lastName, String email, String password) {
        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
    }

    public HomePage login (String email, String password){
        loginEmailField.sendKeys(email);
        loginPasswordField.sendKeys(password);
        signInButton.click();
        return new HomePage();
    }

    public void clickJoinNowButton (){
        joinNowButton.click();
    }

    public void fillAndSubmitRegistrationForm (String firstName, String lastName, String email, String password){
        fillRegistrationForm(firstName, lastName, email, password);
        clickJoinNowButton();
    }

    public String getAlertText () {
        return alertText.getText();
    }
}
