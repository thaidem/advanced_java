package generics;

public class ParameterizedClass {
  public static void main(String[] args) {
    Info<String> info1 = new Info<String>("hi");
    System.out.println(info1);
    String s = info1.getValue();

    Info<Integer> info2 = new Info<Integer>(10);
    System.out.println(info2);
    Integer i = info2.getValue();
  }
}
class Info<T> {
  private T value;

  public Info(T value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "{[" + value + "]}";
  }

  public T getValue() {
    return value;
  }
}
