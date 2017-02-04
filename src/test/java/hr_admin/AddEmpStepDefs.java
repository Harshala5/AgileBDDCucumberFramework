package hr_admin;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hr_admin.utils.Utilities;
import org.junit.Assert;
import org.openqa.selenium.By;

import static hr_admin.BasePage.driver;

public class AddEmpStepDefs {
    DashBoardPage dashboardPage = new DashBoardPage();
    EmployeeListPage employeePage = new EmployeeListPage();


    @Given("^Admin is on the Dashboard page$")
    public void verifyDashboardPage(){
        Assert.assertTrue(dashboardPage.verifyUserIsOnDashboardPage());
    }

    @When("^Admin clicks on the PIM Module$")
    public void verifyPIMModle() {
        employeePage.pimModule();
    }

    @And("^Admin clicks on the 'Add Employee' tab$")
    public void addEmpTab() {
        employeePage.addEmployeeTab();
    }

    @Then("^Admin can view the 'Add Employee' page$")
    public void verifyAddEmpPage() {
        Assert.assertTrue(employeePage.addEmpPage());
    }

    @Given("^Admin is in the 'Add Employee' page$")
    public void addEmpPage() {
        Assert.assertTrue(employeePage.addEmpPage());
    }

    @When("^Admin enters the Employee name in the respective 3 fields of 'Full Name'$")
    public void enterFullName() {
        employeePage.enterFirstName("abc");
        employeePage.enterMiddleName("def");
        employeePage.enterLastName("ghi");
    }

    @Then("^Admin checks the field 'Create Login Details'$")
    public void loginDetailsCheckBox() {
        employeePage.checkLoginDetails();
    }

    @And("^Admin enters data in 'User Name', 'Password', 'Confirm Password' fields$")
    public void empUserCredentials(String userName, String password, String confPassword) {
        employeePage.enterEmpUserName("testing1");
        employeePage.enterEmpPassword("123456");
        employeePage.reenterEmpPassword("123456");
    }

    @Then("^Admin selects any option in the drop down menu of 'Status' and 'Location' fields and saves it$")
    public void selectStatusLocation(String status, String location) {
        Utilities.selectFromList(By.id("status"), status);
        Utilities.selectFromList(By.id("location"), location);
        employeePage.saveEmpButton();
    }

    @And("^Admin enters into 'Employee Information' page and can view the entered result in the list$")
    public void verifyEmpResult(){
        Assert.assertTrue(employeePage.empEntryResult());
    }















}
