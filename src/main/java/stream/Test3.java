package stream;

import java.util.Arrays;

public class Test3 {
  public static void main(String[] args) {
    int[] array = {5, 9, 3, 8, 1};
//    Arrays.stream(array).forEach(e ->
//    {
//      e *= 2;
//      System.out.println(e);
//    });

//    Arrays.stream(array).forEach(e -> System.out.println(e));
//    Arrays.stream(array).forEach(System.out::println);
    Arrays.stream(array).forEach(Utils::myMethod);
  }
}

class Utils {
  public static void myMethod(int a) {
    a = a + 5;
    System.out.println("Element = " + a);
  }
}
