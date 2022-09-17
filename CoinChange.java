public class CoinChange {
    public long count(int coins[], int N, int sum) {
        // code here.
        long ar[]=new long[sum+1];
        for(int i=0;i<ar.length;i++){
            if(i%coins[0]==0)
            ar[i]=1;
        }
              
        
        for(int i=1;i<N;i++){
            for(int j=0;j<ar.length;j++){
                if(coins[i]<=j){
                    ar[j]=ar[j]+ar[j-coins[i]];
                }
        
            }
                   
        }
 
        return ar[sum];
    }
    
}
