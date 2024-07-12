import java.util.*;
public class LinkedList2 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int[] ar = new int[5];
        for(int i=0; i<5;i++){
            ar[i] = s.nextInt();
        }
        int[] a = {1,2,3,4,5};
        for(int i=0;i<5;i++) {
                ar[i] = ar[i] - a[0];
                System.out.print(ar[i]+" ");
        }
    }
}