public class PrimeNum {
    public static void main(String[] args) {
        int n = 17, count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
                if (n / i != 0) {
                    count++;
                }
            }
        }
        if (count == 2)
            System.out.println("Prime");
        else
            System.out.println("Not prime");
    }
}
