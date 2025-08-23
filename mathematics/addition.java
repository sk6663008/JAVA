package mathematics;

import com.sun.jdi.PathSearchingVirtualMachine;
import java.util.*;
public class addition {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the value of a");
        int a = sc.nextInt();

        System.out.println("enter the value of b");
        int b = sc.nextInt();



        int sum =a+b;
        System.out.println("sum =" + sum );
        System.out.println(sum1(7,2));

    }
    static int sum1(int a, int b){
        return a+b;
    }
}


