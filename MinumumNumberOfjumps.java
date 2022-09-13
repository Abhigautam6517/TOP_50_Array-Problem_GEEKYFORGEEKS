public class MinumumNumberOfjumps {
    static int minJumps(int[] arr){
        // your code here
        int jump = 0;
        int pos = 0;
        int des = 0;
        int n = arr.length;
          if(arr[0] == 0 && n>1) return -1;
        
        if(n == 1) return 0;
        
        for(int i = 0;i<arr.length-1;i++){
            des = Math.max(des,arr[i]+i);
            if(pos==i){
                pos = des;
                jump++;
            }
        }
        return jump;
        
    }
    
}
