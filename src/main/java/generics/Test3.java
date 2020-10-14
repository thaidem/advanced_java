package generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
  public static void main(String[] args) {
    List<?> list = new ArrayList<String>();
//    list.add("hi");
    List<? extends Number> list3 = new ArrayList<Integer>();
    List<? super Number> list4 = new ArrayList<Object>();

    List<Double> list1 = new ArrayList<Double>();
    list1.add(3.14);
    list1.add(6.121);
    list1.add(5.1);
    showListInfo(list1);

    List<String> list2 = new ArrayList<String>();
    list2.add("ok");
    list2.add("no");
    list2.add("yes");
    showListInfo(list2);

    ArrayList<Double> ald = new ArrayList<Double>();
    ald.add(3.14);
    ald.add(6.121);
    ald.add(5.1);
    System.out.println(summ(ald));

    ArrayList<Integer> ali = new ArrayList<Integer>();
    ali.add(314);
    ali.add(621);
    ali.add(5);
    System.out.println(summ(ali));

  }
  static void showListInfo(List<?> list) {
    System.out.println("My list include a elements " + list);
  }
  public static double summ(ArrayList<? extends Number> al) {
    double summ = 0;
    for(Number n : al) {
      summ += n.doubleValue();
    }
    return summ;
  }
}
