package lambda;

public class Test2 {
  static void def(I i) {
    System.out.println(i.abc("Hi!"));
//    System.out.println(i.zero());
  }

  public static void main(String[] args) {
    int i = 10;
    def((String str) -> {
      int a = 5;
      System.out.println(i);
      return str.length() + i;
    });
//    def(() -> 18);
  }
}

interface I {
  int abc(String s);
//  int zero();
}
