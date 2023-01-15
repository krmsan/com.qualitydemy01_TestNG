package tests.us01;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.user.LoginPage;
import utilties.ConfigReader;
import utilties.Driver;

public class TC01_Login {


    @Test
    public void test_login() {
        login();
        LoginPage pageLogin=new LoginPage();
        Assert.assertTrue(pageLogin.link_basariliGirisCourses.isDisplayed());

    }

    public void login() {


        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        LoginPage pageLogin = new LoginPage();
        pageLogin.cookieAccept.click();
        pageLogin.link_homePageLogin.click();

        pageLogin.input_kullaniciEmail.sendKeys(ConfigReader.getProperty("GecerliUsername"));
        pageLogin.input_password.sendKeys(ConfigReader.getProperty("GecerliPassword"));

        pageLogin.button_login.click();


    }
}
