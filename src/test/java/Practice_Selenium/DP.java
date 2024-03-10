package Practice_Selenium;


import org.testng.annotations.DataProvider;

public class DP {
 
  @DataProvider(parallel= true)
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"chrome" },
      new Object[] { "firefox" },
      new Object[] { "edge" },
    };
  }
}
