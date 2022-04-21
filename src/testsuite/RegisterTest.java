package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://parabank.parasoft.com/parabank/index.htm";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @After
    public void tearclose() {
        closeBrowser();
    }

    @Test
    public void verifyThatSigningUpPageDisplay() {
        //log in click register button
        WebElement registerclick = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        registerclick.click();
        // varify signing up easy text message
        String expectedmessage = "Signing up is easy!";
        WebElement actualmessage = driver.findElement(By.xpath("//h1[@class='title']"));
        String actualmessage1 = actualmessage.getText();
        // Assert actual message with expected message
        Assert.assertEquals("Signinig up is easy", expectedmessage, actualmessage1);


    }

    @Test
    public void userSholdRegisterAccountSuccessfully() {
        // click on register link
        WebElement registerlink = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        registerlink.click();
        //Enter first name
        WebElement firstName = driver.findElement(By.xpath("//input[@id='customer.firstName']"));
        firstName.sendKeys("Prime2");
        //Enter last Name
        WebElement lastName = driver.findElement(By.xpath("//input[@id='customer.lastName']"));
        lastName.sendKeys("Devani");
        //Enter address
        WebElement address = driver.findElement(By.xpath("//input[@id='customer.address.street']"));
        address.sendKeys("3,Butler Road");
        //Enter city
        WebElement city = driver.findElement(By.xpath("//input[@id='customer.address.city']"));
        city.sendKeys("London");
        //Enter state
        WebElement state = driver.findElement(By.xpath("//input[@id='customer.address.state']"));
        state.sendKeys("Middlesex");
        //Enter zipcode
        WebElement zipcode = driver.findElement(By.xpath("//input[@id='customer.address.zipCode']"));
        zipcode.sendKeys("Ha1 3sd");
        //phone number
        WebElement phoneNumber = driver.findElement(By.xpath("//input[@id='customer.phoneNumber']"));
        phoneNumber.sendKeys("04587853256");
        //Enter SSN
        WebElement ssn = driver.findElement(By.xpath("//input[@id='customer.ssn']"));
        ssn.sendKeys("123");
        //Enter valid username
        WebElement username = driver.findElement(By.xpath("//input[@name='customer.username']"));
        username.sendKeys("primeDevani");
        //Enter valid password
        WebElement password = driver.findElement(By.xpath("//input[@id='customer.password']"));
        password.sendKeys("prime123");
        // confirm password
        WebElement confirmpassword=driver.findElement(By.xpath("//input[@id='repeatedPassword']"));
        confirmpassword.sendKeys("prime123");
        //click on login button
        WebElement registerbtn = driver.findElement(By.xpath("//input[@class='button'and @value='Register']"));
        registerbtn.click();
        //varify account overview text display
        String expectedmessage = "Your account was created successfully. You are now logged in.";
        WebElement actualmessage = driver.findElement(By.xpath("//p[text()='Your account was created successfully. You are now logged in.']"));
        String actualmessage1 = actualmessage.getText();
      //  Assert message compare actual and expected
        Assert.assertEquals("Your account was created successfully. You are now logged in.",expectedmessage,actualmessage1);


    }


}
