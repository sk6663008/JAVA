package if_else_statement;

import java.util.Scanner;
public class conditional_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number=");

        int num = sc.nextInt();

        if(num%2==0 && num%3==0){
            System.out.println("even and not divisible by 3");
        }else
        {
               System.out.println("odd or not divisible by 3");
        }
    }
}

