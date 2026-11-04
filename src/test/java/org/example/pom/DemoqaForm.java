package org.example.pom;

import org.example.utils.WaitSel;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DemoqaForm {
    public static WebDriver driver;

    @FindBy(xpath = "//*[@id='firstName']")
    WebElement firstName;

    @FindBy(css = "#lastName")
    WebElement lastName;

    @FindBy(id="userEmail")
    WebElement userEmail;

    @FindBy(id="userNumber")
    WebElement userNumber;

    @FindBy(css="#dateOfBirthInput")
    WebElement date;

    @FindBy(id="subjectsInput")
    WebElement subjectsInput;

    @FindBy(id="state")
    WebElement state;

    @FindBy(id="city")
    WebElement city;

    @FindBy(id="submit")
    WebElement submit;

    public DemoqaForm(WebDriver driverParam) {
        driver = driverParam;
        PageFactory.initElements(driverParam, this);
    }

    public void setHobby(String hobbyParam) {
        scrollToAmount(400);
        driver.findElement(By.xpath("//*[@id='hobbiesWrapper']//label[text()='" + hobbyParam + "']/../input")).click();
    }

    public void setSubject(String subjectParam) {
        subjectsInput.clear();
        subjectsInput.sendKeys(subjectParam);
        subjectsInput.sendKeys(Keys.ENTER);
    }

    public void setDate(String dateParam) {
        date.sendKeys(Keys.CONTROL, "a");
        date.sendKeys(dateParam);
        date.sendKeys(Keys.ENTER);
    }

    public void setUserNumber(String numberParam) {

        userNumber.clear();
        userNumber.sendKeys(numberParam);
    }
    public void setState(String stateParam){
        scrollToAmount(400);

        state.click();
        driver.findElement(By.xpath("//*[text()='"+stateParam+"']")).click();
    }
    public void setCity(String cityParam){
        city.click();
        driver.findElement(By.xpath("//*[text()='"+cityParam+"']")).click();
    }
    public void clickSubmit(){
        submit.click();
    }

    public void setGender(String genderParam){
        WebElement gender = driver.findElement(By.xpath("//*[@id='genterWrapper']//label[text()='" + genderParam + "']"));
        gender.click();
    }
    public void setEmail(String emailParam) {
        userEmail.clear();
        userEmail.sendKeys(emailParam);

    }

    public void setLastName(String lastNameParam) {
        lastName.clear();
        lastName.sendKeys(lastNameParam);
    }
    public void scrollToAmount(int amountParam){
        new Actions(driver)
                .scrollByAmount(0,amountParam)
                .perform();
    }
    public void setFirstName(String firstNameParam) {
        firstName.clear();
        firstName.sendKeys(firstNameParam);
    }
    public String getValue(String labelParam){
        WebElement val=driver.findElement(By.xpath("//table//tr//td[text()='"+labelParam+"']/../td[2]"));
        WaitSel.explicitWait(driver, ExpectedConditions.visibilityOf(val),10);
        return val.getText();
    }

}