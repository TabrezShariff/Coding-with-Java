public class FIbonacciSearch {
    public int fib(int n) {
        int num_last, num_second_last;
        if (n <= 1) {
            return n;
        }
        num_last = fib(n - 1);
        num_second_last = fib(n - 2);
        return (num_last + num_second_last);
    }
}
