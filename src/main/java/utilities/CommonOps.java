package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import org.w3c.dom.Document;
import work.flows.WebFlows;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.time.Duration;

public class CommonOps extends Base {

    // To change an app, change the name of an app in four functions
    // initURL() * 2 , initClasses() , initLoginFlow()


    public static String getData(String nodeName) {
        DocumentBuilder dBuilder;
        Document doc = null;
        File fXmlFile = new File("./Configuration/DataConfig.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(fXmlFile);
        } catch (Exception e) {
            System.out.println("Exception in reading XML file: " + e);
        }
        doc.getDocumentElement().normalize();
        return doc.getElementsByTagName(nodeName).item(0).getTextContent();
    }


    public static WebDriver initChromeDriver() {
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver","C://Users//Kfir//IdeaProjects//finalProject//Drivers//chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }

    public static void initURL(String appName) {
        if (appName.equalsIgnoreCase("grafana")) {
            driver.get(getData("GrafanaUrl"));
        } else if (appName.equalsIgnoreCase("sauceDemo")) {
            driver.get(getData("SauceDemoUrl"));
        }
    }

    public static void initClasses(String appName) {
        if (appName.equalsIgnoreCase("grafana")) {
            ManagePages.initGrafana();
        } else if (appName.equalsIgnoreCase("sauceDemo")) {
            ManagePages.initsauceDemo();
        }
    }

    public static void initLoginFlow(String appName) {
        if (appName.equalsIgnoreCase("grafana")) {
            WebFlows.login("admin", "admin");
        }
       else if (appName.equalsIgnoreCase("sauceDemo")) {
           WebFlows.loginSauce("standard_user","secret_sauce");
        }
    }


    public static WebDriver initfoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        return driver;
    }

    public static WebDriver initEdgeDriver() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        return driver;
    }

    public static void initBrowser(String browserType) {
        if (browserType.equalsIgnoreCase("chrome")) {
            driver = initChromeDriver();
        } else if (browserType.equalsIgnoreCase("firefox")) {
            driver = initfoxDriver();
        } else if (browserType.equalsIgnoreCase("edge")) {
            driver = initEdgeDriver();
        } else {
            throw new RuntimeException("Invalid driver type");
        }
        driver.manage().window().maximize();
        long timeoutSec = Long.parseLong(getData("TimeOut"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeoutSec));
        wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSec));
        // Possible apps : SauceDemo , Grafana
        initURL(getData("SauceDemo"));
        initClasses("SauceDemo");
        actions = new Actions(driver);


    }

    @BeforeClass
    public void startSession() {
        if (getData("PlatformName").equalsIgnoreCase("web")) {
            initBrowser(getData("BrowserChrome"));
            //initBrowser(getData("BrowserFox"));
        }
//        else if (platform.equalsIgnoreCase("mobile"))
//            initMobile();

        else {
            throw new RuntimeException("Invalid platform name");
        }
        // Possible apps : SauceDemo , Grafana
        initLoginFlow("SauceDemo");
        softAssert = new SoftAssert();
        screen = new Screen();
        region = screen;


    }

    @AfterClass
    public void endSession() {
        driver.close();
    }

    @AfterMethod
    public void afterMethod() {
        // Possible apps : SauceDemo , Grafana
        initURL(getData("SauceDemo"));

    }

    @BeforeMethod
    public void beforeMethod(Method method) {
        try {
            MonteScreenRecorder.startRecord(method.getName());
        } catch (Exception e) {
            System.out.println("Did not start record : " + e);
        }
    }


}
