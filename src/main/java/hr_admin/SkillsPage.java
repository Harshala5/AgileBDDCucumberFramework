package hr_admin;


import org.openqa.selenium.By;

public class SkillsPage extends BasePage {
    public void adminModTab(){
        driver.findElement(By.id("menu_admin_viewAdminModule")).click();
    }

    public void qualificationTab(){
        driver.findElement(By.id("menu_admin_Qualifications")).click();
    }

    public void selectSkillsOption() {
        driver.findElement(By.id("menu_admin_viewSkills")).click();
    }

    public boolean verifySkillsPage(){
        return driver.getCurrentUrl().contains("Skills");
    }

    public void addSkillBtn() {
        driver.findElement(By.id("btnAdd")).click();
    }

    public boolean verifyAddSkillPage() {
         return driver.getCurrentUrl().contains("Add Skill");
    }

    public void enterSkillName(String skillName) {
        driver.findElement(By.id("skill_name")).sendKeys(skillName);
    }

    public void enterDescription(String description){
        driver.findElement(By.id("skill_description")).sendKeys(description);
    }

    public void saveSkill(){
        driver.findElement(By.id("btnSave")).click();
    }

    public boolean verifySkillResult(){
        return driver.findElement(By.id("recordsListTable")).getText().contains("Name");
    }



}
