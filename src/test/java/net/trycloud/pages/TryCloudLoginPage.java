package net.trycloud.pages;

import net.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TryCloudLoginPage {

    public TryCloudLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user")
    public WebElement UserNameBox;

    @FindBy(id = "password")
    public WebElement PasswordBox;

    @FindBy(id = "submit-form")
    public WebElement loginButton;
}
