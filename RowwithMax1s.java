public class RowwithMax1s {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
              int ones=0;
       int max=0;
       int ans=-1;
       for(int i=0;i<n;i++){
           int j=0;
           for(j=0;j<m;j++){
               if(arr[i][j]==1)
               ones++;
           }
           if(ones>max){
               max=ones;
               ans=i;
           }
           ones=0;
       }
       return ans;
    }
    
}
