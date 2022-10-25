import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Login {

    public static void main(String[] args) {


        //Set Gecko.driver property to interact to Firefox browser
        System.setProperty("webdriver.gecko.driver","C://Program Files/Selenium/geckodriver-v0.31.0-win64/geckodriver.exe");

// Create a new instance of Firefox driver
        WebDriver driver = new FirefoxDriver();

// And now use this to visit LMS login page
        driver.get("http://test-hitekschool.com/lms/loans/2108");

// Maximize window
        driver.manage().window().maximize();

// Read the title of the page and output it into results
        System.out.println("Page title is: " + driver.getTitle());

// Find the text input element 'branch' by its name
        WebElement element = driver.findElement(By.name("j_branch"));

// Enter username
        element.sendKeys("Manchester");

// Find the text input element 'username' by its name
        element = driver.findElement(By.name("j_username"));

// Enter username
        element.sendKeys("admin");

// Find the text input element 'password' by its name
        element = driver.findElement(By.name("j_password"));

// Enter password
        element.sendKeys("vvesninskiy0907");

// Find the button Login by its id
        element = driver.findElement(By.id("ext-gen38"));

// Click Login button
        element.click();

// Try to sleep (wait) for 10 sec (using exception handler)
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
// Read the title of the page and output it into results - need it for debug purpose
        System.out.println("Page title is: " + driver.getTitle());

// Verify the title of the page
        Assert.assertEquals(driver.getTitle(), "Loan Management System - 'Manchester' branch");

// Close the browser
        driver.close();
    }
}