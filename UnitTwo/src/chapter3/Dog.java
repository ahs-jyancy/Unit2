
package chapter3;

/**
 * Jon Yancy
 * Purpose : Define a Dog Object
 */
public class Dog {
    private String name;
    private int age;
    private String breed;
    
    public Dog(String n, int a, String b){
        name = n;
        age = a;
        breed = b;
        
    }
    
    public void bark(){
        System.out.println("woof!");
        
        
    }
    
    /*
    The setName method accepts an arguement that is stored in the name field
    */
    public void getName(String n){
        name = n;
        
    }
    
    /*
    tThe setAge method accepts an arguement that is stored in the age field
    */
    public void setName(int a){
        age = a;
        
    }
    
    /*
    The setBreed method accepts an arguement that is stored in the breed field
    */
    public void setBreed(String b){
        breed = b;
    }
    
    /*
    The getName method returns the value of the name field
    */
    public String getName(){
        return name;
    }
    
    /*
    The getAge method returns the value of the age field
    */
    public int getAge(){
        return age;
    }
    
    /* 
    The getBreed mehtod returns the value of the breed field
    */
    public String getBreed(){
        return breed;
    }
}
