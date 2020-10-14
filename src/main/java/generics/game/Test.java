package generics.game;

public class Test {
  public static void main(String[] args) {
    Scholar scholar1 = new Scholar("Dania", 14);
    Scholar scholar2 = new Scholar("Ola", 12);
    Scholar scholar3 = new Scholar("Peta", 15);
    Scholar scholar4 = new Scholar("Masha", 13);
    Student student1 = new Student("Max", 18);
    Student student2 = new Student("Lena", 17);
    Employee employee1 = new Employee("Ivan", 50);
    Employee employee2 = new Employee("Anna", 48);

    Team<Scholar> scholarTeam = new Team<Scholar>("Dragons");
    scholarTeam.addNewParticipant(scholar1);
    scholarTeam.addNewParticipant(scholar2);

    Team<Scholar> scholarTeam2 = new Team<Scholar>("Tigers");
    scholarTeam2.addNewParticipant(scholar3);
    scholarTeam2.addNewParticipant(scholar4);

    Team<Student> studentTeam = new Team<Student>("Forward!");
    studentTeam.addNewParticipant(student1);
    studentTeam.addNewParticipant(student2);

    Team<Employee> employeeTeam = new Team<Employee>("Workers");
    employeeTeam.addNewParticipant(employee1);
    employeeTeam.addNewParticipant(employee2);

    scholarTeam.playWith(scholarTeam2);
  }
}
