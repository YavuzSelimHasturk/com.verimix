package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class Pages {

    public Pages() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//span[@class='elementor-grid-item'])[1]")
    public WebElement LinkedinIcon;

    @FindBy(id ="ember29")
    public WebElement VerimixHeadline;

    @FindBy(xpath = "(//button[@aria-label='Kapat'])[1]")
    public WebElement CloseIconPopUp;

    @FindBy(id = "organization_guest_contextual-sign-in")
    public WebElement PopUp;
}

