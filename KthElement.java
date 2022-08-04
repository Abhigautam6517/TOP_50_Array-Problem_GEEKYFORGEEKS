import java.util.Arrays;

public class KthElement {
    public static int KthElements(int arr[],int k){
        Arrays.sort(arr);
      
        return arr[k-1];

    }
    public static void main(String[] args) {
        int arr [] = {40,50,30,80,90,10,100,50,80};
        int k =4;
        System.out.println(KthElements(arr,k));
    }
    
}
