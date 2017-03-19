package hr_admin;


import org.openqa.selenium.By;

import java.util.Random;

public class EmployeeListPage extends BasePage {
    Random random = new Random();
    public void pimModule(){
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
    }

    public void addEmployeeTab(){
        driver.findElement(By.id("menu_pim_addEmployee")).click();
    }

    public boolean addEmpPage() {
        return driver.getCurrentUrl().contains("Add Employee");
    }

    public void enterFirstName(String firstName) {
        driver.findElement(By.id("firstName")).sendKeys(firstName);
    }

    public void enterMiddleName(String middleName){
        driver.findElement(By.id("middleName")).sendKeys(middleName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(By.id("lastName")).sendKeys(lastName);
    }

    public void checkLoginDetails(){
        driver.findElement(By.id("chkLogin")).click();
    }

    public void enterEmpUserName(String empUserName) {
        driver.findElement(By.id("user_name")).sendKeys(empUserName+random.nextInt());
    }

    public void enterEmpPassword(String empPassword){
        driver.findElement(By.id("user_password")).sendKeys(empPassword);
    }

    public void reenterEmpPassword(String confPassword){
        driver.findElement(By.id("re_password")).sendKeys(confPassword);
    }

    public void saveEmpButton(){
        driver.findElement(By.id("btnSave")).click();
    }

    public boolean empEntryResult(){
        return driver.getCurrentUrl().contains("abc");
    }

}
