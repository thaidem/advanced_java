package collection.set_intreface;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
  public static void main(String[] args) {
    Set<String> set = new HashSet<>();
    set.add("Zaur");
    set.add("Dem");
    set.add("Oleg");
    set.add("Elena");
//    set.add(null);
//    System.out.println(set);
    set.remove("Zaur");

    for(String s : set) {
      System.out.println(s);
    }
    System.out.println(set.contains("Misha"));
//    System.out.println(set.getClass());
  }
}
