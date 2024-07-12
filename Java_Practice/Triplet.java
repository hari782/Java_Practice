import java.util.*;
public class Triplet {
    public static int countTriplet(int[] ar, int n) {
        Arrays.sort(ar);
        int c = 0;
        for (int i = n - 1; i >= 0; i--) {
            int k = 0;
            int j = i - 1;
            while (k < j) {
                if (ar[k] + ar[j] == ar[i]) {
                    c++;
                    k++;
                    j--;
                } else if (ar[k] + ar[j] < ar[i]) {
                    k++;
                } else {
                    j--;
                }
            }
        }
        
        return c;
    }
    public static void main(String[] args) {
        int[] ar1 = {1, 5, 3, 2};
        int b = ar1.length;
        System.out.println("Output: " + countTriplet(ar1, b)); 
        int[] ar2 = {2, 3, 4};
        int b2 = ar2.length;
        System.out.println("Output: " + countTriplet(ar2, b2)); 
    }
}
