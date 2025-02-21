package testNGtest;

import org.testng.annotations.Test;

public class prioritytest {
	@Test
	public void one() {
		System.out.println("ONE");
	}
	@Test
	public void two() {
		System.out.println("TWO");
	}
	@Test(priority = 0)
	public void three() {
		System.out.println("THREE");
	}
	@Test(priority = 1)
	public void four() {
		System.out.println("FOUR");
	}

}
