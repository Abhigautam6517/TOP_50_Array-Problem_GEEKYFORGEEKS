import java.util.Stack;

public class StockSpanProblem {

     public static int[] calculateSpan(int price[], int n)
     {
         // Your code here
         int[] ans=new int[n];
        ans[0]=1;
        Stack<Integer> st=new Stack<>();
        st.push(0);
        
        for(int i=1; i<n; i++)
        {
            while(st.size()>0 && price[i]>=price[st.peek()])
            {
                st.pop();
            }
            
            if(st.size()==0)
            {
                ans[i]=(i+1);
            }
            else
            {
                ans[i]=i-st.peek();
            }
            
            st.push(i);
        }
        return ans;
    }
 
    
}
