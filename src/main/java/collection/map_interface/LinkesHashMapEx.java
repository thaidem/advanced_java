package collection.map_interface;

import java.util.LinkedHashMap;

public class LinkesHashMapEx {
  public static void main(String[] args) {

    LinkedHashMap<Double, Student> linkedHashMap = new LinkedHashMap<>();

    Student st1 = new Student("Dmitri", "Kozlov", 3);
    Student st2 = new Student("Elena", "Petrova", 1);
    Student st3 = new Student("Petr", "Ivanov", 4);
    Student st4 = new Student("Igor", "Sidorov", 3);

    linkedHashMap.put(7.2, st3);
    linkedHashMap.put(7.5, st4);
    linkedHashMap.put(5.8, st1);
    linkedHashMap.put(6.4, st2);

    System.out.println(linkedHashMap);

  }
}
