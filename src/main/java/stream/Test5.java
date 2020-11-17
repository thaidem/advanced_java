package stream;

import java.util.Arrays;

public class Test5 {
  public static void main(String[] args) {
    int[] array = {5, 9, 3, 8, 1, 12, 4, 21, 81, 7, 18};

    int result = Arrays.stream(array).filter(e -> e%2 == 1)
            .map(e -> {if(e%3 == 0){e = e/3;} return e;})
            .reduce((a, e) -> a + e).getAsInt();
    System.out.println(result);

//    array = Arrays.stream(array).sorted().toArray();
//    System.out.println(Arrays.toString(array));
  }
}
