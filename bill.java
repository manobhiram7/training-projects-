import java.util.*;
interface BillCalculator {
    double calculate(double basePrice, double accessoriesCost);
}
public class  bill{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter car model: ");
        String model = sc.nextLine();
        System.out.print("Enter base price of car: ");
        double basePrice = sc.nextDouble();
        System.out.print("Enter accessories cost: ");
        double accessories = sc.nextDouble();
        BillCalculator bill = (base, acc) -> base + acc;
        double subtotal = bill.calculate(basePrice, accessories);
        double gst = subtotal * 0.05; 
        double total = subtotal + gst;
        System.out.println("\n----- CAR BILL -----");
        System.out.println("Car Model: " + model);
        System.out.println("Base Price: " + basePrice);
        System.out.println("Accessories Cost: " + accessories);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("GST (5%): " + gst);
        System.out.println("Total Amount: " + total);
    }
}