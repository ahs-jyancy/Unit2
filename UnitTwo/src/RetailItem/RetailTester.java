package RetailItem;
/**
 * Jon Yancy
 * Programming III
 * Project
 * Date
 */
public class RetailTester {

    public static void main(String[] args) {
        RetailItem Jeans = new RetailItem("Jeans", 15, 45.95);
        System.out.println("The item I am looking to purchase is a pair of " 
                + Jeans.getDesc());
        System.out.println("The price of the " + Jeans.getDesc() +
                " is " + Jeans.getPrice());
        System.out.println("There are " + Jeans.getUnits() + " " + 
                Jeans.getDesc() + " in stock");





    }

}
