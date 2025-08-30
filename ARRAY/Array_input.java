package Arrays_;
import java.util.Scanner;

public class Array_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Create array
        int[] arr = new int[n];

        // Take input
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print output
        System.out.println("You entered:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  "); // prints in one line
        }

        sc.close();
    }
}
