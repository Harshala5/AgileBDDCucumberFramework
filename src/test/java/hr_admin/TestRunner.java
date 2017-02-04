package hr_admin;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/features/", tags = "@login, @jobModule, @addJobTitle, @pimModule, @addEmployee, @skillPage, @addSkill, @userManagementModule, @addUserRole",

        format = "html:target/CucumberHTMLReports")

public class TestRunner {
}
