package collection.map_interface;

import java.util.HashMap;

public class HashMapEx1 {
  public static void main(String[] args) {
    HashMap<Integer, String> map1 = new HashMap<>();
    map1.put(1000, "Dem Kozlov");
    map1.put(3000, "Ivan Petrov");
    map1.put(7000, "Petr Ivanov");
    map1.put(11000, "Elena Sidorova");
    map1.putIfAbsent(1000, "Oleg Sergeev");
    System.out.println(map1);
//    System.out.println(map1.get(1000));
//    map1.remove(3000);
//    System.out.println(map1);
//    System.out.println(map1.containsValue("Elena Sidorova"));
//    System.out.println(map1.containsKey(1000));
    System.out.println(map1.keySet());
    System.out.println(map1.values());
  }
}
