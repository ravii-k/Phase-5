package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest {

WebDriver driver;
	
    @BeforeMethod
    public void setUp() {
    	driver = new ChromeDriver();
    	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.get("https://www.amazon.in/");    	
 
    }
    
    @Test(priority=1)
    public void clickOnSearch() {
    	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung");
    	WebElement wd=driver.findElement(By.id("nav-search-submit-button"));
    	wd.click();

    	
    	
    }
    
    @Test(priority=2)
    public void clickOnLogin() {
    	WebElement login = driver.findElement(By.linkText("Start here."));
    	login.click();
        driver.findElement(By.id("ap_customer_name")).sendKeys("abc");
        driver.findElement(By.id("ap_phone_number")).sendKeys("1234567890");
        driver.findElement(By.id("ap_email")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("ap_password")).sendKeys("xyz123");
        driver.findElement(By.id("continue")).click();

    }
    
    @Test(priority = 3)
    public void clickForChart() {
    	WebElement chart=driver.findElement(By.xpath("//*[@id=\"nav-cart-count\"]"));
    	chart.click();
    }
    
    
    
      
}
