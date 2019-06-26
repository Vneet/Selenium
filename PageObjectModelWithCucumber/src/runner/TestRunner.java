package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="features" ,glue= {"stepdefination"} )

//Execute all tests which are not at all tagged in all the Features using "~@SmokeTest"
public class TestRunner {

}
