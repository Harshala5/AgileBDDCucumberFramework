package hr_admin;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import static hr_admin.BasePage.driver;

public class AddJobTitleStepDefs {
    DashBoardPage dashboardPage = new DashBoardPage();
    JobTitlesPage jobTitlesPage = new JobTitlesPage();

    @Given("^Admin is on the Dashboard page$")
    public void verifyDashboardPage() {
        Assert.assertTrue(dashboardPage.verifyUserIsOnDashboardPage());
    }

    @When("^Admin clicks on the 'Job' tab in Admin module$")
    public void clickJobTab() {
        jobTitlesPage.adminTab();
        jobTitlesPage.jobTab();
    }

    @Then("^Admin clicks on 'Job Titles' option in drop down menu$")
    public void selectJobTitlesOption(){
        jobTitlesPage.jobTitleOption();
    }

    @And("^Admin should view the Job Titles page with Add and Delete Buttons$")
    public void viewJobTitlePage(){
        Assert.assertTrue(jobTitlesPage.verifyJobTitlePage());
    }

    @Given("^Admin is on the JobTitles page$")
    public void verifyJobTitlesPage(){
        Assert.assertTrue(jobTitlesPage.verifyJobTitlePage());
    }

    @When("^Admin clicks on the Add button$")
    public void adminClicksAddButton(){
        jobTitlesPage.addButton();
    }

    @And("^Admin enters into the add job title page$")
    public void verifyAddJobTitlePage(){
        Assert.assertTrue(jobTitlesPage.verifyaddJobTitlePage());
    }

    @Then("^Admin enters name and description in the respective text fields and selects save button$")
    public void enterJobTitleData(String title, String description) {
        jobTitlesPage.enterTitle("Junior Tester");
        jobTitlesPage.enterDescription("Junior Manual and Automation Tester");
        jobTitlesPage.saveTitle();
    }

    @And("^Admin should see the entered result in the Job title table$")
    public void resultTable(){
        Assert.assertTrue(jobTitlesPage.verifyEntryResult());
    }


}
