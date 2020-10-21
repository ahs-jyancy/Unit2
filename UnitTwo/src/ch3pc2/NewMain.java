package ch3pc2;
/**
 * Jon Yancy
 * Programming III
 * Project
 * Date
 */
public class NewMain {

    public static void main(String[] args) {
        Car wrangler = new Car(2000, "Wrangler", 10);
        System.out.println("The make of the car is a " + wrangler.getMake());
        System.out.println("The speed of the car is " + wrangler.getSpeed());
        System.out.println("The year model of the car is " + wrangler.getCar());
        System.out.println("The acceleration of the car is " + 
                wrangler.getAccel());
        System.out.println("The braking of the car is " + wrangler.getBrake());




    }

}
