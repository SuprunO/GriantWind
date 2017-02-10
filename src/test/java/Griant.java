import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by alex on 10.02.2017.
 */
public class Griant {
    @Test
    public void Griant (){
        WebDriver driver = new FirefoxDriver();

        for(int i = 0; i < 60;i++){
        driver.get("http://www.griant.com.ua/");

        }
        driver.quit();
    }
}
