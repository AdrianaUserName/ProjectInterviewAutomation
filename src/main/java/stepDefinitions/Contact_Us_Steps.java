package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Contact_Us_Steps {
    private WebDriver driver;
    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"/src/main/java/drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

    }
   @After
    public void tearDown(){
        driver.quit();

    }
    @Given("I access the webdriver Crossinx Contact Us")
    public void i_access_the_webdriver_crossinx_contact_us() throws InterruptedException {
        driver.get("https://www.crossinx.com/en/about-us/contact/");

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
        Thread.sleep(1000);

        JavascriptExecutor scrolling = (JavascriptExecutor)driver;
        scrolling.executeScript("window.scrollBy(0,450)");
        Thread.sleep(1000);
    }
    @When("I enter a first name")
    public void i_enter_a_first_name()  {
        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Valentina");

    }
    @And("I enter a last name")
    public void i_enter_a_last_name() {
        driver.findElement(By.cssSelector("#last_name")).sendKeys("Terescov");

    }
    @And("I enter an email address")
    public void i_enter_an_email_address() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("valentina@gmail.com");
        Thread.sleep(1000);
    }
    @And("I enter a comment")
    public void i_enter_a_comment() throws InterruptedException {
        driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("You are a wonderful company!");
        Thread.sleep(1000);
    }
    @And("I click on the submit button")
    public void i_click_on_the_submit_button() throws InterruptedException {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);

    }
    @Then("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() {

    }
}
