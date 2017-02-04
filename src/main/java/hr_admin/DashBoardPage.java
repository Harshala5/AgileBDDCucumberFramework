package hr_admin;


import org.openqa.selenium.By;

public class DashBoardPage extends BasePage {
    public boolean verifyWelcomeMessage(String welcomeMessage) {
        return driver.findElement(By.id("welcome")).getText().equals(welcomeMessage);
    }

    public boolean verifyUserIsOnDashboardPage() {
        return driver.getCurrentUrl().contains("dashboard");
    }
}
