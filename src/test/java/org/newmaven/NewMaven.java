package org.newmaven;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewMaven {
	public static WebDriver driver;
	public static void launchChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	//1
	public static void winMax() {
		driver.manage().window().maximize();
	}
	//2
	public static void loadUrl(String url) {
		driver.get(url);
	}
	//3
	public static void printTitle() {
		System.out.println(driver.getTitle());
	}
	//4
	public static void printCurrentUrl() {
		System.out.println(driver.getCurrentUrl());
	}
	//5
	public static void click(WebElement e) {
		e.click();
	}
	//6
	public static void fill(WebElement e, String place) {
		e.sendKeys(place);
	}
	//7
	public static void btnClick(WebElement e1) {
		e1.click();
	}
	//8
	public static void rightClick(WebElement e) {
		Actions a= new Actions(driver);
		a.contextClick(e).perform();
	}
	//9
	public static void dclick(WebElement e) {
		Actions a= new Actions(driver);
		a.doubleClick(e).perform();
	}
	//10
	public static void navigate() {
		driver.navigate().back();
	}
	//11
	public static void sleep(long x) throws InterruptedException {
		Thread.sleep(x);
	}
	//12
	public static void close() {
		driver.close();
	}
	//13
	public static void refresh() {
		driver.navigate().refresh();
	}
	//14
	public static void moveTo(WebElement e) {
		Actions a= new Actions(driver);
		a.moveToElement(e).perform();
	}
	//15
	
}
