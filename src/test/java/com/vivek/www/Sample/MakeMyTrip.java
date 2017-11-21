package com.vivek.www.Sample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {
public static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\library\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='log-in']")).click();
		Thread.sleep(5000);
		WebElement iframe = driver.findElement(By.cssSelector(".ch__loginSocialMedia > a:nth-child(1) > span:nth-child(1) > iframe:nth-child(1)"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//div[text()='Continue with Facebook']")).click();;
		Thread.sleep(5000);
		switchToNewWindow();
		driver.findElement(By.id("email")).sendKeys("VishalTiwari");
		Thread.sleep(5000);
		switchBackToOldWindow();
		driver.close();
		driver.quit();
	}
	
	public static void switchToNewWindow() {
		String parentWindow = driver.getWindowHandle();
		Set<String> window = driver.getWindowHandles();
		for (String win:window){
			if(!win.equals(parentWindow)){
				driver.switchTo().window(win);
			}
		}
	}
	
	public static void switchBackToOldWindow() {
		String parentWindow = driver.getWindowHandle();
		Set<String> window = driver.getWindowHandles();
        driver.close();
		for (String win:window){
			if(!win.equals(parentWindow)){
				driver.switchTo().window(win);
			}
		}
	}

}
