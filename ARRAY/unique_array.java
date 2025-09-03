package Arrays_;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class unique_array {
   public static void uniquearray(int arr[]){
       int n = arr.length;
       for (int i = 0; i < n; i++){
           int count  = 0;
           for (int j = 0; j < n; j++){
               if (arr[j] == arr[i] && i!=j){
                   count++;
               }
           }
           if (count == 0){
               System.out.println(arr[i]);
           }
       }
    }
    public static void unique(int[] arr){
       int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        for (int i = 0; i < n; i++){
            if (map.get(arr[i])  ==  1){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        unique(arr);
    }
}

