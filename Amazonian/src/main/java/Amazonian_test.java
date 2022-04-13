import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonian_test {
    public static void main(String[] args) throws InterruptedException {
             //setting up the webdriver
         System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\Documents\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.in/");//passing the url we need to automate

        System.out.println("successfully done");


        WebElement input_tag=driver.findElement(By.xpath("//div[@id='nav-search']//child::input[1]"));
        WebElement search=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));//search

        input_tag.sendKeys("books");
        search.click();
//        Thread.sleep(20000); this is used to stop the main method and fectch the method
 //first book
        WebElement First_book=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));//search


        String name=First_book.getText();
        System.out.println(name);



    }


}