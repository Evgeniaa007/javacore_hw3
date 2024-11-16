import java.time.LocalDate;
import java.util.Comparator;

public class Manager extends Employee{

    public Manager(String name, LocalDate birthday, int salary) {
        super(name, birthday, salary);
    }

    public static void increaseSalary (Employee[] employees, int increaseSum){
        for(Employee employee : employees){
            if(!(employee instanceof Manager)){
                int increasedSalary = employee.getSalary() + increaseSum;
                employee.setSalary(increasedSalary);
            }
        }
    }

}