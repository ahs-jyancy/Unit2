package ch3pc1;
/**
 * Jon Yancy
 * Programming III
 * Project
 * Date
 */
public class EmployeeMain {

    public static void main(String[] args) {
        // TODO code application logic here

        Employee Susan = new Employee("Susan Meyers", 47899, "Accounting",
        "Vice President");
        
        Susan.setName("Susan Meyers");
        Susan.setID(47899);
        Susan.setDepartment("Accounting");
        Susan.setPosition("Vice President");
        
        Employee Mark = new Employee("Mark Jones", 39119, "IT", "Programmer");
        
        Employee Joy = new Employee(null, 0 , null, null);
        
        Joy.setName("Joy Rogers");
        Joy.setID(81774);
        Joy.setDepartment("Manufacturing");
        Joy.setPosition("Engineer");
        
        
        
        



    }

}
