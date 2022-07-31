public class Frequency {
    public static int frequency(int arr[],int find,int n){
        int count = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]==find){
                count++;
            }
        }
        return count;
        
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,4,2,5,1,1,1,2,5,2,5,1,1};
        int find = 2;
        int n  = arr.length;
       System.out.println(frequency(arr,find,n));
    }
    
}
