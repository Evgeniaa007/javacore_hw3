import java.time.LocalDate;
import java.util.Comparator;


public class Employee {
    private String name;
    private LocalDate birthday;
    private int salary;



    public Employee(String name, LocalDate birthday, int salary) {
        this.name = name;
        this.birthday = birthday;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void compareBirthdays(Employee employee1, Employee employee2){
        if(DataComparator.dateComparator().compare(employee1, employee2) < 0) {
            System.out.println(employee1.getName() + " is older then " + employee2.getName());
        }
        else if (DataComparator.dateComparator().compare(employee1, employee2) > 0){
            System.out.println(employee1.getName() + " is younger then " + employee2.getName());
        }
        else{
            System.out.println(employee1.getName() + " and " + employee2.getName() + " are the same age");
        }
    }


}
