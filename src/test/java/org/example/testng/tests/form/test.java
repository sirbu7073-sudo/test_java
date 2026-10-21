package org.example.testng.tests.form;

import org.example.utils.selinium.SeleniumDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {
    static public WebDriver driver;
    public static String URL="https://demoqa.com/automation-practice-form";
public static String FIRST_NAME="Andreea";
public static String LAST_NAME="Sirbu";
public static String EMAIL="sirbu7073@gmail.com";

    @BeforeTest
    public void beforeTest(){
        driver= SeleniumDriver.getAutoLocalDriver();
        driver.manage().window().maximize();

    }
    @Test
    public void formTest(){
        System.out.println("Start test");
driver.get(URL);
demo form=new demo(driver);
form.setFirstName(FIRST_NAME);
form.setFirstName(LAST_NAME);
form.setEmail(EMAIL);
    }
    @AfterTest
    public void afterTest(){
        driver.quit();

    }
}
