package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
  public static void main(String[] args) {
    ArrayList<String> arrayList1 = new ArrayList<>();
    arrayList1.add("Zaur");
    arrayList1.add("Dmitrii");
    arrayList1.add("Olga");
    System.out.println(arrayList1);

    ArrayList<String> arrayList2 = new ArrayList<>(200);
    arrayList2.add("Zaur");
    arrayList2.add("Dmitrii");

    List<String> arrayList3 = new ArrayList<>();

    ArrayList<String> arrayList4 = new ArrayList<>(arrayList1);
    System.out.println(arrayList4);
    System.out.println(arrayList1==arrayList4);

  }
}
