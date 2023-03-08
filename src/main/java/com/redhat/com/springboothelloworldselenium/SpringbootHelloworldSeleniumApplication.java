import java.net.URL;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.remote.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootHelloworldSeleniumApplication {

        public static void main(String[] args) {
            try {
                SpringApplication.run(SpringbootHelloworldSeleniumApplication.class, args);
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--ignore-ssl-errors=yes");
                chromeOptions.addArguments("--ignore-certificate-errors=yes");
                WebDriver driver = new RemoteWebDriver(new URL("http://selenium-standalone-chrome.cicd-tools.svc.cluster.local/wd/hub"), chromeOptions);
                driver.get("http://springboot-demo-cicddemo-dev.apps.nonp-cluster.smartplay-np.lcsd.hksarg/greeting");
                driver.quit();
            } catch (Exception e) {
            }
        }

}
