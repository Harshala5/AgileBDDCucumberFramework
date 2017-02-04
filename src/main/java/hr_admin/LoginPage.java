package hr_admin;


import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    public boolean verifyUserisOnLoginPage() {
      return driver.findElement(By.id("btnLogin")).isDisplayed();
    }

    public void enterUserName(String username){
        driver.findElement(By.id("txtUsername")).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(By.id("txtPassword")).sendKeys(password);
    }

    public void selectLogin() {
        driver.findElement(By.id("btnLogin")).click();
    }


}
