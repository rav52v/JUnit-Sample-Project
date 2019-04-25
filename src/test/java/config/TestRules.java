package test.java.config;

import org.junit.*;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class TestRules {
  @BeforeClass
  public static void beforeClass() {
    System.out.println("-- I will be executed before each class!");
  }

  @AfterClass
  public static void afterClass() {
    System.out.println("-- I will be executed after each class!");
  }

  @Before
  public void beforeEachTest() {
    System.out.println("--- I will be executed before each test.");
  }

  @After
  public void afterEachTest() {
    System.out.println("--- I will be executed after each test.");
  }

  @Rule
  public TestRule listen = new TestWatcher() {
    @Override
    protected void succeeded(Description description) {
      System.out.println("Test number " + description.testCount()
              + " (name: " + description.getMethodName() + ") SUCCESS");
      super.succeeded(description);
    }

    @Override
    protected void failed(Throwable e, Description description) {
      System.out.println("Test number " + description.testCount()
              + " (name: " + description.getMethodName() + ") FAILED");
      super.failed(e, description);
    }
  };
}