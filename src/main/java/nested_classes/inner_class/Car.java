package nested_classes.inner_class;

public class Car {
  String color;
  int doorCount;
  Engine engine;

  public Car(String color, int doorCount) {
    this.color = color;
    this.doorCount = doorCount;
//    this.engine = this.new Engine(horsePower);
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  @Override
  public String toString() {
    return "My Car: {" +
            "color='" + color + '\'' +
            ", doorCount=" + doorCount +
            ", engine=" + engine +
            '}';
  }

  public class Engine {
    private int horsePower;

    public Engine(int horsePower) {
      System.out.println(doorCount);
      this.horsePower = horsePower;
    }

    @Override
    public String toString() {
      return "My Engine: {" +
              "horsePower=" + horsePower +
              '}';
    }
  }
}

class Test {
  public static void main(String[] args) {
    Car car = new Car("black", 4);
    Car.Engine engine = car.new Engine(320);
    car.setEngine(engine);
    System.out.println(car);

    Car.Engine engine1 = new Car("yellow", 5).new Engine(230);


  }
}

