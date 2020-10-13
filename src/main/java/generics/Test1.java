package generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
//    list.add("OK");
//    list.add(7);
//    list.add(new StringBuffer("vvfbfdhfdsfdfdfs"));
//    list.add(new Car());
    list.add("hi");
    list.add("bye");
    list.add("yes");
    list.add("no");
//    list.add(new Car());

    for(Object o : list) {
      System.out.println(o + " length " + ((String) o).length());
    }

  }
}

class Car {}