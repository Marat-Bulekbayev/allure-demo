import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageHelper {

    private final WebDriver webDriver;

    public PageHelper() {
        WebDriverManager.chromedriver().setup();
        this.webDriver = new ChromeDriver();
    }

    public void randomMethod() {
        webDriver.get("https://google.kz");
    }

    public String getUrl() {
        return webDriver.getCurrentUrl();
    }

    public WebElement getElement(String xpath) {
        return webDriver.findElement(By.xpath(xpath));
    }

    public boolean isElementDisplayed(WebElement webElement) {
        return webElement.isDisplayed();
    }

    public void close() {
        webDriver.close();
    }
}
