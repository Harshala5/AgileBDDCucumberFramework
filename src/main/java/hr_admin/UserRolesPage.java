package hr_admin;


import org.openqa.selenium.By;

public class UserRolesPage extends BasePage {
    public boolean verifyDashBoardPage(){
        return driver.getCurrentUrl().contains("dashboard");
    }

    public void userManagementTab() {
        driver.findElement(By.id("menu_admin_UserManagement")).click();
    }

    public void userRolesTab() {
        driver.findElement(By.id("menu_admin_viewUserRoles")).click();
    }

    public boolean verifyUserRolesPage() {
        return driver.getCurrentUrl().contains("User Roles");
    }

    public void addButton() {
        driver.findElement(By.id("btnAdd")).click();
    }

    public boolean addUserRolePage() {
        return driver.getCurrentUrl().contains("Add User Role");
    }

    public void enterUserRoleName(String userRoleName){
        driver.findElement(By.id("userrole_name")).sendKeys(userRoleName);
    }

    public void selectAdd(){
        driver.findElement(By.id("btnSave")).click();

    }

    public boolean entryResult() {
        return driver.getCurrentUrl().contains("test1");

    }

}
