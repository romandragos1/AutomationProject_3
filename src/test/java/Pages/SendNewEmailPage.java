package Pages;

import HelpMethods.ElementMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendNewEmailPage {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public SendNewEmailPage(WebDriver driver) {
        this.driver = driver;
        this.elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@aria-label='Compunere']")
    private WebElement compunereEmailButton;

    @FindBy(id = "message-to-field")
    private WebElement catreEmailField;

    @FindBy(xpath = "//button[normalize-space()='CC/BCC']")
    private WebElement ccBccEmailFieldButton;

    @FindBy(id = "message-cc-field")
    private WebElement ccEmailField;

    @FindBy(id = "message-bcc-field")
    private WebElement bccEmailField;

    @FindBy(xpath = "//input[@placeholder='Subiect']")
    private WebElement subiectEmailField;

    @FindBy(xpath = "//div[@aria-label='Corp mesaj']")
    private WebElement textBoxEmailField;

    @FindBy(css = "input[type='file']")
    private WebElement uploadedFile;

    @FindBy(xpath = "//span[normalize-space()='Trimitere']")
    private WebElement trimitereEmailButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/div[1]/nav/div/div[3]/div[3]/ul/li[5]/div/a/span[1]/span")
    private WebElement trimiseEmailFolder;

    public void SendNewEmail_Yahoo(String catre, String subiect, String textEmail) {
        loginYahoo();
        clickCompunereEmail();
        fillCatreEmail(catre);
        fillSubiectEmail(subiect);
        fillTextBoxEmail(textEmail);
        clickTrimitereEmail();
        clickTrimiseFolder();
    }

    public void SendNewEmailWithAttachment_Yahoo(String catre, String subiect, String textEmail, String fileDirectory) {
        loginYahoo();
        clickCompunereEmail();
        fillCatreEmail(catre);
        fillSubiectEmail(subiect);
        fillTextBoxEmail(textEmail);
        uploadFileDirectory(fileDirectory);
        clickTrimitereEmail();
        clickTrimiseFolder();
    }

    public void SendNewEmailWithCC_Yahoo(String catre, String cc, String subiect, String textEmail) {
        loginYahoo();
        clickCompunereEmail();
        clickCcBccEmail();
        fillCatreEmail(catre);
        fillCCEmailField(cc);
        fillSubiectEmail(subiect);
        fillTextBoxEmail(textEmail);
        clickTrimitereEmail();
        clickTrimiseFolder();
    }

    public void SendNewEmailWithBCC_Yahoo(String catre, String bcc, String subiect, String textEmail) {
        loginYahoo();
        clickCompunereEmail();
        clickCcBccEmail();
        fillCatreEmail(catre);
        fillBCCEmailField(bcc);
        fillSubiectEmail(subiect);
        fillTextBoxEmail(textEmail);
        clickTrimitereEmail();
        clickTrimiseFolder();
    }

    public void SendNewEmailWithCCAndBCC_Yahoo(String catre, String cc, String bcc, String subiect, String textEmail) {
        loginYahoo();
        clickCompunereEmail();
        clickCcBccEmail();
        fillCatreEmail(catre);
        fillCCEmailField(cc);
        fillBCCEmailField(bcc);
        fillSubiectEmail(subiect);
        fillTextBoxEmail(textEmail);
        clickTrimitereEmail();
        clickTrimiseFolder();
    }

    public void SendNewEmailWithCCBCCAndAttach_Yahoo(String catre, String cc, String bcc, String subiect,
                                                     String textEmail, String fileDirectory) {
        loginYahoo();
        clickCompunereEmail();
        clickCcBccEmail();
        fillCatreEmail(catre);
        fillCCEmailField(cc);
        fillBCCEmailField(bcc);
        fillSubiectEmail(subiect);
        fillTextBoxEmail(textEmail);
        uploadFileDirectory(fileDirectory);
        clickTrimitereEmail();
        clickTrimiseFolder();
    }

    public void loginYahoo() {
        LoginYahooPage loginYahoo = new LoginYahooPage(driver);
        loginYahoo.login_Yahoo("fake.test.mail.automation@gmail.com", "aut123!@#sDf");
    }

    public void clickCompunereEmail() {
        elementMethods.clickElement(compunereEmailButton);
    }

    public void fillCatreEmail(String value) {
        elementMethods.fillElement(catreEmailField, value);
    }

    public void clickCcBccEmail() {
        elementMethods.clickElement(ccBccEmailFieldButton);
    }

    public void fillCCEmailField(String value) {
        elementMethods.fillElement(ccEmailField, value);
    }

    public void fillBCCEmailField(String value) {
        elementMethods.fillElement(bccEmailField, value);
    }

    public void fillSubiectEmail(String value) {
        elementMethods.fillElement(subiectEmailField, value);
    }

    public void fillTextBoxEmail(String value) {
        elementMethods.fillElement(textBoxEmailField, value);
    }

    public void uploadFileDirectory(String value) {
        elementMethods.fillElement(uploadedFile, value);
    }

    public void clickTrimitereEmail() {
        elementMethods.clickElement(trimitereEmailButton);
    }

    public void clickTrimiseFolder() {
        elementMethods.clickElement(trimiseEmailFolder);
    }
}