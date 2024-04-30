package Pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.Assert;


import static Tests.SeleniumTest.*;

public class ProductsPage {

    public static String formalShoes_xpath = "//h2[normalize-space()='Formal Shoes']";

    public static String sportsShoes_xpath = "//h2[normalize-space()='Sports Shoes']";

    public static String sneakers_xpath = "//h2[normalize-space()='Sneakers']";

    public static String formalShoesDropdown_xpath = "(//i[@class='fa fa-angle-double-down formalshoedropdown'])[1]";

    public static String sportsShoesDropdown_xpath = "(//i[@class='fa fa-angle-double-down sportsshoedropdown'])[1]";

    public static String sneakersDropdown_xpath = "(//i[@class='fa fa-angle-double-down formalshoedropdown'])[1]";

    public static String formalShoes_firstShoeName = "/html/body/div[2]/table/tbody/tr[1]/td[1]";

    public static String sportsShoes_firstShoeName = "/html/body/div[3]/table/tbody/tr[1]/td[1]";


    public static void formalShoes_verifyTitle() {

        String expectedTitle = "Formal Shoes ";
        String actualTitle = driver.findElement(By.xpath(formalShoes_xpath)).getText();
        Assert.assertEquals(expectedTitle, actualTitle);
        if (expectedTitle.equals(actualTitle)) {

            test.log(Status.PASS, "Test Passed for title verification of Formal shoes");
        } else {

            test.log(Status.FAIL, "Test FAILED for title verification of Formal shoes");

        }

    }

    public static void sportsShoes_verifyTitle() {

        String actualTitle = driver.findElement(By.xpath(sportsShoes_xpath)).getText();
        String expectedTitle = "Sports Shoes";
        Assert.assertEquals(expectedTitle, actualTitle);
        if (expectedTitle.equals(actualTitle)) {

            test.log(Status.PASS, "Test Passed for title verification of Sports shoes");

        } else {

            test.log(Status.FAIL, "Test FAILED for title verification of Sports shoes");

        }

    }

    public static void sneakers_verifyTitle() {

        String actualTitle = driver.findElement(By.xpath(sneakers_xpath)).getText();
        String expectedTitle = "Sneakers";
        Assert.assertEquals(expectedTitle, actualTitle);
        if (expectedTitle.equals(actualTitle)) {

            test.log(Status.PASS, "Test Passed for title verification of Sneakers shoes");
        } else {

            test.log(Status.FAIL, "Test FAILED for title verification of Sneakers shoes");

        }

    }

    public static void formalShoes_firstShoe_verify() {

        String expectedFirstFormalShoe = "   Classic Cheltenham";
        driver.findElement(By.xpath(formalShoesDropdown_xpath)).click();
        String actualFirstFormalShoe = driver.findElement(By.xpath(formalShoes_firstShoeName)).getText();
        Assert.assertEquals(expectedFirstFormalShoe, actualFirstFormalShoe);
        if (expectedFirstFormalShoe.equals(actualFirstFormalShoe)) {

            test.log(Status.PASS, "Test Passed for first Formal shoe name i.e." + actualFirstFormalShoe);
        } else {

            test.log(Status.FAIL, "Test FAILED for first Formal shoe name i.e." + actualFirstFormalShoe);

        }

    }

    public static void sportsShoes_firstShoe_verify() {

        String expectedFirstSportShoe = "   Ultimate";
        driver.findElement(By.xpath(sportsShoesDropdown_xpath)).click();
        String actualFirstSportsShoe = driver.findElement(By.xpath(sportsShoes_firstShoeName)).getText();
        Assert.assertEquals(expectedFirstSportShoe, actualFirstSportsShoe);
        if (expectedFirstSportShoe.equals(actualFirstSportsShoe)) {

            test.log(Status.PASS, "Test Passed for first Sports shoe name i.e." + actualFirstSportsShoe);
        } else {

            test.log(Status.FAIL, "Test FAILED for first Sports shoe name i.e." + actualFirstSportsShoe);

        }

    }


}





















