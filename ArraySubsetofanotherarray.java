import java.util.HashMap;

public class ArraySubsetofanotherarray {
    public String isSubset( long a1[], long a2[], long n, long m) {

        HashMap<Long,Integer> h=new HashMap<>();

        for(int i=0;i<n;i++){

            h.put(a1[i],h.getOrDefault(a1[i],0)+1);

        }

        for(int i=0;i<m;i++){

            if(h.containsKey(a2[i])==false || h.get(a2[i])==0){

                return "No";

            }

            else{

                h.put(a2[i],h.get(a2[i])-1);

            }

        }

        return "Yes";

    }

    
}
