package lambda;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class Test3 {
  public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
    ArrayList<Car> cars = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
      cars.add(carSupplier.get());
    }
    return cars;
  }

  public static void changeCar(Car car, Consumer<Car> carConsumer) {
    carConsumer.accept(car);
  }

  public static void main(String[] args) {
    ArrayList<Car> ourCars = createThreeCars(() ->
            new Car("Nissan", "red", 1.6));
    System.out.println("Our Cars: " + ourCars);

    changeCar(ourCars.get(0),
            car -> {
              car.color = "black";
              car.engine = 2.7;System.out.println("Upgrade car: " + car);});
  }
}

class Car {
  String model;
  String color;
  double engine;

  public Car(String model, String color, double engine) {
    this.model = model;
    this.color = color;
    this.engine = engine;
  }

  @Override
  public String toString() {
    return "Car{" +
            "model='" + model + '\'' +
            ", color='" + color + '\'' +
            ", engine=" + engine +
            '}';
  }
}
