package if_else_statement;

import java.util.Scanner;

public class percentageOfStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the percentage of student");
        int n = sc.nextInt();
        if(n>100||n<0){
            System.out.println("invalid percentage");
        }
        else if(n>90){
            System.out.println("excellent");
        }
        else if(n>80){
            System.out.println("very good");
        }
        else if(n>70){
            System.out.println("good");
        }
        else if (n>60) {
            System.out.println("can do better");
        } else if (n>50) {
            System.out.println("average");
        } else if (n>40) {
            System.out.println("below average");
        } else if (n<40) {
            System.out.println("fail");
        }
    }
}
