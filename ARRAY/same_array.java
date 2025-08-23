package Arrays_;

public class same_array {
    static void samearray() {
        int[] arr = {10, 23, 22, 26, 45};

        int x = 45;

        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                ans = i;
                break;
            }
        }

        System.out.println(ans);
    }
    public static void main(String[] args) {
        samearray();
    }
}