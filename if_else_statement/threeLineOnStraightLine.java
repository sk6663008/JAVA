package if_else_statement;

import java.util.Scanner;

public class threeLineOnStraightLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x1");
        double x1 = sc.nextDouble();
        System.out.println("enter x2");
        double x2 = sc.nextDouble();
        System.out.println("enter x3");
        double x3 = sc.nextDouble();
        System.out.println("enter y1");
        double y1 = sc.nextDouble();
        System.out.println("enter y2");
        double y2 = sc.nextDouble();
        System.out.println("enter y3");
        double y3 = sc.nextDouble();

        double m1 = (y2-y1)/(x2-x1);
        double m2 = (y3-y2)/(x3-x2);
        if(m2==m1){
            System.out.println("three point lies on the same straight line");
        }else{
            System.out.println("it dont lie in the same straight line");
        }
    }
}
