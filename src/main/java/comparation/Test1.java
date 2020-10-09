package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    list.add("Eva");
    list.add("Dem");
    list.add("Sasha");
    System.out.println("Before " + list);
    Collections.sort(list);
    System.out.println("After " + list);
  }
}
