package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class UserTwoRegistrationAndBuy extends DriverSetup {

	public static String baseURL = "http://automationpractice.com/index.php";

	@Test
	public static void registrationAndBuy() throws InterruptedException {
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[contains(@class,'header_user_info')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'email_create')]")).sendKeys("solimanali.info07@gmail.com");
		driver.findElement(By.xpath("//button[contains(@id,'SubmitCreate')]")).click();
		Thread.sleep(1000);

		WebElement radio1 = driver.findElement(By.id("id_gender1"));
		radio1.click();

		driver.findElement(By.xpath("//input[contains(@id,'customer_firstname')]")).sendKeys("Soliman");
		driver.findElement(By.xpath("//input[contains(@id,'customer_lastname')]")).sendKeys("Ali");
		driver.findElement(By.xpath("//input[contains(@id,'passwd')]")).sendKeys("Soliman_Ali");

		driver.findElement(By.xpath("//label[contains(normalize-space(),'Date of Birth')]")).click();

		WebElement days = driver.findElement(By.id("days"));
		Select selectDay = new Select(days);
		selectDay.selectByIndex(3);
		Thread.sleep(1000);

		WebElement months = driver.findElement(By.id("months"));
		Select selectMonth = new Select(months);
		selectMonth.selectByIndex(2);
		Thread.sleep(1000);

		WebElement years = driver.findElement(By.id("years"));
		Select selectYear = new Select(years);
		selectYear.selectByIndex(26);
		Thread.sleep(1000);

		WebElement option1 = driver.findElement(By.id("newsletter"));
		option1.click();

		WebElement option2 = driver.findElement(By.id("optin"));
		option2.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("");
		driver.findElement(By.xpath("//input[contains(@name,'company')]")).sendKeys("Student");
		driver.findElement(By.xpath("//input[contains(@id,'address1')]")).sendKeys("Bogura");
		driver.findElement(By.xpath("//input[contains(@id,'address2')]")).sendKeys("Mirpur");
		driver.findElement(By.xpath("//input[contains(@id,'city')]")).sendKeys("Dhaka");

		WebElement states = driver.findElement(By.id("id_state"));
		Select selectState = new Select(states);
		selectState.selectByIndex(15);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[contains(@id,'postcode')]")).sendKeys("00000");
		driver.findElement(By.xpath("//textarea[@name='other']")).sendKeys("SQA ENGINEER TEST (Automation Test 2021)");

		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("01706994692");
		driver.findElement(By.xpath("//input[contains(@id,'phone_mobile')]")).sendKeys("01706994690");
		driver.findElement(By.xpath("//input[contains(@id,'alias')]")).sendKeys("");

		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(@id,'submitAccount')]")).click();

		Thread.sleep(1000);

		String actualName = "Nevine Acotanza";
		String username = driver.findElement(By.xpath("//a[contains(@class,'account')]")).getText();

		if (username.equalsIgnoreCase(actualName)) {
			System.out.println(username + " Name is Validate");
		}

		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath(
				"//body/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a[1]")))
				.build().perform();
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//li[@class='sfHover']//a[@title='Summer Dresses'][normalize-space()='Summer Dresses']"))
				.click();

		Actions item_one = new Actions(driver);
		item_one.clickAndHold(driver.findElement(
				By.xpath("//img[contains(@src,'http://automationpractice.com/img/p/1/2/12-home_default.jpg')]")))
				.build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line hovered']//span[contains(text(),'Add to cart')]"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(@class,'continue btn btn-default button exclusive-medium')]"))
				.click();
		Thread.sleep(2000);

		Actions item_two = new Actions(driver);
		item_two.clickAndHold(driver.findElement(
				By.xpath("//img[contains(@src,'http://automationpractice.com/img/p/1/6/16-home_default.jpg')]")))
				.build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 last-line last-item-of-tablet-line last-mobile-line hovered']//span[contains(text(),'Add to cart')]"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@title,'Proceed to checkout')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]"))
				.click();
		Thread.sleep(1000);

		WebElement checkCondition = driver.findElement(By.id("cgv"));
		checkCondition.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(.,'Pay by bank wire (order processing will be longer)')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
		Thread.sleep(1000);

		String orderActual = "Order confirmation";
		String orderConfirm = driver.findElement(By.xpath("//h1[contains(text(),'Order confirmation')]")).getText();
		if (orderActual.equalsIgnoreCase(orderConfirm)) {
			System.out.println("Oder Confirmed Validate");
		}

		driver.findElement(By.xpath("//a[normalize-space()='Back to orders']")).click();

		Thread.sleep(2000);

	}
}
