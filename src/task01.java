import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {

        double shippingCost;

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your item price here:");
        double itemPrice = in.nextDouble();

        if (itemPrice >= 100){
            System.out.println("you do not have any shipping costs");
        } else {
            shippingCost = itemPrice * 0.02;
            System.out.println("your shipping cost is: " + shippingCost );
        }


    }
}
