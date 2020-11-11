package nested_classes.local_inner_class;

public class LocalInner2 {
  public static void main(String[] args) {
    class Slojenie implements Math2 {

      @Override
      public int doOperation(int a, int b) {
        return a + b;
      }
    }

    Slojenie slojenie = new Slojenie();
    System.out.println(slojenie.doOperation(12, 15));
  }
}

interface Math2 {
  int doOperation(int a, int b);
}
