public class NumRev {
    public static void main(String[] args) {
        int n = 9535, l_d;
        while (n > 0) {
            l_d = n % 10;
            System.out.print(l_d);
            n = n / 10;
        }

    }
}