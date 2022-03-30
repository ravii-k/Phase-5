package automateWebApplication;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*1. load the driver of the browse
 *2. set the build path with all the jar files,create an object for the webdriver
 *3.maximise the web browser screen
 *4.specify the webpage what u want to test
 *5.access the web components over the webpage
 * */
public class WebAccess {
	public static void main(String[] args) throws InterruptedException {
	//load the driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kashy\\Downloads\\New folder\\95\\chromedriver.exe");

		WebDriver wd=new ChromeDriver();
	//maximise the web browser screen
		wd.manage().window().maximize();
	//load the webpage
		wd.get("https://www.amazon.in/");
//title of webpage what loaded
		System.out.println(wd.getTitle());
//load the url
		System.out.println(wd.getCurrentUrl());
		//close the browser
		
//		wd.findElement(By.id("twotabsearchtextbox")).sendṁṁKeys("samsung");
//		wd.findElement(By.id("nav-search-submit-button")).click();
		
		wd.findElement(By.linkText("Start here.")).click();
		wd.findElement(By.id("ap_customer_name")).sendKeys("ravi");
		wd.findElement(By.id("ap_phone_number")).sendKeys("9875847894");
		wd.findElement(By.id("ap_email")).sendKeys("ravi@gmail.com");
		wd.findElement(By.id("ap_password")).sendKeys("12345679");
		wd.findElement(By.id("continue")).click();
		
		Thread.sleep(20000);
		
		wd.close();
		
		
	}
}
