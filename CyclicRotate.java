public class CyclicRotate {
    public static void rotate(int arr[], int n){
        int key = arr[n-1];
        for(int i = n-1; i>=1;i--){
            
            arr[i]=arr[i-1];
        }
        arr[0] = key;

    }
    public static void print(int[] arr,int n){ 
        for(int i = 0;i<n;i++){
            
            System.out.println("The Element are"+arr[i]);
        }
    }
  
    public static void main(String[] args) {
        int arr[] = {1,5,8,9,10};
        int n  = arr.length;
        rotate(arr,n);
        print(arr, n);
    }
    
}
