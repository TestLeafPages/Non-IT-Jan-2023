package learnParametrization;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Testdata {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  System.out.println(n +"" +s);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
