package com.redhat.com.springboothelloworldselenium;

import java.net.URL;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.remote.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootHelloworldSeleniumApplication {

        public static void main(String[] args) {
                SpringApplication.run(SpringbootHelloworldSeleniumApplication.class, args);
		try {
                        SpringApplication.run(SpringbootHelloworldSeleniumApplication.class, args);
			System.out.println("111111111");
                        ChromeOptions chromeOptions = new ChromeOptions();
			System.out.println("22222222");
                        chromeOptions.addArguments("--ignore-ssl-errors=yes");
                        chromeOptions.addArguments("--ignore-certificate-errors=yes");
			System.out.println("33333");
                        WebDriver driver = new RemoteWebDriver(new URL("http://selenium-standalone-chrome-cicd-tools.apps.nonp-cluster.smartplay-np.lcsd.hksarg/wd/hub"), chromeOptions);
                        System.out.println("444444");
			driver.get("http://springboot-demo-cicddemo-dev.apps.nonp-cluster.smartplay-np.lcsd.hksarg/greeting");
			System.out.println("55555");
                        driver.quit();
		    } catch (Exception e) {
			System.out.println("ERROR@@@@@");
		    }
        }

}
