package testNGtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class groupingconcepts {
	@Test(groups = {"moto"})
	public void moto1() {
		System.out.println("moto1 testing");
	}
	@Test(groups = {"moto"})
	public void moto2() {
		System.out.println("moto2 testing");
	}
	@Test(groups = {"vivo"})
	public void vivo1() {
		System.out.println("vivo1 testing");
	}
	@Test(groups = {"vivo"})
	public void vivo2() {
		System.out.println("vivo2 testing");
	}
	@Test(groups = {"mi"})
	public void mi1() {
		System.out.println("mi1 testing");
	}
	@Test(groups = {"mi"})
	public void mi2() {
		System.out.println("mi2 testing");
	}
	@Test
	public void launchgoogle() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
}
}