package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test4 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(5);
    list.add(8);
    list.add(2);
    list.add(4);
    list.add(3);

    int result = list.stream().reduce((accumulator, e) ->
            accumulator * e).get();
//    System.out.println(result);
    int result2 = list.stream().reduce(1, (accumulator, e) ->
            accumulator * e);
//    System.out.println(result2);

    List<String> list3 = new ArrayList<>();
    list3.add("Hi!");
    list3.add("How are you?");
    list3.add("OK!");
    list3.add("Bye!");
    String result3 = list3.stream().reduce((a,e) ->
            a + " " + e).get();
    System.out.println(result3);



//    List<Integer> list100 = new ArrayList<>();
//    Optional<Integer>  o = list.stream().reduce((accumulator, e) ->
//            accumulator * e);
//    if(o.isPresent()) {
//      System.out.println(o.get());
//    } else {
//      System.out.println("Not present");
//    }
  }
}
