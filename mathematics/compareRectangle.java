package mathematics;

import java.util.Scanner;

public class compareRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the length of the rectangle = ");
        int length= sc.nextInt();
        System.out.println("Enter the breadth of the rectangle =");
        int breadth = sc.nextInt();

        int perimeter = 2*(length+breadth);
        int area = length * breadth;
        if(perimeter < area){
            System.out.println("area is bigger than perimater");
        }
        if(perimeter > area){
            System.out.println("perimeter is bigger than area ");
        }
    }
}
