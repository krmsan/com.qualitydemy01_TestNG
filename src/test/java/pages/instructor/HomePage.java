package pages.instructor;

import org.openqa.selenium.support.PageFactory;
import utilties.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }




}
