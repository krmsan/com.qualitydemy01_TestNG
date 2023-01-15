package pages;

import org.openqa.selenium.support.PageFactory;
import utilties.Driver;

public class PageAnasayfa {
    public PageAnasayfa(){
        PageFactory.initElements(Driver.getDriver(),this);
    }




}
