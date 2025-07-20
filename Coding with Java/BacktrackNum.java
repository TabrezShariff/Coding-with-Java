public class BacktrackNum {
    public static void backtrack(int i, int n) {
        if(i < 1) return;
        backtrack(i-1, n); // number is printed from the end of the chain of recursion
        System.out.println(i); // so ordered from 1 to n
    }
    public static void main(String[] args) {
        backtrack(5, 5);
    }
}
