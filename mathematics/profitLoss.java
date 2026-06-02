package mathematics;
import java.util.Scanner;
public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the cost price : ");
        int CP = sc.nextInt();
        System.out.println(" enter the selling price : ");
        int SP = sc.nextInt();
        if(SP>CP){
            System.out.println("you made a profit :");
            System.out.println(SP-CP);
        }
        if(SP<CP){
                System.out.println("you incurred a loss :");
            System.out.println(CP-SP);
        }
    }
}
