import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
	public static void main(String[] args) throws InterruptedException {
		String File = System.getProperty("user.dir")+"\\Utility\\chromedriver.exe";
		System.out.println(File);
		System.setProperty("webdriver.chrome.driver", File);// setting the chrome driver
		WebDriver driver = new ChromeDriver(); //launching the chrome browser
		driver.get("https://www.google.com/"); //setting the url
		driver.manage().window().maximize(); //maximizing the window
		Thread.sleep(600); //6 second wait
		driver.quit();//close all the connections
		//driver.close();//close will close the current connection
	}
}
