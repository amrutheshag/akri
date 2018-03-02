package com.VIPS.test;


import org.testng.annotations.Test;
import com.VIPS.page.LoginPage;
import generic.BaseTest;
import generic.Excel;

public class ValidLogin extends BaseTest
{
	
	@Test
	public void Login(){
		String un=Excel.getCellValue(XLPATH,"credentials",2,2);
		String pw=Excel.getCellValue(XLPATH,"credentials",3,2);
//		String un="amrutheshgavirangapp";
//		String pw="g123";
		
		LoginPage l=new LoginPage(driver);
		l.enterUserName(un);
		l.enterPassword(pw);
		l.clickLogin();
	}
}
