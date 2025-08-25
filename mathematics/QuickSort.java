package mathematics;

import java.util.Scanner;

public class QuickSort {

    /// main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number: ");
        int n = sc.nextInt();

        diamond(n);
    }

    /// Pattern
    private static void diamond (int n){
        for (int i = 0;i <= n;i++){
            // space
            for (int j = 1;j <= n-i;j++){
                System.out.print("  ");
            }
            // star
            for (int j = 1;j <= 2*i+1;j++){
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = n-1;i >= 0;i--){
            // space
            for (int j = 1;j <= n-i;j++){
                System.out.print("  ");
            }
            // star
            for (int j = 1;j <= 2*i+1;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}