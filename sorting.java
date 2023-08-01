import java.util.*;

class EEmployee {
    private int empId;
    private String name;
    private double salary;

    public EEmployee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
    }
}

public class sorting {
    public static void main(String[] args) {
        List<EEmployee> employees = new ArrayList<>();
        employees.add(new EEmployee(101, "sneha", 45000));
        employees.add(new EEmployee(102, "tithi", 55000));
        employees.add(new EEmployee(103, "tithi", 50000));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Current Employees:");
        for (EEmployee emp : employees) {
            System.out.println(emp);
        }

        System.out.print("Enter the sort key ('empId', 'name', or 'salary'): ");
        String userChoice = scanner.nextLine().trim().toLowerCase();

        switch (userChoice) {
            case "empid":
                Collections.sort(employees, Comparator.comparingInt(EEmployee::getEmpId));
                break;
            case "name":
                Collections.sort(employees, Comparator.comparing(EEmployee::getName));
                break;
            case "salary":
                Collections.sort(employees, Comparator.comparingDouble(EEmployee::getSalary));
                break;
            default:
                System.out.println("Invalid sort key. Please use 'empId', 'name', or 'salary'.");
                return;
        }

        System.out.println("\nSorted Employees:");
        for (EEmployee emp : employees) {
            System.out.println(emp);
        }
    }
}