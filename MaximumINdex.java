public class MaximumINdex {
    public static int maxIndex(int[] arr, int n){
        int index = 0;
        int max = arr[0];
        for(int i = 1;i<n;i++){
            if(max<arr[i]){
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int arr[] = {65 ,6 ,74 ,94,56,89,9,63,75,25 ,34 ,68,93 ,48 ,16};
        int n = arr.length;
       System.out.println(maxIndex(arr,n));
    }
    
}
