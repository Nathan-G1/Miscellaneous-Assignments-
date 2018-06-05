package SeleniumP1;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;


public class News {
    public static String driverPath = "C:\\Users\\Nathan Getachew\\Desktop\\SeleniumWeb\\";
    static WebDriver driver = new ChromeDriver();
    Robot robot;
    static String facebookEmail = "you@domain.com";
    static String facebookPassword = "password";

    public static void main(String[] args) throws Exception {

        while (true) {
            System.out.println("launching chrome browser");
            System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            driver.get("https://www.bbc.com/news/uk");
            ArrayList<WebElement> webEleentList = (ArrayList<WebElement>) driver.findElements(By.className("pigeon__column pigeon__column--a"));
//            ArrayList<WebElement> webEleentListImages = (ArrayList<WebElement>) driver.findElements(By.className("span2"));
            for (int i = 0; i < webEleentList.size(); i++){

                System.out.println(webEleentList.get(i));

            }


            Checker n = new Checker();
//            WebElement oneData = driver.findElement(By.xpath("//*[@id=\"mp-tfa\"]/p"));
//            WebElement imageData = driver.findElement(By.xpath("//*[@id=\"mp-tfa-img\"]/a/img"));
//

//            String image1 = oneData.getText();
//            String imageSrc = imageData.getAttribute("src");
//            PrintWriter out = new PrintWriter(new PrintWriter("index2.html"));
////            JavascriptExecutor js = (JavascriptExecutor) driver;
////            js.executeScript("return window.stop");
//            driver.get("https://www.addisfortune.net/");
////            ArrayList<WebElement> webEleentList = (ArrayList<WebElement>) driver.findElements(By.className("row"));
////                for(webElement e : webElementList){}
//            for (int i = 0; i < webEleentList.size(); i++){
//                System.out.println(webEleentList.get(i));
//            }
//        PrintWriter fw = new PrintWriter(out, true);
//            out.println(n.getSandwithch(imageSrc) + image1 + n.getWiseSaying());
//            PrintWriter fw = new PrintWriter(out, true);
//            out.println(n.getSandwithch(imageSrc) + image1 + n.getWiseSaying());
//            out.close();

//            driver.get("C:\\Users\\Nathan Getachew\\Desktop\\SeleniumWeb\\index2.html");

//
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        driver.manage().window().maximize();
//        //Set the Script Timeout to 20 seconds
//        driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
//
//        //Declare and set the start time
//        long start_time = System.currentTimeMillis();
//
//        //Call executeAsyncScript() method to wait for 5 seconds
//        js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
//
//        //Get the difference (currentTime - startTime)  of times.
//        System.out.println("Passed time: " + (System.currentTimeMillis() - start_time));
            //xpath is no recommended due to computational problems

            System.out.println("image source" + n.getImgUrl() + "\n " + driver.getTitle() + "here is the string from the paragraph");
            System.out.println(driver.getCurrentUrl());
            System.out.println(driver.getPageSource().toString().length());
//        try{
//            thread.sleep(2000);
//        }catch (Exception e){
//
//        }

//        driver.navigate().forward();
////        searcher.clear();
//        List<WebElement>   webElementList = driver.findElements(By.c)
//                for(webElement e : webElementList){}

            sleep(30000);
        }

    }


}
