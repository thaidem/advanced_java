package lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<>();
    al.add("Hi");
    al.add("Bye");
    al.add("OK");
    al.add("learn Java");
    al.add("now lambdas");
//    al.removeIf(e -> e.length()<3);
    Predicate<String> p = e -> e.length()<3;
    al.removeIf(p);
    System.out.println(al);
  }
}
