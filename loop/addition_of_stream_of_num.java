package loop;

import java.util.Scanner;
public class addition_of_stream_of_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        while(num!=-1){
            sum = sum + num;
            num=sc.nextInt();
        }
        System.out.println(sum);
    }
}
