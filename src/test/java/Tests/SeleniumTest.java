package Tests;

import Pages.HomePage;
import Pages.ProductsPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class SeleniumTest {

    public static WebDriver driver;
    static ExtentReports report;
    public static ExtentTest test;
    static ExtentReports extent = new ExtentReports();

    @BeforeSuite
    public static void setup() throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/");

        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
        extent.attachReporter(spark);
        driver.manage().window().maximize();

        HomePage.click_hamburger_menu();
        HomePage.click_order_product_link();

    }

    @Test
    void validateTitlesOfOnlineProducts() throws InterruptedException {

        test = extent.createTest("Validate Titles Of Online Products",
                "This test validates that the different shoe types are correct on the product page");
        ProductsPage.formalShoes_verifyTitle();
        ProductsPage.sportsShoes_verifyTitle();
        ProductsPage.sneakers_verifyTitle();
        extent.flush();

    }

    @Test
    void validateFirstFormalShoe() {

        test = extent.createTest("Validate First Formal Shoe",
                "This test validates that the first formal shoe is displayed");
        ProductsPage.formalShoes_firstShoe_verify();

    }

    @Test
    void validateFirstSportsShoe() {

        test = extent.createTest("Validate First Sports Shoe",
                "This test validates that the first sports shoe is displayed");
        ProductsPage.sportsShoes_firstShoe_verify();

    }

    @AfterSuite
    public static void cleanup() {

        extent.flush();

    }


}






























