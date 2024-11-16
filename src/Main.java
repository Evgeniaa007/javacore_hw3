import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Arthur", LocalDate.of(1994, 10, 16), 85000);
        Employee employee2 = new Employee("Zhenya", LocalDate.of(1995, 3, 1), 60000);
        Employee employee3 = new Employee("Anna", LocalDate.of(1986, 2, 2), 72000);
        Employee employee4 = new Employee("Ivan", LocalDate.of(2000, 2, 14), 40000);
        Manager manger = new Manager("Dasha", LocalDate.of(1992, 2, 24), 120000);

        Employee[] employees = {employee1, employee2, employee3, employee4, manger};

        for (Employee employee: employees){
            System.out.println("Employee: " + employee.getName() + " with salary " + employee.getSalary());

        }

        Manager.increaseSalary(employees, 5000);
        System.out.println();
        for (Employee employee: employees){
            System.out.println("Employee: " + employee.getName() + " with salary after increase " + employee.getSalary());
        }

        Employee.compareBirthdays(employee1, employee2);
        Employee.compareBirthdays(employee4, manger);
    }
}