import java.util.*;
public class LinkedList1 {
    public static List<Integer> reverse (List<Integer> inp, int f) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < inp.size(); i += f) {
            List<Integer> list = inp.subList(i, Math.min(i + f, inp.size()));
            Collections.reverse(list);
            result.addAll(list);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Enter the elements in a list: ");
        Scanner s = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 8; i++) {
            list.add(s.nextInt());
        }
        System.out.print("Enter k value: ");
        int k = s.nextInt();
        List<Integer> output = reverse(list, k);
        System.out.println("Output: " + output);
    }
}