package net.trycloud.pages;

import net.trycloud.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class TryCloudBasePage {

    public TryCloudBasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



}
