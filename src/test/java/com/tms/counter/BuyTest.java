package com.tms.counter;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import java.util.List;


/**
 * Created by yang.zhou on 2017/9/11.
 */
public class BuyTest {

    private WebDriver driver;

    private static final Log logger = LogFactory.getLog(BuyTest.class.getName());

    @BeforeClass
    public void setDriverClass() throws Exception{
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_2.31\\chromedriver.exe");
        logger.info("========开始执行========");

    }

    @BeforeMethod
    public void setUp() throws Exception{
        driver = new ChromeDriver();

    }

//    @Test
    public void buyProductTest() throws Exception{
        TradeHomePage tradeHomePage = PageFactory.initElements(driver, TradeHomePage.class);
        tradeHomePage.openCounter("http://192.168.221.216:20380/tms-counter-console/tmscounter/html/index.html?operatorNo=s001&operName=s001");
        tradeHomePage.queryCust("1100876504");
        tradeHomePage.entryOrder( "246020", "1200000", "090000");
    }

    @Test
    public void CheckOrderTest() throws Exception{
        TradeHomePage tradeHomePage = PageFactory.initElements(driver, TradeHomePage.class);
        tradeHomePage.openCheckPage("http://192.168.221.216:20380/tms-counter-console/tmscounter/html/index.html?operatorNo=s001&operName=s001");
        List<WebElement> webElements = tradeHomePage.getOrderDetail();
        System.out.println(webElements.size());

        for (WebElement element:webElements){
            System.out.println(element.getText());
        }

        List<WebElement> orderlist = tradeHomePage.getOrderList();

        System.out.println(orderlist.size());
        for (WebElement element: orderlist){
            System.out.println(element.getText());
        }
    }

    @AfterClass
    public void tearDown() throws Exception{
        logger.info("==========测试结束==========");
    }

}