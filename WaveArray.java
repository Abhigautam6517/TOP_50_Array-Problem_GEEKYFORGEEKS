public class WaveArray {
    public static void convertToWave(int n, int[] a) {
        for (int i = 0; i < n - 1; i += 2) {
            int t = a[i];
            a[i] = a[i + 1];
            a[i + 1] = t;
        }
    }
    public static void main(String[] args) {
        int n = 6;
        int arr[] = {2,4,7,8,9,10};
        convertToWave(n, arr);
    }
}
     
    

