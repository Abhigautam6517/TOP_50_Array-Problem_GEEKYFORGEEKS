import java.util.Arrays;

public class SmallPosititveInteger {
     

long smallestpositive(long[] array, int n){ 
    Arrays.sort(array);
    long missing=1;
    for(int i=0;i<n;i++){
        if(missing<array[i]){
            return missing;
        }
        else{
            missing+=array[i];
        }
    }return missing;
}
    
}
