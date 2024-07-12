import java.util.*;
public class minimumdifference {
    public static int findMinDifference(int[] ar) {
        Arrays.sort(ar);
        int mindif = Integer.MAX_VALUE;
        for (int i = 1; i < ar.length; i++) {
            int dif = ar[i] - ar[i - 1];
            if (dif < mindif) {
                mindif = dif;
            }
        }
        return mindif;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of an array:");
        int n = s.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            ar[i] = s.nextInt();
        }
        try {
            int mindif = findMinDifference(ar);
            System.out.println("The difference is " + mindif);
        } catch (Exception e) {
        }
    }
}
