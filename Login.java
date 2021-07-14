import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class Login {
    WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    By acceptCookies = By.cssSelector("button[id=onetrust-accept-btn-handler]");
    By searchFrom = By.id("from.search");
    By searchTo = By.id("to.search");
    By twoway = By.xpath("//*[@id=\"return\"]");
    By nextDay = By.xpath("//*[@id=\"app\"]/div/div[1]/main/div[2]/div[4]/div/div/div[1]/section/form/div[3]/fieldset[1]/div[1]/button[2]/span");
    By returnDay =By.xpath("//*[@id=\"app\"]/div/div[1]/main/div[2]/div[4]/div/div/div[1]/section/form/div[3]/fieldset[2]/div[1]/button[2]/span");
    By searchTickets = By.cssSelector("button[data-test='submit-journey-search-button']");


    public void searchForm(String fromStation) {
        driver.findElement(searchFrom).sendKeys(fromStation);
    }

    public void toStation(String toStation) {
        driver.findElement(searchTo).sendKeys(toStation);
    }

    public void oneWayJourney(){
        driver.findElement(twoway).click();
    }

    public void nextDayJourney(){
        driver.findElement(nextDay).click();
    }

    public void searchTicket(){
        driver.findElement(searchTickets).click();
    }
    public void ReturningDay()
    {
        driver.findElement(returnDay).click();
    }
}
