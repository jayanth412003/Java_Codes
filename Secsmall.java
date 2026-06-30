import java.util.Scanner;

public class Secsmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x < min1) {
                min2 = min1;



                
                min1 = x;
            } else if (x > min1 && x < min2) {
                min2 = x;
            }
        }

        if (min2 == Integer.MAX_VALUE) {
            System.out.print("Second smallest not found");
        } else {
            System.out.print("Second smallest = " + min2);
        }

        sc.close();
    }
}

