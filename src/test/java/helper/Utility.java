package helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Utility {

    public static WebDriver webDriver;

    // membuka google chrome
    public static void startWebDriver() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        // Tambahan supaya jalan di CI/CD (GitHub Actions)
        options.addArguments("--headless=new");  // penting: jalan tanpa UI
        options.addArguments("--no-sandbox");    // supaya bisa jalan di container
        options.addArguments("--disable-dev-shm-usage");

        webDriver = new ChromeDriver(options);
        // Jangan pakai fullscreen di headless, bisa diganti maximize
        webDriver.manage().window().maximize();

        webDriver.get("https://www.saucedemo.com/v1/index.html");
    }

    // me
