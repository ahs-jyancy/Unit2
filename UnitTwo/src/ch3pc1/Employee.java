/*
1. Write two constructors (no-arg and one with parameters that correspond to 
each field.
2. Write the accessor and mutator methods for each field.
3. Make sure you include documentation comments.
 */
package ch3pc1;

/**
 * Jon Yancy
 * Employee Class
 * 10/6/20
 */
public class Employee {
    private String name;
    private int idNum;
    private String department;
    private String position;
    
    public Employee(String n, int I, String d, String p){
        name = n;
        idNum = I;
        department = d;
        position = p;
        
    }
    
    public void setName(String n){
        name = n;
    }
    
    public String setName(){
        return name;
    }
        
    
    public void setID(int I){
        idNum = I;
    }
    
    public int getID(){
        return idNum;
    }
    
    public void setDepartment(String d){
        department = d;
    }
    
    public String getDepartment(){
        return department;
    }
    
    public void setPosition(String p){
        position = p;
    }
    
    public String getPosition(){
        return position;
    }
        
}




