public class MaximumSubarraySum {
    


class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            curSum = curSum + arr[i];
            if(curSum>maxSum){
                maxSum=curSum;
            }
            if(curSum<0){
                curSum=0;
                
            }
        }
        return maxSum;
        
    }
    
}
    
}
