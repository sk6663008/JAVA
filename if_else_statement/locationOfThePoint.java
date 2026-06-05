package if_else_statement;

import java.util.Scanner;

public class locationOfThePoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x");
        float x = sc.nextFloat();
        System.out.println("enter y");
        float y = sc.nextFloat();

        if(x==0){
            System.out.println("the point lies on x axis");
        }
        else if (y==0){
            System.out.println("the point lies on the y axis");
        } else if (x==0 && y==0) {
            System.out.println("the point lies on the origin");
        } else if (x!=0 && y!=0) {
            System.out.println("the line is not on the any axis");
        }
    }
}
