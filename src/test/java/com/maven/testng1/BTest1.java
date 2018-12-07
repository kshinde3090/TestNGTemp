package com.maven.testng1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class BTest1 {

	@Test(enabled=false)
	public void bTest1(){
		System.out.println("bTest1");
	}
	@Test(groups={"aa"},priority=1,timeOut=5000)
	public void bTest2() throws InterruptedException{
		for(int i=1;i<10000;i++){
			Thread.currentThread().sleep(1000);
			System.out.println("bTest2");
				
		}
		
	}
	@BeforeClass
	@Test(invocationCount=8)
	// bTest3 executed 8 times
	public void bTest3(){
		System.out.println("bTest3");
	}
	@Test(groups={"bb","aa"})
	public void bTest4(){
		System.out.println("bTest4");
	}
}
