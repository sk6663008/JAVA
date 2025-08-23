package loop;
import java.util.Scanner;
public class continue_operator {
    public static void main(String[] args) {
        for(int num=1;num<=50;num++){
            if(num%3==0){
                continue;
            }
            System.out.println(num);
        }
    }
}
