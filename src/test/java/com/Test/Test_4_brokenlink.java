package com.Test;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Utility.BaseClass;
import com.Utility.Library;

public class Test_4_brokenlink extends BaseClass{

	@Test
	public void verifybrokenLink() throws IOException {
		
		List<WebElement> list=driver.findElements(By.tagName("a"));
		
		
		for(int i=0;i<list.size();i++) {
			WebElement ele=list.get(i);
			String url=ele.getAttribute("href");
			Library.verifybrokenlink(url);
		}
		
		
		
		
		
		
		
		
	}
}
