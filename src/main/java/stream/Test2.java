package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.out;

public class Test2 {
  public static void main(String[] args) {
    Student st1 = new Student("Ivan", 'm', 20, 3, 8.7);
    Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
    Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
    Student st4 = new Student("Petr", 'm', 35, 4, 7);
    Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
    List<Student> students = new ArrayList<>();
    students.add(st1);
    students.add(st2);
    students.add(st3);
    students.add(st4);
    students.add(st5);

    students.stream().map(e ->
    {
      e.setName(e.getName().toUpperCase());
      return e;
    })
            .filter(e -> e.getSex() == 'f')
            .sorted((x, y) -> x.getAge() - y.getAge())
            .forEach(e -> out.println(e));



//    students = students.stream().sorted((x,y) ->
//            x.getName().compareTo(y.getName())).collect(Collectors.toList());
//    System.out.println(students);

//    students = students.stream().filter(e
//            -> e.getAge() > 22 && e.getAverageGrade() < 7.2)
//            .collect(Collectors.toList());
//    System.out.println(students);

//    Stream<Student> myStream = new Stream.of(st1, st2, st3, st4, st5);
  }
}

class Student {
  String name;
  char sex;
  int age;
  int course;
  double averageGrade;



  public Student(String name, char sex, int age, int course, double averageGrade) {
    this.setName(name);
    this.setSex(sex);
    this.setAge(age);
    this.setCourse(course);
    this.setAverageGrade(averageGrade);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public char getSex() {
    return sex;
  }

  public void setSex(char sex) {
    this.sex = sex;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getCourse() {
    return course;
  }

  public void setCourse(int course) {
    this.course = course;
  }

  public double getAverageGrade() {
    return averageGrade;
  }

  public void setAverageGrade(double averageGrade) {
    this.averageGrade = averageGrade;
  }

  @Override
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", sex=" + sex +
            ", age=" + age +
            ", course=" + course +
            ", averageGrade=" + averageGrade +
            '}';
  }
}