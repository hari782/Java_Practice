import java.util.*;
public class ListAscendingOrder {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("Afsar");
        lst.add("Gokul");
        lst.add("Haribalaji");
        lst.add("Abishek");
        lst.add("Thinakar");
        lst.add("Mouli");
        Employee emp_1 = new Employee("21ec026","Haribalaji",45000);
        Employee emp_2 = new Employee("21ec020","Gokul",46000);
        Employee emp_3 = new Employee("21ec004","Afsar",47000);
        Collections.sort();
        System.out.println();

    }
}
class Employee implements Comparable<Employee>{

    @Override
    public int compareTo(Employee o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

    public String emp_id, emp_name;
    public double emp_salary;
    public Employee(String emp_id, String emp_name, double salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_salary = salary;
        if(emp_salary == salary) {
            return ;
        }
    }
    
    }


