package mathematics;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Simple_Interst {
    public static void main(String[]arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principle");
        float p = sc.nextFloat();

        System.out.println("Enter the rate");
        int r = sc.nextInt();

        System.out.println(" Enter teh time");
        int t = sc.nextInt();

        float si = (p * r * t)/100 ;

        System.out.println( "simple interest "+ si);

    }
}
