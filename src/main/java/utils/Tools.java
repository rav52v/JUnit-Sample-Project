package main.java.utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class Tools {

  public static Collection getData() {
    ArrayList<Object[]> data = new ArrayList<>();
    JSONParser parser = new JSONParser();
    JSONObject rawJson = null;
    try {
      rawJson = (JSONObject) parser.parse(new FileReader("src/test/resources/test_data.json"));
    } catch (IOException | ParseException e) {
      e.printStackTrace();
    }
    Object[] keys = rawJson.keySet().toArray();
    for (Object key : keys) data.add(new Object[]{rawJson.get(key)});
    return data;
  }
}
