package hr_admin.utils;


import hr_admin.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Utilities extends BasePage{
     public static void selectFromList(By element, String text) {
        Select select = new Select(driver.findElement(element));
        select.selectByVisibleText(text);
    }
}
