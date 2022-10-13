public class Main {

    public static void main(String[] args) {
	Customer customere = new Customer();
    Employee employee= new Employee();
    CustomerManager customerManager = new CustomerManager();
    EmployeeManager employeeManager = new EmployeeManager();
    System.out.println(customere.firstName);
    employeeManager.List();
    }
}
