
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
    public static WebDriver driver;

    @Test
    public static void main(String[] args) {

        System.setProperty("webdriver.chrom.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("Page title is:" + driver.getTitle());
        driver.quit();
    }
}
