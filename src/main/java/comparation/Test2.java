package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
  public static void main(String[] args) {
    List<Employee> list = new ArrayList<Employee>();
    Employee empl1 = new Employee(100, "Iem", "Thustov", 12345);
    Employee empl2 = new Employee(15, "Zem", "Phustov", 6565);
    Employee empl3 = new Employee(123, "Iem", "Shustov", 8500);
//    Arrays.sort(new Employee[] {empl1, empl2, empl3});
    list.add(empl1);
    list.add(empl2);
    list.add(empl3);
    System.out.println("Before \n" + list);
    Collections.sort(list, new SalaryComparator());
    System.out.println("After \n" + list);

  }

}

class Employee
        implements Comparable<Employee>
{
  int id;
  String name;
  String surname;
  int salary;

  public Employee(int id, String name, String surname, int salary) {
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Employee{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", salary=" + salary +
            '}';
  }

  public int compareTo(Employee anotherEmpl) {
    if(this.id == anotherEmpl.id) {
      return 0;
    } else if (this.id < anotherEmpl.id) {
      return -1;
    } else return 1;

//    return this.id - anotherEmpl.id;

//    return this.id.compareTo(anotherEmpl.id);

//    int res = this.name.compareTo(anotherEmpl.name);
//    if (res == 0) {
//      res = this.surname.compareTo(anotherEmpl.surname);
//    }
//    return res;
  }
}

//class IdComparator implements Comparator<Employee> {
//
//  public int compare(Employee empl1, Employee empl2) {
//    if (empl1.id == empl2.id) {
//      return 0;
//    } else if (empl1.id < empl2.id) {
//      return -1;
//    } else return 1;
//  }
//}

class NameComparator implements Comparator<Employee> {
  public int compare(Employee empl1, Employee empl2) {
    return empl1.name.compareTo(empl2.name);
  }
}

class SurnameComparator implements Comparator<Employee> {
  public int compare(Employee empl1, Employee empl2) {
    return empl1.surname.compareTo(empl2.surname);
  }
}

class SalaryComparator implements Comparator<Employee> {
    public int compare(Employee empl1, Employee empl2) {
      return empl1.salary - empl2.salary;
    }
}

