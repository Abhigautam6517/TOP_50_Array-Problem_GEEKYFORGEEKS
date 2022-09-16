import java.util.Arrays;

public class MajorityElement {
    static int majorityElement(int a[], int size)

    {

       

        Arrays.sort(a);

        int count;

        int majority = a.length / 2;

 

        for (int i = 0; i < a.length; i++) {

            count = 1;

 

            while (i < a.length - 1 && a[i] == a[i + 1]) {

                count++;

                i++;

            }

 

            if (count > majority) {

                return a[i];

            }

        }

        return -1;

    }
    public static void main(String[] args) {
       int N = 3 ;
        int A[] = {1,2,3} ;
        majorityElement(A,N);

    }
    
}
