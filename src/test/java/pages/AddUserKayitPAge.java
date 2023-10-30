package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AddUserKayitPAge {

    public AddUserKayitPAge(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@id='signup']")
    public WebElement signUp;

    @FindBy(xpath = "//h1[text()='Add User']")
    public WebElement addUser;
    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstName;





}
