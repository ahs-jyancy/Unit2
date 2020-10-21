
/**
 * Jon Yancy
 * Programming III
 * Math Examples
 * 10/15/2020
 */
public class MathExamples {

    public static void main(String[] args) {
       //absolute value
       int result = Math.abs(-20);
        System.out.println("The absolute value of -20 is " + result);
        
        //exponents
       double newResult = Math.pow(2.0, 2.0);
        System.out.println("2 squared is " + newResult);
        
        //square root
        newResult = Math.sqrt(9.0);
        System.out.println("The square root of 9 is " + newResult);
        
        //random numbers 
        double r = Math.random();
        System.out.println("The random number is " + r);
        
        //random number inbetween a range
        int max = 10;
        int min = 1;
        int range = max - min + 1;
        int rand = (int)(Math.random() * range) + 1;
        System.out.println("The random whole number is " + rand);





    }

}
