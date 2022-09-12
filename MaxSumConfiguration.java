public class MaxSumConfiguration {

    static int max_sum(int A[], int n)
   {
    int sum = 0 , lastValue =0;
    for(int i : A)
        sum += i;
    for(int i =0 ; i < n; i++)
        lastValue += i * A[i];
    int max = lastValue;
    for(int i = n-1; i >= 0 ; i--){
        lastValue = lastValue -  A[i]*(n-1) + (sum - A[i]);
        if(max < lastValue)
            max = lastValue;
    }
    return max;
   }
    public static void main(String[] args) {
        int A[] = {8,3,1,2};
        int n = A.length;
        System.out.println(max_sum(A,n));


        
    }
    
}
