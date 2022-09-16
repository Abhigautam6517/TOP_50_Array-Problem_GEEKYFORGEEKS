import java.util.Arrays;
import java.util.HashSet;

public class Longestconsesutativesubsequence {
    
        // add your code here
        static int findLongestConseqSubseq(int arr[], int N)
        {
           HashSet<Integer> hs = new HashSet<>();
           
           for(int i=0;i<N;i++){
               hs.add(arr[i]); 
           }
           int ans=0;
           for(int i=0;i<N;i++){
               if(!hs.contains(arr[i]-1)){
                   int curr = arr[i];
                   int count=1;
                   
                   while(hs.contains(curr+1)){
                       curr++;
                       count++;
                   }
               
               ans=Math.max(ans,count);
               }
           }
           return ans;
           
        }
        public static void main(String[] args) {
            int arr[] = {1,2,3,4,5};
            int n = arr.length;
            System.out.println(findLongestConseqSubseq(arr,n));
            
        }
    
}
