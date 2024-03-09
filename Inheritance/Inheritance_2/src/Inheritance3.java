
class Employee{

    double salary;

    Employee(double salary){
        this.salary = salary;
    }
public void work(){
    System.out.println("Employee works");
}

public double getSalary(){
    return salary;
}
}

class HRManager extends Employee{

    HRManager(double salary){
        super(salary);
    }
    @Override
    public void work(){
        System.out.println("HRManager works");
    }

    public void addEmployee(){
        System.out.println("Adding employee");
    }

}


public class Inheritance3 {
    public static void main(String[] args) {
        Employee employee = new Employee(600.00);
        HRManager hrManager = new HRManager(800.00);
        employee.work();
        hrManager.work();
        System.out.println(employee.getSalary());

        hrManager.addEmployee();
    }
}
