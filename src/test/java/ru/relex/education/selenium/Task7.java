package ru.relex.education.selenium;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task7 {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {
        //driver = new InternetExplorerDriver();
        //driver = new FirefoxDriver();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void checkTheMenu() {
        driver.get("http://localhost/litecart/admin/");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();

        try {
            driver.wait(10);
            driver.findElement(By.xpath("//span[text()='Appearence']")).click();
            //заголовок Template
            driver.findElement(By.xpath("//span[text()='Logotype']")).click();
            //заголовок Logotype

            driver.findElement(By.xpath("//span[text()='Catalog']")).click();
            //заголовок Catalog
            driver.findElement(By.xpath("//span[text()='Product Groups']")).click();
            //заголовок Product Groups
            driver.findElement(By.xpath("//span[text()='Option Groups']")).click();
            //заголовок Option Groups
            driver.findElement(By.xpath("//span[text()='Manufacturers']")).click();
            //заголовок Manufacturers
            driver.findElement(By.xpath("//span[text()='Suppliers']")).click();
            //заголовок Suppliers
            driver.findElement(By.xpath("//span[text()='Delivery Statuses']")).click();
            //заголовок Delivery Statuses
            driver.findElement(By.xpath("//span[text()='Sold Out Statuses']")).click();
            //заголовок Sold Out Statuses
            driver.findElement(By.xpath("//span[text()='Quantity Units']")).click();
            //заголовок Quantity Units
            driver.findElement(By.xpath("//span[text()='CSV Import/Export']")).click();
            //заголовок CSV Import/Export


            driver.findElement(By.xpath("//span[text()='Countries']")).click();
            //заголовок Countries

            driver.findElement(By.xpath("//span[text()='Currencies']")).click();
            //заголовок Currencies

            driver.findElement(By.xpath("//span[text()='Customers']")).click();
            //заголовок Customers
            driver.findElement(By.xpath("//span[text()='CSV Import/Export']")).click();
            //заголовок CSV Import/Export
            driver.findElement(By.xpath("//span[text()='Newsletter']")).click();
            //заголовок Newsletter

            driver.findElement(By.xpath("//span[text()='Geo Zones']")).click();
            //заголовок Geo Zones

            driver.findElement(By.xpath("//span[text()='Languages']")).click();
            //заголовок Languages
            driver.findElement(By.xpath("//span[text()='Storage Encoding']")).click();
            //заголовок Storage Encoding

            driver.findElement(By.xpath("//span[text()='Modules']")).click();
            //заголовок Job Modules
            driver.findElement(By.xpath("//span[text()='Customer']")).click();
            //заголовок Customer Modules
            driver.findElement(By.xpath("//span[text()='Shipping']")).click();
            //заголовок Shipping Modules
            driver.findElement(By.xpath("//span[text()='Payment']")).click();
            //заголовок Payment Modules
            driver.findElement(By.xpath("//span[text()='Order Total']")).click();
            //заголовок Order Total Modules
            driver.findElement(By.xpath("//span[text()='Order Success']")).click();
            //заголовок Order Success Modules
            driver.findElement(By.xpath("//span[text()='Order Action']")).click();
            //заголовок Order Action Modules

            driver.findElement(By.xpath("//span[text()='Orders']")).click();
            //заголовок Orders
            driver.findElement(By.xpath("//span[text()='Order Statuses']")).click();
            //заголовок Order Statuses

            driver.findElement(By.xpath("//span[text()='Pages']")).click();
            //заголовок Pages

            driver.findElement(By.xpath("//span[text()='Reports']")).click();
            //заголовок Monthly Sales
            driver.findElement(By.xpath("//span[text()='Most Sold Products']")).click();
            //заголовок Most Sold Products
            driver.findElement(By.xpath("//span[text()='Most Shopping Customers']")).click();
            //заголовок Most Shopping Customers

            driver.findElement(By.xpath("//span[text()='Settings']")).click();
            //заголовок Settings
            driver.findElement(By.xpath("//span[text()='Defaults']")).click();
            //заголовок Settings
            driver.findElement(By.xpath("//span[text()='General']")).click();
            //заголовок Settings
            driver.findElement(By.xpath("//span[text()='Listings']")).click();
            //заголовок Settings
            driver.findElement(By.xpath("//span[text()='Images']")).click();
            //заголовок Settings
            driver.findElement(By.xpath("//span[text()='Checkout']")).click();
            //заголовок Settings
            driver.findElement(By.xpath("//span[text()='Advanced']")).click();
            //заголовок Settings
            driver.findElement(By.xpath("//span[text()='Security']")).click();
            //заголовок Settings

            driver.findElement(By.xpath("//span[text()='Slides']")).click();
            //заголовок Slides

            driver.findElement(By.xpath("//span[text()='Tax']")).click();
            //заголовок Tax Classes
            driver.findElement(By.xpath("//span[text()='Tax Rates']")).click();
            //заголовок Tax Rates

            driver.findElement(By.xpath("//span[text()='Translations']")).click();
            //заголовок Search Translations
            driver.findElement(By.xpath("//span[text()='Scan Files']")).click();
            //заголовок Scan Files For Translations
            driver.findElement(By.xpath("//span[text()='CSV Import/Export']")).click();
            //заголовок CSV Import/Export

            driver.findElement(By.xpath("//span[text()='Users']")).click();
            //заголовок Users

            driver.findElement(By.xpath("//span[text()='vQmods']")).click();
            //заголовок vQmods
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    @After
    public void stop() {
        driver.quit();
        driver = null;
    }
}
