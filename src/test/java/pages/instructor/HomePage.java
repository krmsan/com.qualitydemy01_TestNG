package pages.instructor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilties.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "")
    public WebElement xxx;


@FindBy(xpath = "//*[text()='Log in']")
    public WebElement button_abc;



    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement button_abcdef;
}
