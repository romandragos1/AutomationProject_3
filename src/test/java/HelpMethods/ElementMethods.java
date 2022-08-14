package HelpMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementMethods {

    public WebDriver Driver;

    public ElementMethods(WebDriver driver) {
        Driver = driver;
    }

    public void clickElement(WebElement element) {
        element.click();
    }

    public void hoverElement(WebElement element) {
        Actions actions = new Actions(Driver);
        actions.moveToElement(element).build().perform();
    }

    public void fillElement(WebElement element, String value) {
        element.sendKeys(value);
    }

    public void selectTextElement(WebElement element, String value) {
        Select Dropdown = new Select(element);
        Dropdown.selectByVisibleText(value);
    }

    public void selectValueElement(WebElement element, String value) {
        Select Dropdown = new Select(element);
        Dropdown.selectByValue(value);
    }
}
