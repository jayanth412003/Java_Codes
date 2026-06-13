import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        double bill;

        if (units <= 100) {
            bill = 50;
        } 
        else if (units > 100 && units < 150) {
            bill = 50 + (units - 100) * 2;
        } 
        else {
            bill = 50 + (50 * 2) + (units - 150) * 5;
        }

        System.out.println("Electricity Bill = ₹" + bill);

        sc.close();
    }
}