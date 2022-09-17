public class SumPairOFcloset {
    int[] sumClosest(int[] arr, int x) {
        // code here 
             int ans[]=new int[2];
       
       int lo=0;
       int hi=arr.length-1;
       ans[0]=arr[0];
       ans[1]=arr[1];
       while(lo<hi){
           int s1=ans[0]+ans[1];
           int s=arr[lo]+arr[hi];
           if(Math.abs(x-s)<Math.abs(x-s1))
           {
               ans[0]=arr[lo];
               ans[1]=arr[hi];
           }
           
           if(s>x){
               hi--;
               
           }
           else
           lo++;
       }
       return ans;
    
    }
    
}
