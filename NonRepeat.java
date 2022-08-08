import java.util.HashMap;
import java.util.Map;


public class NonRepeat {
    public static int NonRepeatElement(int arr[], int n){
        int result=0;
        Map<Integer, Integer> ans = new HashMap<Integer,Integer>();
        for(int i = 0;i<n;i++){
            if(!ans.containsKey(arr[i])){
                ans.put(arr[i], 1);
            }
            else{
                ans.put(arr[i], ans.get(arr[i])+1);
            }
        }
        for(int i = 0;i<n;i++){
            if(ans.get(arr[i])==1){
                result = arr[i];
                break;

            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]= {1,5,2,3,4,3,5,2,6,1};
        int n = arr.length;
        System.out.println(NonRepeatElement(arr,n));
    }
    
}
