package loop;

import java.util.Scanner;
public class multiple {
    public static void main(String[] args) {
        int num = 1;
        while(true) {
            if ((num % 5 == 0) && (num % 7 == 0)) {
                   System.out.println("num =" + num);
                    break;
            }
            num++;
        }


    }
}

