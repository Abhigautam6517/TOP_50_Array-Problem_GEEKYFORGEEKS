class PeakElement{
    public static int Peak(int arr[],int n){
        int key = 0;
        for(int i = 0;i<n-1;i++){
            if(arr[i]<arr[i+1]){
                key = i+1;
            }
            
        }
        return key;
        

    }
    public static void main(String[] args) {
        int arr[] = {4,1,10,2,6,12};
        int n = arr.length;
        int element = Peak(arr,n);
        System.out.print("Peak Element of index is"+" "+element);
    }
}