package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(

        features="src/test/resources/features",

        glue={
                "stepDefinitions",
                "hooks"
        },

        plugin={
                "pretty",
                "tech.grasshopper.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },

        monochrome=true

)


public class TestRunner
        extends AbstractTestNGCucumberTests {
        @Override
        @DataProvider(parallel=true)
        public Object[][] scenarios(){

                return super.scenarios();

        }
}

