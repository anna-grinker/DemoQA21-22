package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssLocators {
    WebDriver driver;

    @Test
    public void textBox() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        WebElement inputFullName = driver.findElement(By.cssSelector("input[id='userName']"));
        //WebElement inputFullName = driver.findElement(By.cssSelector("input[#userName]")); //wrong
        System.out.println("-->" + inputFullName.getAttribute("placeholder"));

        WebElement currentAddress = driver.findElement(By.cssSelector("[placeholder='Current Address']"));
        System.out.println("-->" + currentAddress.getTagName());

        WebElement address = driver.findElement(By.cssSelector("#permanentAddress-label"));
        WebElement address1 = driver.findElement(By.id("permanentAddress-label"));
        System.out.println("-->" + address.getText());
        System.out.println("-->" + address1.getText());
        driver.quit();
    }

    @Test//!!!!!!!!!!!!!!!!!!fail
    public void checkBox() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");
        WebElement svg = driver.findElement(By.cssSelector("span[class='rct-text']>label>span[class='rct-node-icon']>svg")); //down to tree
        System.out.println("-->"+svg.getAttribute("fill"));
        driver.quit();
    }

        @Test
    public void radioButton(){
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        WebElement elementP = driver.findElement(
                By.cssSelector("div[class='col-12 mt-4 col-md-6'] :nth-child(2) :nth-child(4)"));
                //By.cssSelector("div[class='col-12 mt-4 col-md-6'] :nth-child(2)>p")); - doesn't function
                //By.cssSelector("p[@class='mt-3']")); - doesn't function
                //div[class='col-12 mt-4 col-md-6']:nth-child(2):last-child - doesn't function
            System.out.println("-->"+elementP.getText());
            driver.quit();
        }





}
