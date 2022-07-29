public class ReverseArray {
    public static void ArrayReverse(int arr[],int n){
        int k = 0;
        for(int i =arr.length-1;i>0;i--){
            arr[k]=arr[i];
            k = k+1;

        }
        return ;

    }

    public static void print(int arr[],int n){
        for(int index = 0; index < arr.length; index++) {
            int num = arr[index];
            System.out.println(num);
        }
        return ;

    }
    public static void main(String[] args) {
        int arr [] = {40,50,30,50,80};
        int n = arr.length;
        ArrayReverse(arr,n);
        print(arr,n);
    }
    
}
