package tests.us01;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.user.LoginPage;
import utilties.ConfigReader;
import utilties.Driver;

public class TC01_Login {


    @Test
    public void test_login() {
        login(ConfigReader.getProperty("GecerliEmail"),ConfigReader.getProperty("GecerliPassword"));
        LoginPage pageLogin=new LoginPage();
        Assert.assertTrue(pageLogin.link_basariliGirisCourses.isDisplayed());

    }
    @Test
    public void test_loginInstructor() {
        loginInsructor();
       //
        LoginPage pageLogin=new LoginPage();
       // Assert.assertTrue(pageLogin.link_basariliGirisCourses.isDisplayed());

    }

    public void login(String email,String password) {


        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        LoginPage pageLogin = new LoginPage();
        pageLogin.cookieAccept.click();
        pageLogin.link_homePageLogin.click();

        pageLogin.input_kullaniciEmail.sendKeys(email);
        pageLogin.input_password.sendKeys(password);

        pageLogin.button_login.click();


    }


    public void login() {


        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        LoginPage pageLogin = new LoginPage();
        pageLogin.cookieAccept.click();
        pageLogin.link_homePageLogin.click();

        pageLogin.input_kullaniciEmail.sendKeys(ConfigReader.getProperty("GecerliEmail"));
        pageLogin.input_password.sendKeys(ConfigReader.getProperty("GecerliPassword"));

        pageLogin.button_login.click();


    }

    public void loginInsructor() {


        Driver.getDriver().get(ConfigReader.getProperty("UrlBug"));

        LoginPage pageLogin = new LoginPage();
        pageLogin.cookieAccept.click();
        pageLogin.link_homePageLogin.click();

        pageLogin.input_kullaniciEmail.sendKeys(ConfigReader.getProperty("LoginInstructorEmail"));
        pageLogin.input_password.sendKeys(ConfigReader.getProperty("GecerliPassword"));

        pageLogin.button_login.click();


    }

    public void loginInstructor(String email,String password) {


        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        LoginPage pageLogin = new LoginPage();
        pageLogin.cookieAccept.click();
        pageLogin.link_homePageLogin.click();

        pageLogin.input_kullaniciEmail.sendKeys(email);
        pageLogin.input_password.sendKeys(password);

        pageLogin.button_login.click();


    }
}
