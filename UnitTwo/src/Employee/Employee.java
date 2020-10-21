package Employee;

/**
 * Jon Yancy
 * 10/2/20
 * Purpose: Employee class stores info about an employee
 */
public class Employee {
    private String name;
    private String empId;
    private int pay;
    
    public Employee() {
        name = null;
        empId = null;
        pay = 0;
        
    }
    
    public Employee (String n, String e, int p){
        name = n;
        empId = e;
        pay = p;
        
    }
    
    public Employee (String n, String e){
        name = n;
        empId = e;
        pay = 20;
        
    }
    
}
