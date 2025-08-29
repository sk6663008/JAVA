package Arrays_;

import java.util.Arrays;
import java.util.Scanner;

public class smallest_and_largest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        Arrays.sort(arr);

        int smallest = arr[0];
        int largest = arr[arr.length - 1];

        System.out.println("smallest array is :" + smallest);
        System.out.println("largest array is : " + largest);
    }
}

