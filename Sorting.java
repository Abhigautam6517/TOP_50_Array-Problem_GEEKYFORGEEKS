public class Sorting {
    public static void sort(int arr[]){
        // int k = 0;
        // int temp = 0;
         int n = arr.length;
        
        for(int i = 1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > key){
                arr[j+1]=arr[j];
                j=j-1;

                

            }
            arr[j+1]=key;
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
  
        System.out.println();
    }
  

    public static void main(String[] args) {
        int arr[] = {10,5,21,20,10,2};
        int n = arr.length;
        sort(arr);
        printArray(arr);
    }
    
}
