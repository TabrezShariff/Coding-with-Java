// hashing numerical values based on thier repeatance inside hash array
import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[5];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        int q;
        q = sc.nextInt();
        while (q > 0) {
            int inp = sc.nextInt();
            System.out.println(hash[inp]);
            q--;
        }

    }
}
