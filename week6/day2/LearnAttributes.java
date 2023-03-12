package testcase;

import org.testng.annotations.Test;

public class LearnAttributes {
	
	
	 @Test(priority=1,timeOut=500)
	  public void atest3() throws InterruptedException {
		 Thread.sleep(3000);
		  System.out.println("Test3 is successful");
		//  throw new RuntimeException("To chk dependency");
	  }
	
	 @Test(enabled=false)
	  public void btest1() {
		  System.out.println("Test 1 is successful");
	  }
	  
	  @Test(priority=2,invocationCount=2,threadPoolSize=1,invocationTimeOut=300)
	  public void ctest2() throws InterruptedException {
		  Thread.sleep(5000);
		  System.out.println("Test2 is Successful");
	  }	  
	  //ASCII 
	  
	  @Test(dependsOnMethods={"atest3","ctest2"},alwaysRun=true)
	  public void dtest4() {
		  System.out.println("Test 4 is successful");
	  }
	  


}
