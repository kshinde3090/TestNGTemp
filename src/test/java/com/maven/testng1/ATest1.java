package com.maven.testng1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ATest1 {
	
	
	@Test(groups={"aa","bb","cc"},expectedExceptions=ArithmeticException.class)
	public void aTest1(){
		System.out.println("aTest1");
		int i=10/0;
	}
	@Test(dependsOnMethods="aTest3",ignoreMissingDependencies=false)
	public void aTest2(){
		System.out.println("aTest2");
	}
	@Test(dependsOnGroups="aa")
	public void aTest3(){
		System.out.println("aTest3");
		int i=10/0;
	}
	@Test(dependsOnMethods="aTest3",alwaysRun=true)
	public void aTest4(){
		System.out.println("aTest4");
	}
}
