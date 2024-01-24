import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {

    public static void main(String[] s) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\SelenuimPro-main\\SelenuimPro-main\\src\\test\\resources\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
    }
}
