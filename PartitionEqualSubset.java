public class PartitionEqualSubset {
    static int equalPartition(int n, int arr[])
    {
        int sum = 0;
        for(int a: arr)
            sum+=a;
        if(sum%2 !=0)
            return 0;
        sum=sum/2;
        int dp[][]= new int[n+1][sum+1];
        dp[0][0]=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=sum;j++){
                if(dp[i][j]==1){
                    dp[i+1][j]=1;
                    if(j+arr[i]==sum)
                        return 1;
                    if(j+arr[i]<sum)
                        dp[i+1][j+arr[i]]=1;
                }    
               
           }
       }
       return dp[n][sum];
    }
    
}
