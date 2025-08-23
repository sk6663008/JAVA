package Arrays_;

import java.util.Scanner;

public class questions {
    static int occurace( int arr[] , int x){
       int count = 0;
       for( int i=0;i<arr.length;i++){
           if(arr[i]==x){
               count++;
           }
       }
       return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of array : ");
        int n = sc.nextInt();

        int arr[] = new int [n];
        System.out.print("enter " + n + " element");
        for ( int i = 0;i < arr.length;i++){
            arr [i]=sc.nextInt();
        }

        System.out.println("enter X");
        int x =sc.nextInt();
    }

}
