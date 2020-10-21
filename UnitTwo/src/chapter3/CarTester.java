package chapter3;
/**
 * Jon Yancy
 * Programming III
 * Car Tester
 * 9/30/20
 */
public class CarTester {

    public static void main(String[] args) {
        //Create main car object
        Car corvette = new Car();
        Car tacoma = new Car("Toyota", false, "Mr. Mulroy");
        Car wrangler = new Car("Jeep", false);

        //call the methods of the car class
        corvette.printMake();
        corvette.printIsSports();
        corvette.printOwner();
        
        tacoma.printMake();
        tacoma.printIsSports();
        tacoma.printOwner();
        
        wrangler.printMake();
        wrangler.printIsSports();
        wrangler.printOwner();



    }

}
