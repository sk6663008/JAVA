package Arrays_;

public class max_of_array {
   static void maxarray(){
        int []arr = {3,5,9,2,7,6};
        int ans = 0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]> ans){
               ans = arr[i];
           }
       }
       System.out.println(ans);
    }

    public static void main(String[] args) {
       maxarray();
    }
}

