package mathematics;

public class bitwise {
    public static void main(String[] args) {
         int a = 10, b = 11;

        System.out.println( a | b);
        System.out.println( a & b);
        System.out.println( a ^ b);

        System.out.println( a << 1);
        System.out.println( a << 2);

        System.out.println( a >> 1);
        System.out.println( a >> 2);

        System.out.println( ~a);
        System.out.println( ~b);
    }
}
