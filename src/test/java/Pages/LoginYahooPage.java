package Pages;

import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginYahooPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public LoginYahooPage(WebDriver driver) {
        this.driver = driver;
        this.elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "login-username")
    private WebElement introduAdresaEmailField;

    @FindBy(id = "login-signin")
    private WebElement inainteButton1;

    @FindBy(id = "login-passwd")
    private WebElement introduParolaEmailField;

    @FindBy(id = "login-signin")
    private WebElement inainteButton2;

    @FindBy(id = "ybarMailLink")
    private WebElement mailButton;

    public void login_Yahoo(String emailAddress, String password) {
        insertAdresaEmail(emailAddress);
        clickInainte();
        insertPasswordEmail(password);
        clickInainte2();
        clickMailButton();
    }

    public void insertAdresaEmail(String value) {
        elementMethods.fillElement(introduAdresaEmailField, value);
    }

    public void clickInainte() {
        elementMethods.clickElement(inainteButton1);
    }

    public void insertPasswordEmail(String value) {
        elementMethods.fillElement(introduParolaEmailField, value);
    }

    public void clickInainte2() {
        elementMethods.clickElement(inainteButton2);
    }

    public void clickMailButton() {
        elementMethods.clickElement(mailButton);
    }
}