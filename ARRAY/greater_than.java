package Arrays_;
//the given array is strictly greater then x
public class greater_than {
    static void  greater(){
        int []arr ={1,3,5,7,9,11,12,13,15,67};

        int x= 13;

        int ans = 0;

        for(int i=0;i< arr.length;i++){
            if(x < arr[i]){
                ans++;

            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        greater();
    }
}
