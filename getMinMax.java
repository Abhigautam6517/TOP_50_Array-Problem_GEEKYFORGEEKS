import java.util.Arrays;
import java.util.List;

public class getMinMax {
    public static List<Integer> get(int arr[],int n){
        int max = arr[0];
        int min = arr[0];
        for(int i = 1;i<n;i++){
            if(arr[i]<max){
                max =arr[i];
            }
            if(arr[i]>min){
                min =arr[i];
            }
           
        }
        return Arrays.asList(max,min);
    }
    public static void main(String[] args) {
        int arr [] = {40,50,30,80,90,10,100,50,80};
        int n = arr.length;
        System.out.println( get(arr,n));
    }
    
}
