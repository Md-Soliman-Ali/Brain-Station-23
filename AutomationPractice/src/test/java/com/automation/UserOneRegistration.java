package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class UserOneRegistration extends DriverSetup {

	public static String baseURL = "http://automationpractice.com/index.php";

	@Test
	public static void registration() throws InterruptedException {
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[contains(@class,'header_user_info')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'email_create')]")).sendKeys("solimanali07@gmail.com");
		driver.findElement(By.xpath("//button[contains(@id,'SubmitCreate')]")).click();
		Thread.sleep(5000);

		WebElement radio1 = driver.findElement(By.id("id_gender1"));
		radio1.click();

		driver.findElement(By.xpath("//input[contains(@id,'customer_firstname')]")).sendKeys("Soliman");
		driver.findElement(By.xpath("//input[contains(@id,'customer_lastname')]")).sendKeys("Ali");
		driver.findElement(By.xpath("//input[contains(@id,'passwd')]")).sendKeys("Soliman_Ali");

		driver.findElement(By.xpath("//label[contains(normalize-space(),'Date of Birth')]")).click();

		WebElement days = driver.findElement(By.id("days"));
		Select selectDay = new Select(days);
		selectDay.selectByIndex(3);
		Thread.sleep(2000);

		WebElement months = driver.findElement(By.id("months"));
		Select selectMonth = new Select(months);
		selectMonth.selectByIndex(2);
		Thread.sleep(2000);

		WebElement years = driver.findElement(By.id("years"));
		Select selectYear = new Select(years);
		selectYear.selectByIndex(26);
		Thread.sleep(2000);

		WebElement option1 = driver.findElement(By.id("newsletter"));
		option1.click();

		WebElement option2 = driver.findElement(By.id("optin"));
		option2.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("");
		driver.findElement(By.xpath("//input[contains(@name,'company')]")).sendKeys("Student");
		driver.findElement(By.xpath("//input[contains(@id,'address1')]")).sendKeys("Bogura");
		driver.findElement(By.xpath("//input[contains(@id,'address2')]")).sendKeys("Mirpur");
		driver.findElement(By.xpath("//input[contains(@id,'city')]")).sendKeys("Dhaka");

		WebElement states = driver.findElement(By.id("id_state"));
		Select selectState = new Select(states);
		selectState.selectByIndex(15);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[contains(@id,'postcode')]")).sendKeys("00000");
		driver.findElement(By.xpath("//textarea[@name='other']")).sendKeys("SQA ENGINEER TEST (Automation Test 2021)");

		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("01706994692");
		driver.findElement(By.xpath("//input[contains(@id,'phone_mobile')]")).sendKeys("01706994690");
		driver.findElement(By.xpath("//input[contains(@id,'alias')]")).sendKeys("");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@id,'submitAccount')]")).click();

		Thread.sleep(5000);

		String actualName = "Nevine Acotanza";
		String username = driver.findElement(By.xpath("//a[contains(@class,'account')]")).getText();

		if (username.equalsIgnoreCase(actualName)) {
			System.out.println(username + " Name is Validate");
		}

		driver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?mylogout']")).click();
		Thread.sleep(2000);

	}
}
