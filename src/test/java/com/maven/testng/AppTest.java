package com.maven.testng;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AppTest{
	Object[][] objs=new Object[6][3];
	@DataProvider(name="getData")
	public Object[][] getData(){
		objs[0][0]=null;
		objs[0][1]="kskjfd";
		objs[0][2]=AppConstant.NULL_USERNAME;
		
		
		objs[1][0]="#23ksjddf";
		objs[1][1]=null;
		objs[1][2]=AppConstant.NULL_PASSWORD;
		
	

		objs[2][0]="";
		objs[2][1]="dfds";
		objs[2][2]=AppConstant.EMPTY_USERNAME;
		
		objs[3][0]="kishor";
		objs[3][1]="";
		objs[3][2]=AppConstant.EMPTY_PASSWORD;
		
		
		objs[4][0]="kishor";
		objs[4][1]="kishor#23";
		objs[4][2]=AppConstant.INVALID_USERNAME_AND_PASSWORD;
		
		
		objs[5][0]="kishor";
		objs[5][1]="kishor12";
		objs[5][2]=AppConstant.LOGIN_SUCCESSFULL;
		
		
		return objs;
		
	}
	@Test(dataProvider="getData")
	public void verifyUser(String username,String password,String exceptedResult){
		App a=new App();
		AssertJUnit.assertEquals(a.authonticateUser(username, password), exceptedResult);
		
	}
	
	
}