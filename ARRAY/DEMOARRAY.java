package Arrays_;

import java.util.Scanner;

public class demoarray {
    public static void main(String []args){


        Scanner sc = new Scanner(System.in);

        System.out.println(add(sc.nextInt(), sc.nextInt()));

        int [] ages = new int[5];
        float[] weights = new float[5];
        String[] names = new String[5];

        ages[0]=10;
        ages[1]=20;
        ages[3]=33;

        weights[0]= 10.22f;
        weights[1]=12.4f;
        weights[4]=33.56f;

        names[0]="shashank";
        names[2]="vikram";
        names[3]="ram";

        System.out.println(ages[0]);
        System.out.println(ages[3]);

        System.out.println(weights[2]);
        System.out.println(weights[3]);

        System.out.println(names[2]);
        System.out.println(names[4]);

    }

    private static int add(int a, int b) {
        return a + b;
    }

}
