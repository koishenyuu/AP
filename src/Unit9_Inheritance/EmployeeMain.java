package Unit9_Inheritance;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println("employee: " + employee.getSalary());

        Programmer programmer = new Programmer();
        System.out.println("programmer: " + programmer.getBonus() + "%");
        System.out.println("programmer: " + programmer.getSalary());

        Manager manager = new Manager();
        System.out.println("manager: " + manager.getGroup());
        System.out.println("manager: " + manager.getSalary());

        // Method override
        employee.printMessage();
        programmer.printMessage();
        manager.printMessage();

        // protected: https://www.geeksforgeeks.org/protected-keyword-in-java-with-examples/


        // static && non-static
        Employee e1 = new Employee(500);
        Employee e2 = new Employee(300);
        int result = Employee.compare(e1, e2);
        result = e1.compareWith(e2);
    }
}
