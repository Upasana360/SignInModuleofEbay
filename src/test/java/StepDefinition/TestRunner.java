package StepDefinition;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//Code for TestNG
@CucumberOptions(features="src\\test\\resources\\Features\\org.login.feature",
glue= {"StepDefinition"},strict=true,monochrome=false,
plugin= {"pretty","html:target/htmlreports","json:target/jsonreports/jsonreports.json"})
public class TestRunner extends AbstractTestNGCucumberTests{
	
}
//Code for Junit
//@RunWith(Cucumber.class)
//@CucumberOptions(features="src\\test\\resources\\Features\\org.login.feature\\SignInModule.feature",
//glue= {"StepDefinition"},strict=true,monochrome=false)
////plugin= {"pretty","html:target/htmlreports","json:target/jsonreports/jsonreports.json",
////"junit:target/junitreports/junitreports.xml"})
//public class TestRunner {
//
//}

