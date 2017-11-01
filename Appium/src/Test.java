import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hello");
		System.getProperty("webdriver.chrome.driver", "F:\\selenium-2.52.0\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//WebDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
	}

}
