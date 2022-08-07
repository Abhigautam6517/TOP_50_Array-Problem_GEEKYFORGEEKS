import java.util.ArrayList;

class DuplicateElement{
    public static void duplicateElement(int arr[],int n){
      
    ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    result.add(arr[i]);
                    
                }
            }
            
        }
        System.out.println(result);
       
    }
    public static void main(String[] args) {
        int arr[]={1,0,2,2,2,10,10,12};
        int n = arr.length;
        duplicateElement(arr,n);
       
    }
}