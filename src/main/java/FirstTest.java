import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    @Test
    public void testSearchGoogle() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TrollMashine\\Downloads\\chromedriver1\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");

        WebElement searchBox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));

        searchBox.sendKeys("ChromeDriver");
        searchBox.submit();
        driver.quit();

    }
}
