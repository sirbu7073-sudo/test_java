package org.example.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class demo {
    public static WebDriver driver;
    public demo(WebDriver driverparam){
        driver=driverparam;
        PageFactory.initElements(driverparam,page this);
        @FindBy(xpath ="//*[@id='firstName']" );
        WebElement firstName;
        @FindBy(css="#lastName");
        WebElement lastName;
        @FindBy(id="userEmail");
        WebElement userEmail;


                public void setFirstName(String firstNameparam){
                    firstName.clear();
                    firstName.sendKeys(firstNameParam);

        }
        public void setLastName(String lastNameparam){
            lastName.clear();
            firstName.sendKeys(lastNameParam);
        }
        public void setUserEmail(String emailparam){
            userEmail.clear();
            userEmail.sendKeys(emailparam);
        }
    }
}
