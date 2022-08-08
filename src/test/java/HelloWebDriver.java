import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class HelloWebDriver {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("image");
        searchInput.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        WebElement searchBtn = driver.findElement(By.xpath("//*[@id='hdtb-msb']/div[1]/div/div[2]/a"));
        searchBtn.click();
        Thread.sleep(5000);
        List<WebElement> images = driver.findElements(By.tagName("img"));
        if (!images.isEmpty()){
            System.out.println("The tab contains images!");
        }else{
            System.out.println("No images on the tab!");
        }
        driver.quit();
    }
}
