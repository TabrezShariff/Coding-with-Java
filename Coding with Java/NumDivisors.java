import java.util.*;
import java.util.Collections;

public class NumDivisors {
    public static void main(String[] args) {
        int N = 36;
        ArrayList<Integer> set1 = new ArrayList<>();
        ArrayList<Integer> set2 = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                set1.add(i);
                if (N / i != i) {
                    set2.add(N / i);
                }
            }

        }
        for (int elem : set1)
            System.out.println(elem);
        Collections.reverse(set2);
        for (int elem : set2)
            System.out.println(elem);
    }
}
