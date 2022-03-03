package theInternetHerokuapp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FistTest {


    @Test
    public void titleTest() {
        System.setProperty("webdriver.chrome.driver","D:/SeleniumDrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://the-internet.herokuapp.com/";
        driver.get(url);
        String title = driver.getTitle();
        String result = "The Internet";
        assertEquals(title,result,String.format(title,result));
        driver.quit();
    }
    @Test
    public void idTest(){
        System.setProperty("webdriver.chrome.driver","D:/SeleniumDrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement linkToCheckboxes = driver.findElement(By.linkText("Dynamic Content"));
        linkToCheckboxes.click();

    }
}
