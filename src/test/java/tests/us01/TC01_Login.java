package tests.us01;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PageLogin;
import utilties.ConfigReader;
import utilties.Driver;

public class TC01_Login {


    @Test
    public void test_login() {
        login();
        PageLogin pageLogin=new PageLogin();
        Assert.assertTrue(pageLogin.link_basariliGirisCourses.isDisplayed());

    }

    public void login() {


        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        PageLogin pageLogin = new PageLogin();
        pageLogin.cookieAccept.click();
        pageLogin.link_homePageLogin.click();

        pageLogin.input_kullaniciEmail.sendKeys(ConfigReader.getProperty("GecerliUsername"));
        pageLogin.input_password.sendKeys(ConfigReader.getProperty("GecerliPassword"));

        pageLogin.button_login.click();


    }
}
