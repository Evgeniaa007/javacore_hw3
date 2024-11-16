import java.util.Comparator;

public class DataComparator {
    public static Comparator<Employee> dateComparator(){
        return Comparator.comparing(employee -> employee.getBirthday());
    }
}
