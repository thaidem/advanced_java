package generics;

import java.util.ArrayList;


public class ParameterizedMethod {
  public static void main(String[]args){
    ArrayList<Integer> al1 = new ArrayList<Integer>();
    al1.add(10);
    al1.add(15);
    al1.add(7);
    int a = GenMethod.getSecondElement(al1);
    System.out.println(a);

    ArrayList<String> al2 = new ArrayList<String>();
    al2.add("a");
    al2.add("b");
    al2.add("c");
    String b = GenMethod.getSecondElement(al2);
    System.out.println(b);

  }
}

class GenMethod {
  public static <T> T getSecondElement(ArrayList<T> al) {
    return al.get(1);
  }
}
