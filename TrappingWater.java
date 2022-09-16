public class TrappingWater {
    static long trappingWater(int arr[], int n) { 
        // Your code here
      
        int leftmax[]= new int [n];
        int rightmax[]= new int [n];
        int max = 0;
        int totalwater = 0;
        
        for(int i = 0;i<n;i++){
            max= Math.max(max, arr[i]);
            leftmax[i] = max;
        }
        max = 0;
        
        for(int i = n-1;i>=0;i--){
            max= Math.max(max, arr[i]);
            rightmax[i] = max;
        }
        for(int i = n-1;i>=0;i--){
            int water = Math.min(leftmax[i],rightmax[i])-arr[i];
            totalwater+=water;
            
        }
      return totalwater;
    } 
    
}
