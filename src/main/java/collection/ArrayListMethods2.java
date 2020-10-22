package collection;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods2 {
  public static void main(String[] args) {
    Student student1 = new Student("Ivan", 'm', 22, 3, 8.3);
    Student student2 = new Student("Nik", 'm', 28, 2, 6.4);
    Student student3 = new Student("Elena", 'f', 19, 1, 8.9);
    Student student4 = new Student("Petr", 'm', 35, 4, 7);
    Student student5 = new Student("Mari", 'f', 23, 3, 7.4);
    ArrayList<Student> studentsList = new ArrayList<>();
    studentsList.add(student1);
    studentsList.add(student2);
    studentsList.add(student3);
    studentsList.add(student4);
    studentsList.add(student5);
    System.out.println(studentsList);
    Student student6 = new Student("Mari", 'f', 23, 3, 7.4);
//    studentsList.remove(student6);
    int index = studentsList.indexOf(student6);
    System.out.println(index);

  }
}

class Student {
  private String name;
  private char sex;
  private int age;
  private int course;
  private double avgGrade;

  public Student(String name, char sex, int age, int course, double avgGrade) {
    this.name = name;
    this.sex = sex;
    this.age = age;
    this.course = course;
    this.avgGrade = avgGrade;
  }

  @Override
  public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", sex=" + sex +
            ", age=" + age +
            ", course=" + course +
            ", avgGrade=" + avgGrade +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Student student = (Student) o;
    return sex == student.sex &&
            age == student.age &&
            course == student.course &&
            Double.compare(student.avgGrade, avgGrade) == 0 &&
            Objects.equals(name, student.name);
  }

}
