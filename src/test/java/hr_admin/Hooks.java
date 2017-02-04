package hr_admin;


import cucumber.api.java.After;
import cucumber.api.java.Before;

import hr_admin.utils.BrowserFactory;



public class Hooks {
    String browser = "Chrome";
    String baseURL = "http://sbtechnos11.trial52.orangehrmlive.com/";

    @Before
    public void startBrowser() {
        BrowserFactory.startBrowser(browser, baseURL);
    }

    @After
    public void stopBrowser() {
        BrowserFactory.stopBrowser();
    }


}
