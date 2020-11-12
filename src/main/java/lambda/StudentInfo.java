package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentInfo {

  void testStudents(ArrayList<Student> al, StudentsChecks sc) {
    for (Student s : al) {
      if (sc.check(s)) {
        System.out.println(s);
      }
    }
  }
}

class Test {
  public static void main(String[] args) {
    Student st1 = new Student("Ivan", 'm', 20, 3, 8.7);
    Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
    Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
    Student st4 = new Student("Petr", 'm', 35, 4, 7);
    Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
    ArrayList<Student> students = new ArrayList<>();
    students.add(st1);
    students.add(st2);
    students.add(st3);
    students.add(st4);
    students.add(st5);

    StudentInfo studentInfo = new StudentInfo();
//    Collections.sort(students, new Comparator<Student>() {
//      @Override
//      public int compare(Student s1, Student s2) {
//        return s1.course - s2.course;
//      }
//    });
    Collections.sort(students, (s1, s2) -> s1.course - s2.course );
    System.out.println(students);

//    studentInfo.testStudents(students, (Student s) -> { return s.averageGrade > 8; });
//    studentInfo.testStudents(students, s -> s.averageGrade > 8);
//
//    StudentsChecks sc = (Student s) -> { return s.averageGrade > 8; };
//    studentInfo.testStudents(students, sc);
//
//
//    System.out.println("----------------");
//    studentInfo.testStudents(students, (Student s) -> {
//      return s.age < 30;
//    });
//    System.out.println("----------------");
//    studentInfo.testStudents(students, (Student s) -> {
//      return s.age > 20 && s.averageGrade < 9.5 && s.sex == 'f';
//    });
  }
}

interface StudentsChecks {
  boolean check(Student s);
}
class CheckOverGrade implements StudentsChecks {
  @Override
  public boolean check(Student s) {
    return s.averageGrade>8;
  }
}
