package com.redhat.com.springboothelloworldselenium;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootHelloworldSeleniumApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHelloworldSeleniumApplication.class, args);
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setCapability("browserVersion", "67");
		chromeOptions.setCapability("platformName", "Windows XP");
		WebDriver driver = new RemoteWebDriver(new URL("http://www.example.com"), chromeOptions);
		driver.get("http://www.google.com");
		driver.quit();
	}

}
