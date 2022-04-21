package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;

    public void openBrowser(String baseUrl){
        //set up baseurl
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(baseUrl);
        //maximise application
        driver.manage().window().maximize();
        // timeout to open
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }
    //close browser
    public void closeBrowser(){
        driver.quit();
    }



}
