package testNGtest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterizationsample {
	@Test
	@Parameters("Name")
	public void parameterization(String name) {
		System.out.println("name is "+ name);
	}

}
