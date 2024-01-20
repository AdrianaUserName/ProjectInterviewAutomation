package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Log_In_Steps {
    private WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

    }

    @After
    public void tearDown() {
        driver.quit();

    }

    @Given("I access the webdriver Crossinx")
    public void i_access_the_webdriver_crossinx() throws InterruptedException {
        driver.get("https://www.crossinx.com/en");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
        Thread.sleep(1000);

    }

    @When("I click on the login button")
    public void i_click_on_the_login_button() {
      //  driver.findElement(By.xpath("//a[@id='login-button']//*[name()='svg']")).click();
        driver.findElement(By.id("login-button")).click();

        driver.switchTo().frame(0);
    }

    @And("I enter an incorrect first name")
    public void i_enter_an_incorrect_first_name() throws InterruptedException {
       // driver.findElement(By.xpath("//input[@id='loginName']")).sendKeys("Klaus");
        driver.findElement(By.id("loginName")).sendKeys("Klaus");
        Thread.sleep(1000);

    }

    @And("I enter an incorrect password")
    public void i_enter_an_incorrect_password_name() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Iohannis");
        Thread.sleep(1000);

    }
    @And("I click on the login button to access")
    public void iClickOnTheLoginButtonToAccess() throws InterruptedException {
        driver.findElement(By.cssSelector("input[value='Login']")).click();
        Thread.sleep(1000);
    }

    @Then("an error message occurred")
    public void an_error_message_occurred() {
    }


}
