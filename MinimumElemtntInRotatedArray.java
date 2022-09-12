import java.util.Arrays;

public class MinimumElemtntInRotatedArray {
    public static int findMin(int arr[], int n){
        {
            Arrays.sort(arr);
            int first = arr[0];
            return first;
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,1,2,3};
        int n = arr.length;
        System.out.println(findMin(arr, n));
    }
    
}
