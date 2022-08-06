import java.util.Arrays;

public class MissingNumber {
    public static int missingNumber(int arr[],int n){
       int sn = (n*(n+1))/2;
       int sa = 0;
       for(int i = 0;i<n-1;i++){
        sa+=arr[i];
       }
       return sn-sa;
    }  
   

public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        int n = arr.length;
        System.out.println(missingNumber(arr, n));
    }
    
}
