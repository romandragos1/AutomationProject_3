package Pages;

import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmptyTrashFolderPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public EmptyTrashFolderPage(WebDriver driver) {
        this.driver = driver;
        this.elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/div[1]/nav/div/div[3]/div[3]/ul/li[8]/div/a/span[1]/span")
    private WebElement cosGunoiEmailButton;

    @FindBy(xpath = "//span[@title='Golire folder de resturi']")
    private WebElement golireCosGunoiEmailButton;

    @FindBy(xpath = "//button[normalize-space()='OK']")
    private WebElement confirmareGolireCosGunoiEmailButton;

    public void emptyTrashFolder_Yahoo() {
        loginYahoo();
        clickCosGunoiFolder();
        clickgolireCosGunoiFolder();
        confirmGolireCosGunoiFolder();
    }

    public void loginYahoo() {
        LoginYahooPage loginYahoo = new LoginYahooPage(driver);
        loginYahoo.login_Yahoo("fake.test.mail.automation@gmail.com", "aut123!@#sDf");
    }

    public void clickCosGunoiFolder() {
        elementMethods.clickElement(cosGunoiEmailButton);
    }

    public void clickgolireCosGunoiFolder() {
        elementMethods.clickElement(golireCosGunoiEmailButton);
    }

    public void confirmGolireCosGunoiFolder() {
        elementMethods.clickElement(confirmareGolireCosGunoiEmailButton);
    }
}
