package org.maven;

import org.newmaven.NewMaven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MavenProject extends NewMaven{

	public static void main(String[] args) throws InterruptedException {
		
		
		launchChrome();
		winMax();
		
		loadUrl("https://wordpress.org/");
		printTitle();
		printCurrentUrl();
		
		WebElement e = driver.findElement(By.xpath("//li[@id='wp-admin-bar-log-in']"));
		e.click();
		
		WebElement user = driver.findElement(By.xpath("//input[@id='user_login']"));
		fill(user, "London123");                                      
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='user_pass']"));
		fill(pass, "GenthodChenaie");                             
		
		WebElement e1 = driver.findElement(By.xpath("//input[@value='Log In']"));
		e1.click();
		
		driver.navigate().to("https://wordpress.org/");
		
		WebElement plugin = driver.findElement(By.xpath("//span[@class='wp-block-navigation-item__label']"));
		plugin.click();
		
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search plugins']"));
		fill(search, "wordpress");
		
		WebElement btnclk = driver.findElement(By.xpath("//button[@class='button button-primary button-search']"));
		btnclk.click();
		
		
		navigate();
		sleep(1000);
		close();
		refresh();
		driver.findElement(By.xpath("))
	
		
	}
}
