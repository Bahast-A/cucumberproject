package Guru99.Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage extends Basepage{

    @FindBy(xpath = "//h2[.='Mother Elephant With Babies Soft Toy']")
    private WebElement header1;

    public void setHeader(String expected){
       // String headerinfo= header1.getText()
        Assert.assertEquals(header1.getText(),expected,"Mother Elephant With Babies Soft Toy");

    }



}
