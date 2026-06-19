import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;mv

public class GoogleTest {

    @Test
    public void openWebsite() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        System.out.println("Title: " + driver.getTitle());

        Thread.sleep(5000);

        driver.quit();
    }
}