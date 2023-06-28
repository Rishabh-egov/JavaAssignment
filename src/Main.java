import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Rishabh", 1000.0, 200.0, 19062023);
        emp1.displayTotalSalary();
        emp1.displayEmployeeRole();

        Engineer eng1 = new Engineer("Rishabh", 1000.0, 200.0, 19062023, 20.0);
        eng1.displayTotalSalary();
        eng1.displayEmployeeRole();
    }
}