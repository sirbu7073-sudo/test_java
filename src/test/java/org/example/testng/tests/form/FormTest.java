package org.example.testng.tests.form;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.pom.DemoqaForm;
import org.example.utils.SeleniumDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FormTest {
    private static final Logger logger = LogManager.getLogger(FormTest.class);
    static public WebDriver driver;
    public static String URI = "https://demoqa.com/automation-practice-form";
    public static String FIRST_NAME = "Andreea";
    public static String LAST_NAME = "HAM";
    public static String EMAIL = "ex@gmail.com";
    public static String GENDER = "Female";
    public static String NUMBER = "1234567890";
    public static String DATE = "18 Apr 1999";
    public static String SUBJECT = "Maths";
    public static String HOBBY = "Music";
    public static String STATE="NCR";
    public static String CITY="Delhi";


    @BeforeTest
    public void beforeTest() {
        driver = SeleniumDriver.getAutoLocalDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void formTest() throws InterruptedException{

        logger.info("Start test");
        driver.get(URI);
        DemoqaForm form = new DemoqaForm(driver);
        form.setFirstName(FIRST_NAME);
        form.setLastName(LAST_NAME);
        form.setEmail(EMAIL);
        form.setGender(GENDER);
        form.setUserNumber(NUMBER);
        form.setDate(DATE);
        form.setSubject(SUBJECT);
        form.setHobby(HOBBY);
        form.setState(STATE);
        form.setCity(CITY);
        form.clickSubmit();
        String actualName=form.getValue("Student Name");
        Assert.assertEquals(actualName,FIRST_NAME+" "+LAST_NAME);
        Thread.sleep(1000);
        logger.info("finish test");
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }

}