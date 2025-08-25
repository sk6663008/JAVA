package mathematics;

import java.util.Scanner;

public class read_Charcter {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the character");
        char ch = sc.next().charAt(1);
        System.out.println("character = " + ch);
    }
}
