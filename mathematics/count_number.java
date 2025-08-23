package mathematics;
import java.util.Scanner;
public class count_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numberOfDigit = 0;

        while(n>0){
            n= n/10;
            numberOfDigit++;
        }
        System.out.println("no of digit = " + numberOfDigit);
    }
}
