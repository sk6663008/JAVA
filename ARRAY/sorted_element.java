package Arrays_;

import java.util.Scanner;

public class sorted_element {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean check = true;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]) {
                check = false;
                break;
            }
        }

        // Print result instead of return
        System.out.println("Is array sorted? " + check);

        sc.close();
    }
}
