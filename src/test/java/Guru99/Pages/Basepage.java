package Guru99.Pages;
import Guru99.Util.Driver;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Basepage {
    public Basepage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


}