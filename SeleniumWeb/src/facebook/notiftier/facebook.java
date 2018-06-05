package facebook.notiftier;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

import static java.lang.Thread.sleep;

public class facebook {
    public static String driverPath = "C:\\Users\\Nathan Getachew\\Desktop\\SeleniumWeb\\";
    static WebDriver driver = new ChromeDriver();
    Robot robot;
    static String facebookEmail = "nathygech111@gmail.com";
    static String facebookPassword = "111adminpassword";
    public static void main(String[] args) throws Exception {

        while (true)
        {
            System.out.println("launching chrome browser");
            System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
            driver.manage().window().maximize();

            {
                driver.get( "http://www.facebook.com/" );
                WebElement formEmail = driver.findElement(By.name("email"));
                formEmail.sendKeys(facebookEmail);
                WebElement formPassword = driver.findElement(By.name("pass"));
                formPassword.sendKeys(facebookPassword);
                formPassword.submit();
                if ( driver.getCurrentUrl().contains("login.php") )
                {
                    throw new Exception("Failed to login Facebook as '" + facebookEmail + "' using password '" + facebookPassword + "', I ended up here '" + driver.getCurrentUrl() + "'");
                }

//                Thread.sleep(5000);
                WebElement notification = driver.findElement(By.id("notificationsCountValue"));      //the Xpath === //*[@id="notificationsCountValue"]
                String noti = notification.getText();
                WebElement webName = driver.findElement(By.xpath("//*[@id=\"u_0_a\"]/div[1]/div[1]/div/a/span/span"));
                String name = webName.getText();

                int notificationValue = Integer.parseInt(noti);



                if (notificationValue > 0){
                    System.out.println(name + " You have " + notificationValue + " unread notifications\n" +
                            "From " + driver.getCurrentUrl() + "");
                }
            }
            sleep(30000);
        }
    }

    }
