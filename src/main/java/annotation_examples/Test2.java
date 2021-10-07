package annotation_examples;

import java.lang.annotation.*;

public class Test2 {
  public static void main(String[] args) throws ClassNotFoundException {

    Class xiaomiClass = Class.forName("annotation_examples.Xiaomi");
//    Annotation[] annotation1 = xiaomiClass.getAnnotations(SmartPhone.class);
//    SmartPhone sm1 = (SmartPhone) annotation1;


  }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
  String OS() default "Android";
  int yearOfCompanyCreation() default 2010;
}

@SmartPhone
class Xiaomi {
  String model;
  double price;
}

@SmartPhone(OS = "IOS", yearOfCompanyCreation = 1976)
class Iphone {
  String model;
  double price;
}