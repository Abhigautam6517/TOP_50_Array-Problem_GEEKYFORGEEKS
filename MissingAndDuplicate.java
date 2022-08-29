import java.util.Arrays;

public class MissingAndDuplicate { 
    static int[] findTwoElement(int arr[], int n) {
        // code here
     Arrays.sort(arr);
   
      int x=0;
      int y=0;
      int sum=0;
      int sumarr=0;
      
      for(int i=0;i<=n;i++)
      {
          sum=sum+i; //final sum
          
      }
      for(int i=0;i<n;i++)
      {
          sumarr=sumarr+arr[i]; //arr sum
          
      }
      
      for(int i=0;i<n-1;i++)
      {
          if(arr[i]==arr[i+1])
          {
              x=arr[i];
          }
      }
      
      sumarr-=x; //duplicate minus
      y=sum-sumarr; //missing number
      
      int[] ans=new int[2];
      ans[0]=x;
      ans[1]=y;
      
      return ans;
    }

    
    public static void main(String[] args) {
        int arr[]={1,2,2,4};
        int n = arr.length;
        findTwoElement(arr,n);
        
    }
    
}
