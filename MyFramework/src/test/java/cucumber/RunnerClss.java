package cucumber;

import cucumber.api.junit.Cucumber;

public class RunnerClss {
	
	@RunWith(Cucumber.class)
	@CucumberOptions(features="C:\\MyGitProjects\\MyFramework\\src\\test\\java\\cucumber\\login.Feature");

}
