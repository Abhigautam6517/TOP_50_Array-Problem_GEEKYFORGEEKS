public class moveNegativeElement{

    public static void Move(int arr[],int n){
        int[] arr2 = new int[n];
        int next = 0;
        int rev = n-1;
        for(int i = 0;i<n;i++){
            
            if(arr[i]>0){
                arr2[next] = arr[i];
                next+=1;
            }
            if(arr[i]<0){
                arr2[rev] = arr[i];
                rev-=1;
            }
          
        }
        print(arr2,n);
    }
    public static void print(int[] arr2,int n){ 
        for(int i = 0;i<n;i++){
            
            System.out.println("The Element are"+arr2[i]);
        }
    }
    public static void main(String[] args) {
        // int arr[] = {1,-1,3,2,-7,-5,11,6};
        int arr[] ={-8,9,5,10,2,6,-7,7};
        int n = arr.length;
        Move(arr,n);
       
    }
}