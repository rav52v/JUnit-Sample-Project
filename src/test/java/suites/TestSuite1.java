package test.java.suites;

import org.junit.Assert;
import org.junit.Test;
import test.java.config.Skip;
import test.java.config.TestRules;

public class TestSuite1 extends TestRules {

  @Test
  public void test1() {
    Skip.IF(true);
    System.out.println("---- I'm the test 1 (TestSuite1)");
    Assert.assertEquals(2,2);
  }
}
