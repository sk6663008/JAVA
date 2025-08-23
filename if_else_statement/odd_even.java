package if_else_statement;
import java.util.Scanner;
public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE REQUIRED NUMBER=");
        int num= sc.nextInt();

        if (num%2==0){
            System.out.println("num is even");
        }
        else{
            System.out.println("num is odd");
        }

    }
}
