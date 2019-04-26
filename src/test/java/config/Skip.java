package test.java.config;

import org.junit.Assume;

public class Skip {

  public static void IF (boolean condition) {
    Assume.assumeFalse(condition);
  }

  public static void UNLESS (boolean condition) {
    Assume.assumeTrue(condition);
  }
}