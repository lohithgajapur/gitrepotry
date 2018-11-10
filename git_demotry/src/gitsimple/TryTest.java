package gitsimple;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TryTest {
	
	@Test
	public void simp(){
		
		System.out.println("---------GIT---------");	
		
		 System.setProperty("webdriver.chrome.driver","G:\\Java_Software_Latest_version\\2.4 chrome driver\\chromedriver.exe");
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://www.google.com");
		 String s=driver.getTitle();
		 System.out.println(s+"---------");
		 System.out.println("hello");
		 System.out.println("llllooohhiittthh--");
		System.out.println("1min");
		System.out.println("2min tag added");
		System.out.println("tag proper");
		System.out.println("v4.00");
		System.out.println("simple branch------");
		System.out.println("master branch--------");
	}

}
