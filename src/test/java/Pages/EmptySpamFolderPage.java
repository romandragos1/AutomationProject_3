package Pages;

import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmptySpamFolderPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public EmptySpamFolderPage(WebDriver driver) {
        this.driver = driver;
        this.elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/div[1]/nav/div/div[3]/div[3]/ul/li[7]/div/a/span[1]/span")
    private WebElement spamEmailButton;

    @FindBy(xpath = "//span[@title='Golire folder de spam']")
    private WebElement golireSpamEmailButton;

    @FindBy(xpath = "//button[normalize-space()='OK']")
    private WebElement confirmareGolireSpamEmailButton;

    public void emptySpamFolder_Yahoo() {
        loginYahoo();
        clickSpamFolder();
        clickGolireSpamFolder();
        confirmGolireSpamFolder();
    }

    public void loginYahoo() {
        LoginYahooPage loginYahoo = new LoginYahooPage(driver);
        loginYahoo.login_Yahoo("fake.test.mail.automation@gmail.com", "aut123!@#sDf");
    }

    public void clickSpamFolder() {
        elementMethods.clickElement(spamEmailButton);
    }

    public void clickGolireSpamFolder() {
        elementMethods.clickElement(golireSpamEmailButton);
    }

    public void confirmGolireSpamFolder() {
        elementMethods.clickElement(confirmareGolireSpamEmailButton);
    }
}
