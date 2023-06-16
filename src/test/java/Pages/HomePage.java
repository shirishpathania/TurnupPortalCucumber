package Pages;

import Utils.CommonDriver;
import Utils.WaitHelpers;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends CommonDriver {

    public void GoToTMPage(WebDriver driver)
    {

        // navigate to home page and check if user has logged in Successfully
        WebElement helloHari = driver.findElement(By.xpath("//*[@id='logoutForm']/ul/li/a"));

        //if (helloHari.Text == "Hello hari!")
        //{
        //    Assert.Pass("login successful, Test passed");
        //}
        //else
        //{
        //    Assert.Fail("login failed, Test failed");
        //}

        WaitHelpers.WaitToBeVisible(driver, "xpath", "//*[@id='logoutForm']/ul/li/a", 15);
//        Assert.isTrue(helloHari.getText() == "Hello hari!", "login failed, Test failed");

        // Click on Administration tab
        WebElement administrationTab = driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[5]/a"));
        administrationTab.click();

        // Select Time and Material from the dropdown list
        WebElement tmOption = driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[5]/ul/li[3]/a"));
        tmOption.click();
    }

    public void GoToEmployeePage(WebDriver driver)
    {

    }
}
