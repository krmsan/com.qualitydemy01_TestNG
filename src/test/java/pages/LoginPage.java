package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilties.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement link_homePageLogin;//yorum eklenebilir

    @FindBy(id="login-email")
    public WebElement input_kullaniciEmail;

    @FindBy(id="login-password")
    public WebElement input_password;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement button_login;

    @FindBy(linkText = "My courses")
    public WebElement link_basariliGirisCourses;

    @FindBy(xpath = "//*[text()='Accept']")
    public WebElement cookieAccept;

}
