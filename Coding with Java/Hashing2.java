// hashing for string characters based on thier repeatance inside hash array
import java.util.*;

public class Hashing2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a'] += 1;
        }

        int q = sc.nextInt();
        while (q > 0) {
            char inp;
            inp = sc.next().charAt(0);
            System.out.println(hash[inp - 'a']);
            q--;
        }
    }
}
