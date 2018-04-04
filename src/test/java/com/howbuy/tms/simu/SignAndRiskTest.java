package com.howbuy.tms.simu;

import com.howbuy.simu.OnlineTradePageSimu;
import com.howbuy.tms.BaseTestCase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * 风险测评
 * Created by yang.zhou on 2017/11/6.
 */
public class SignAndRiskTest extends BaseTestCase {


    @Test
    public void signAndRiskTest() throws Exception {
        OnlineTradePageSimu tradePage = PageFactory.initElements(driver, OnlineTradePageSimu.class);
        tradePage.signAndRiskValuation("330100197901016848");
    }

    @Test
    public void signAndRiskTest01() throws Exception {
        OnlineTradePageSimu tradePage = PageFactory.initElements(driver, OnlineTradePageSimu.class);
        tradePage.signAndRiskValuation("330100198101011437");
    }

    @Test
    public void signAndRiskTest02() throws Exception {
        OnlineTradePageSimu tradePage = PageFactory.initElements(driver, OnlineTradePageSimu.class);
        tradePage.signAndRiskValuation("330100198701015829");
    }
}