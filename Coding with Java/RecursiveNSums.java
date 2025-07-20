public class RecursiveNSums {
    public static void Sum(int n, int sum) {
        if (n < 1) {
            System.out.println(sum);
            return;
        }
        Sum(n - 1, sum + n);
    }

    public static void main(String[] args) {
        Sum(10, 0);
    }
}
