package steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.WebDriver;

/**
 * Created by Karthik on 10/17/2016.
 */
public class Hook extends BaseUtil{


    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest() {
        
         System.setProperty("webdriver.ie.driver", "C:\\Libs\\IEDriverServer.exe");
         WebDriver driver = new InternetExplorerDriver();
         driver.manage().window().maximize();
         //base.Driver = new InternetExplorerDriver();
       // System.out.println("Opening the browser : Firefox");

       // System.setProperty("webdriver.firefox.marionette", "C:\\Libs\\geckodriver.exe");
      //  base.Driver = new FirefoxDriver();


        //Chrome driver
       // System.setProperty("webdriver.chrome.driver", "C:\\Libs\\chromedriver.exe");
       // base.Driver = new ChromeDriver();
    }


    @After
    public void TearDownTest(Scenario scenario) {
        if (scenario.isFailed()) {
            //Take screenshot logic goes here
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser : MOCK");
    }

}
