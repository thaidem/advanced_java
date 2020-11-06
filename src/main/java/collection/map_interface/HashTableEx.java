package collection.map_interface;

import java.util.Hashtable;

public class HashTableEx {
  public static void main(String[] args) {
    Hashtable<Double, Student> hashTable = new Hashtable<>();
    Student st1 = new Student("Dmitri", "Kozlov", 3);
    Student st2 = new Student("Elena", "Petrova", 1);
    Student st3 = new Student("Petr", "Ivanov", 4);
    Student st4 = new Student("Igor", "Sidorov", 3);

    hashTable.put(7.8, st1);
    hashTable.put(9.3, st2);
    hashTable.put(5.7, st3);
    hashTable.put(6.0, st4);
    System.out.println(hashTable);
  }
}
