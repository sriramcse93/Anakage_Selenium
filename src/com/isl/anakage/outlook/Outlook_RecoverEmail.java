package com.isl.anakage.outlook;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Outlook_RecoverEmail {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "E:\\ISL\\chromedriver_win32-Test\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        //Chatbot URL
		driver.navigate().to("http://localhost:4200/");
		// Self-Help Chatbot
		driver.findElement(By.xpath("/html/body/app-root/app-chat/div/img")).click();
		Thread.sleep(2000);
		// Outlook
		driver.findElement(By.xpath("//*[@id=\"main_menu_0_0\"]")).click();
		Thread.sleep(3000);
		// How to recover deleted Email from Email Server Download
		driver.findElement(By.xpath("//*[@id=\"sub_menu_2_6\"]/mat-card-content/mat-card-title")).click();
		Thread.sleep(2000);

		// Was I able to solve your issue? Yes
		/*driver.findElement(By.xpath("//*[@id=\"like_button_3\"]/span/mat-icon/span")).click();
		Thread.sleep(2000);
		
		//Hope the solution helped you!! Do you need further assistance. No
		driver.findElement(By.xpath("//*[@id=\"dislike_button_5\"]/span/mat-icon/span")).click();*/
		
		/* END */
		
		// Was I able to solve your issue? No
	/*	driver.findElement(By.xpath("//*[@id=\"dislike_button_3\"]/span/mat-icon/span")).click();
		Thread.sleep(1500);
		
		//Do you want to create a ticket for the above issue Yes
		driver.findElement(By.xpath("//*[@id=\"like_button_5\"]/span/mat-icon/span")).click();
		Thread.sleep(1500);*/
		/* END */
		
		// Was I able to solve your issue? No
	/*	driver.findElement(By.xpath("//*[@id=\"dislike_button_3\"]/span/mat-icon/span")).click();
		Thread.sleep(1500);
				
		//Do you want to create a ticket for the above issue No
		driver.findElement(By.xpath("//*[@id=\"dislike_button_5\"]/span/mat-icon/span")).click();
		Thread.sleep(1500);
		
		//You can comeback again to create the ticket anytime. Do need help on other problems? No
		driver.findElement(By.xpath("//*[@id=\"dislike_button_6\"]/span/mat-icon/span")).click();
		Thread.sleep(1500);
		*/
		/* END */
		
		// Was I able to solve your issue? Yes
	    driver.findElement(By.xpath("//*[@id=\"like_button_3\"]/span/mat-icon/span")).click();
		Thread.sleep(2000);
		
		// Hope the solution helped you!! Do you need further assistance yes
		driver.findElement(By.xpath("//*[@id=\"like_button_5\"]/span/mat-icon/span")).click();
		
}
}
