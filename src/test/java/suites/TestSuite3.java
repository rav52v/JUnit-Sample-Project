package test.java.suites;

import main.java.utils.Tools;
import org.json.simple.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import test.java.config.TestRules;

import java.util.Collection;

@RunWith(Parameterized.class)
public class TestSuite3 extends TestRules {

  @Parameterized.Parameter
  public JSONObject json;

  @Parameterized.Parameters
  public static Collection data() {
    return Tools.getData();
  }

  @Test
  public void test1() {
    System.out.println("---- I'm the test 1 (TestSuite3)");
    System.out.println("###---Parametrized---###\n"
            + "test name: " + json.get("test_name")
            + "\nusername: " + json.get("username")
            + "\npassword: " + json.get("password")
            + "\n###---Parametrized---###");
  }
}
