package collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinerySearch {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(-3);
    list.add(8);
    list.add(12);
    list.add(-8);
    list.add(0);
    list.add(5);
    list.add(10);
    list.add(1);
    list.add(150);
    list.add(-30);
    list.add(19);

    Collections.sort(list);
    System.out.println(list);
    Collections.reverse(list);
    System.out.println(list);
    Collections.shuffle(list);
    System.out.println(list);


//    int index1 = Collections.binarySearch(list,12);
//    System.out.println(index1);

//    Employee2 emp1 = new Employee2(100, "Zaur", 12345);
//    Employee2 emp2 = new Employee2(15, "Ivan", 6565);
//    Employee2 emp3 = new Employee2(123, "Petr", 8542);
//    Employee2 emp4 = new Employee2(15, "Maria", 5600);
//    Employee2 emp5 = new Employee2(182, "Kolya", 130);
//    Employee2 emp6 = new Employee2(15, "Sasha", 10000);
//    Employee2 emp7 = new Employee2(250, "Elena", 2000);
//    List<Employee2> employeeList = new ArrayList<>();
//    employeeList.add(emp1);
//    employeeList.add(emp2);
//    employeeList.add(emp3);
//    employeeList.add(emp4);
//    employeeList.add(emp5);
//    employeeList.add(emp6);
//    employeeList.add(emp7);
//    System.out.println(employeeList);
//    Collections.sort(employeeList);
//    System.out.println(employeeList);
//    int index2 = Collections.binarySearch(employeeList, new Employee2(182, "Kolya", 130));
//    System.out.println(index2);

//    int [] array = {-3, 8, 12, -9, 0, 5, 10, 1, 150, -30, 19};
//    System.out.println(Arrays.toString(array));
//    Arrays.sort(array);
//    System.out.println(Arrays.toString(array));
//    int index3 = Arrays.binarySearch(array, 150);
//    System.out.println(index3);
  }

  static class Employee2 implements Comparable<Employee2> {
    int id;
    String name;
    int salary;

    public Employee2(int id, String name, int salary) {
      this.id = id;
      this.name = name;
      this.salary = salary;
    }

    @Override
    public String toString() {
      return "Employee{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", salary=" + salary +
              '}';
    }

    @Override
    public int compareTo(Employee2 anotherEmp) {
      int result = this.id-anotherEmp.id;
      if (result == 0) {
        result = this.name.compareTo(anotherEmp.name);
      }
      return result;
    }
  }
}
