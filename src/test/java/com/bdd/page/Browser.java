package com.bdd.page;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class Browser extends PageObject{

    public static void Start(PageObject page, String navegador) {
        try {
            switch (navegador.trim().toLowerCase()) {
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", new File("drivers/chromedriver.exe").getAbsolutePath());

                    //DesiredCapabilities ssl = DesiredCapabilities.chrome();
                    ChromeOptions ssl = new ChromeOptions();
                    ssl.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
                    page.setDriver(new ChromeDriver(ssl));
                    break;
                case "ie":
                    System.setProperty("webdriver.ie.driver", new File("drivers/IEDriverServer.exe").getAbsolutePath());

                    DesiredCapabilities ssl1 = DesiredCapabilities.internetExplorer();
                    ssl1.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

                    page.setDriver(new InternetExplorerDriver(ssl1));
                    break;
                case "edge":
                    System.setProperty("webdriver.edge.driver", new File("drivers/msedgedriver.exe").getAbsolutePath());

                    DesiredCapabilities ssl2 = DesiredCapabilities.edge();
                    ssl2.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

                    page.setDriver(new EdgeDriver(ssl2));
                    break;
                case "firefox":
                    System.setProperty("webdriver.gecko.driver", new File("drivers/geckodriver.exe").getAbsolutePath());

                    DesiredCapabilities ssl3 = DesiredCapabilities.firefox();
                    ssl3.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

                    page.setDriver(new FirefoxDriver(ssl3));
                    break;
                case "opera":
                    System.setProperty("webdriver.opera.driver", new File("drivers/operadriver.exe").getAbsolutePath());

                    DesiredCapabilities ssl4 = DesiredCapabilities.opera();
                    ssl4.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

                    page.setDriver(new OperaDriver(ssl4));
                    break;
                default:
                    Assert.fail("No está mapeado el navegador '" + navegador + "'");
                    // Assume.assumeFalse(true);
                    break;
            }


            page.open();
            page.getDriver().manage().window().maximize();

        } catch (Exception e) {
            Assert.fail("Error al abrir el navegador '" + navegador + "'");
            //   Assume.assumeFalse(true);
        }


    }

    public static void Scroll(PageObject page, int value){
        ((JavascriptExecutor) page.getDriver()).executeScript("scroll(0,"+value+ ");");
    }

    public static void js_click(PageObject page, WebElement we){
        JavascriptExecutor executor = (JavascriptExecutor)page.getDriver();
        executor.executeScript("arguments[0].click();", we);
    }


}
