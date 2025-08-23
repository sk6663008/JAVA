package Arrays_;




public class main {

   static void  sumofarray(){
        int []arr = {1,3,5,7,9};
        int sum= 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }


    public static void main(String[] args) {
        sumofarray();
    }

}
