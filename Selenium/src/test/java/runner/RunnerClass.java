package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/java/featurefiles/login.features",glue= {"steps"},plugin ="publish")
public class RunnerClass extends AbstractTestNGCucumberTests{

}
