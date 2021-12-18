package Guru99.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resources",
        glue = "Guru99/Step_Definitions",
        tags = "@Smoke",
        dryRun= false             // it will check if there is undefined steps definitions
//        plugin ={  "pretty",
//                "html:target/default-cucumber-reports.html",
//                "json:target/cucumber.json",
//                "rerun:target/rerun.txt"
//        }
//        publish = true,       // It will share your HTML report in Cucumber server, you can see your report online
//        monochrome = true     // It will provide more details in the console


)
public class TestRunner {
}