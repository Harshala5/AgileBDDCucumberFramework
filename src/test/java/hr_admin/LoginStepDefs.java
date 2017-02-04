package hr_admin;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hr_admin.utils.BrowserFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static hr_admin.BasePage.driver;

public class LoginStepDefs {
   // WebDriver driver = BrowserFactory.getCurrentDriver();
    DashBoardPage dashBoardPage=new DashBoardPage();
    LoginPage loginPage=new LoginPage();


    @Given("^Admin is on the login page$")
    public void adminIsOnLoginPage() {
        Assert.assertTrue(loginPage.verifyUserisOnLoginPage());
    }

    @When("^Admin enters username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void enterAdminCredentials(String username, String password) {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("aediMNjU");
    }

    @And("^Admin clicks on login button$")
    public void clickLogin(){
            loginPage.selectLogin();
    }

    @Then("^Admin should login succssfully$")
    public void verifyLogin(){
        Assert.assertTrue(dashBoardPage.verifyUserIsOnDashboardPage());
    }

    @And("^Admin should see a welcome message as \"([^\"]*)\"$")
    public void verifyWelcomeMessage(String welcomeMessage){
        Assert.assertTrue(dashBoardPage.verifyWelcomeMessage(welcomeMessage));
    }
}
