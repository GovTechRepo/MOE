package com.moe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchGoogle {
	
	 public static void main(String[] args) {
		 
		System.setProperty("webdriver.ie.driver", "C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe");
		WebDriver driver = new InternetExplorerDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://mail.google.com/");

		driver.manage().window().maximize();

		driver.findElement(By.id("Email")).sendKeys("govtechtesting");

		driver.findElement(By.id("Passwd")).sendKeys("govtechtesting1");

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		driver.findElement(By.id("signIn")).click();

		driver.findElement(By.xpath("//div[@class='z0']/div")).click();

		driver.findElement(By.xpath("//div[@class='gb_1 gb_3a gb_nc gb_e']/div/a")).click();

		driver.findElement(By.xpath("//*[@id='gb_71']")).click();

		driver.close();
		
		}		
	 
	 


}
