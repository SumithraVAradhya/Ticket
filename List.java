import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class List {
    WebDriver driver;

    public List(WebDriver driver) {
        this.driver = driver;
    }

    By byTicketPrice = By.xpath("//*[@data-test='tab-train-price']");
    By byTotalPrice = By.xpath("//*[@data-test='cjs-price']");

    public String getTicketPrice() {
        return driver.findElement(byTicketPrice).getText();
    }

    public String getTotalPrice() {
        return driver.findElement(byTotalPrice).getText();
    }
}

