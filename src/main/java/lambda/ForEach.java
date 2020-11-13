package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach {
  public static void main(String[] args) {
    List<String> list = Arrays.asList(new String[]{"Hi!", "How are you?", "Ok", "Bye"});
    list.forEach(str -> System.out.println(str));

    List<Integer> list2 = new ArrayList<>();
    list2.add(1);
    list2.add(2);
    list2.add(3);
    list2.add(4);
    list2.add(5);
    list2.forEach(i -> {
      System.out.println(i);
      i *= 2;
      System.out.println(i);
    });
  }
}
